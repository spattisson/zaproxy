# Introduction

The `WebSockets` extension was developed within the Google Summer of Code 2012. This page should give developers an insight how it is structured.

The extension is built upon RFC6455, featuring version 13 of the `WebSocket`-protocol. The focus of this implementation lies on the payloads. As a result the user interface is transparent regarding `WebSocket`-frames.

Originally I wanted to build the extension upon Java's NIO features, that allows non-blocking reads. It worked fine for non-SSL connections, but I was not able to transform the `javax.net.ssl.SSLSocket`, that comes out of the modified `commons-httpclient-3.1.jar` library to a `java.nio.channels.SocketChannel` with some instance of `javax.net.ssl.SSLEngine`, as this would have been the way to go with NIO.

As a result each `WebSocket` channel consists of two threads:
  * one listener on the outgoing connection from your browser to ZAP
  * another listener on the incoming connection from the web server to ZAP


# Database

Messages received are stored into the database. There are 3 tables so far:
  * _websocket\_channel_: stores information about each connection
  * _websocket\_message_: contains information about each message received & sent
  * _websocket\_message\_fuzz_: if `WebSocket` messages are issued with the _fuzz_-extension, additional information is stored here

```
CREATE CACHED TABLE websocket_channel (
    channel_id BIGINT PRIMARY KEY,
    host VARCHAR(255) NOT NULL,
    port INTEGER NOT NULL,
    url VARCHAR(255) NOT NULL,
    start_timestamp TIMESTAMP NOT NULL,
    end_timestamp TIMESTAMP NULL,
    history_id INTEGER NULL,
    FOREIGN KEY (history_id) REFERENCES HISTORY(HISTORYID) ON DELETE SET NULL ON UPDATE SET NULL
);

CREATE CACHED TABLE websocket_message (
    message_id BIGINT NOT NULL,
    channel_id BIGINT NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    opcode TINYINT NOT NULL,
    payload_utf8 CLOB NULL,
    payload_bytes BLOB NULL,
    payload_length BIGINT NOT NULL,
    is_outgoing BOOLEAN NOT NULL,
    PRIMARY KEY (message_id, channel_id),
    FOREIGN KEY (channel_id) REFERENCES websocket_channel(channel_id)
);

ALTER TABLE websocket_message ADD CONSTRAINT websocket_message_payload CHECK (
    payload_utf8 IS NOT NULL
      OR
    payload_bytes IS NOT NULL
);

CREATE CACHED TABLE websocket_message_fuzz (
    fuzz_id BIGINT NOT NULL,
    message_id BIGINT NOT NULL,
    channel_id BIGINT NOT NULL,
    state VARCHAR(50) NOT NULL,
    fuzz LONGVARCHAR NOT NULL,
    PRIMARY KEY (fuzz_id, message_id, channel_id),
    FOREIGN KEY (message_id, channel_id) REFERENCES websocket_message(message_id, channel_id) ON DELETE CASCADE
);
```

These tables are created in the class `TableWebSocket`, if not existed before.

Things to note:
  * Primary key values are created within the application with instances of `java.util.concurrent.atomic.AtomicInteger`, see `WebSocketProxy.channelIdGenerator`, `WebSocketProxy.messageIdGenerator` & `WebSocketFuzzableTextMessage.fuzzIdGenerator`.
  * `websocket_channel.history_id` may link to the HTTP message of the `WebSocket` handshake.
  * `websocket_channel.host` and `websocket_channel.url` are not the same. The first field contains the result of _`Socket.getInetAddress().getHostName()`_, while the latter contains the requested URL of the `WebSocket` handshake.
  * `websocket_message` contains two columns for payloads, namely `payload_utf8` and `payload_bytes`. For _binary_-opcode messages the column `payload_bytes` is filled. For all other types of messages, the column `payload_utf8` is set with the readable representation. This way, integration into the _search_-extension should be easier. The constraint `websocket_message_payload` ensures that at least one of these columns is set. An upgrade from HSQLDB version 1.8.0 to 2.2.9 was made to take advantage of the CLOB/BLOB fields:
    * Only a reference to the _large object_'s content is returned, allowing you to retrieve only a substring, respectively only some bytes. This is used in the payload preview of the `WebSockets`-tab.


# Class Diagram

## Core
The first class diagram contains the core part without integration into _brk_- or _fuzz_-extension nor with UI classes.

<a href='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/websocket_core-part.PNG'><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/websocket_core-part.PNG' width='800' /></a>

Let us start with _`ExtensionWebSocket`_, which is the starting point of my contribution. It initializes all components and hooks them into ZAP. When a new `WebSocket`-connection is detected in the _`ProxyThread`_ class, the following call takes place:
```
ExtensionWebSocket extWs = (ExtensionWebSocket) Control.getSingleton().getExtensionLoader().getExtension(ExtensionWebSocket.NAME);
extWs.addWebSocketsChannel(msg, inSocket, outSocket, outReader);
```

It takes the incoming & outgoing socket, the _`HttpMessage`_ of the `WebSocket`-handshake and the current _`InputStream`_ of the outgoing connection, which was used to read the HTTP response. This is of importance, as first `WebSocket`-messages are allowed to appear in the same TCP packet after the HTTP response. As it may buffer bytes, first messages would be lost if opening another _`InputStream`_ on _`outSocket`_.

The _`ExtensionWebSocket`_ creates a new instance of _`WebSocketProxy`_ via the factory method `WebSocketProxy.create(...)`, that returns a version specific _`WebSocketProxy`_ instance. For now _`WebSocketProxyV13`_ is the only implementation of the abstract class _`WebSocketProxy`_. It contains an inner class _`WebSocketMessageV13`_ extending the abstract class _`WebSocketMessage`_.

Each _`WebSocketProxy`_ instance creates two instances of _`WebSocketListener`_. These instances are threads listening to one of the given `Socket`'s. If the first byte arrives, it calls _`WebSocketProxy.processRead(...)`_ that handles the received `WebSocket` frame.

The _`WebSocketProxy`_ class implements the _Observer_-pattern, allowing instances of _`WebSocketObserver`_ to get notified about new _frames_ or a change of the _`WebSocketProxy`_'s _state_. The following observers are used so far (with order value in parenthesis):
  * _`ExtensionFilter`_ (0): Calls all enabled _`Filter`_ instances, allowing them to change e.g.: the payload. There is a `WebSocket`-specific filter called _`FilterWebSocketPayload`_, that is added to the `Filter`-extension in the _`ExtensionWebSocket.hook(...)`_ method.
  * _`WebSocketProxyListenerBreak`_ (95): Halts if a breakpoint applies and possibly changes payload.
  * _`WebSocketStorage`_ (100): Utilizes _`TableWebSocket`_ to store channels and messages into the database.
  * _`WebSocketPanel`_ (105): Shows channels and their messages in the user interface under the _`WebSockets`-tab.
  *_`WebSocketFuzzerHandler`_(110): Shows fuzzed messages in the user interface under the_fuzz_-tab._

As you can see, this mechanism is a very powerful way to get informed about what is going on. In the class diagram you can see that each instance of _`WebSocketProxy`_ has got its own _`observerList`_. If you want to observe all instances you have to add your _`WebSocketObserver`_ implementation to the _`ExtensionWebSocket.allChannelObservers`_ list. Do the following in your _`Extension*`_ class:
```
@Override
public void hook(ExtensionHook extensionHook) {
	// 'this' implements WebSocketObserver
	extensionHook.addWebSocketObserver(this);
}
```
With the first `WebSocket`-connection arriving, the hooked observers are added to the _`ExtensionWebSocket.allChannelObservers`_ list. Each time a new _`WebSocketProxy`_ instance is created, every observer from this list is added to the _`WebSocketProxy.observerList`_.

`WebSocket` messages are processed in _`WebSocketProxy.processRead(...)`_ as mentioned before. There are several types of messages, which is specified by the 4-bits opcode header:
  * non-control frames
    * _binary_
    * _text_
  * control frames
    * _close_
    * _ping_
    * _pong_

A non-control message may be split up across several frames. For this purpose a _continuation_ frame is sent, resuming the last _binary_- or _text_-frame. In between arbitrary control frames are allowed to occur.

To achieve some loose coupling, I have introduced the _`*DTO`_ classes, namely _`WebSocketChannelDTO`_ & _`WebSocketMessageDTO`_. DTO stands for Data Transfer Object. They can be retrieved via:
  * _`public WebSocketMessageDTO WebSocketMessage.getDTO();`_
  * _`public WebSocketChannelDTO WebSocketProxy.getDTO();`_
  * with various methods from the _`TableWebSocket`_
These DTO-objects are in use across the `WebSocket`-extension.


## User Interface

<a href='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/websocket_ui-part.PNG'><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/websocket_ui-part.PNG' width='800' /></a>

The main class is _`WebSocketPanel`_, which represents the _`WebSockets`_-tab. It contains all the UI elements visible there. The most important ones are:
  * _`WebSocketPanel.channelSelectModel`_ which is filled with all `WebSocket` channels. Via _`WebSocketPanel.getChannelComboBoxModel()`_ you can retrieve an instance of _`ClonedComboBoxModel`_, whose items are backed by the original model, i.e. if the original `ComboBox` changes, also the cloned version changes. The _`ClonedComboBoxModel`_ is used for various dialogues.
  * _`handshakeButton`_: When a channel is selected in the `ComboBox`, this button is enabled. It allows the `HttpMessage` from the handshake to be shown in Request/Response tab.
  * _`brkButton`_: See [\_brk\_-extension integration](#brk) for more information.
  * _`filterButton`_: Opens up the _`filter.FilterWebSocketReplaceDialog`_ allowing to change the type of messages shown in the _`WebSockets`_-tab.
  * _`optionsButton`_: Opens up the options dialogue defined by _`OptionsWebSocketPanel`_. It is backed by the _`OptionsParamWebSocket`_, which is the interface to the saved settings.
  * _`messagesView`_: This instance of _`WebSocketMessagesView`_ wraps a `JTable` containing all `WebSocketMessages`. The model behind the `JTable` is given by an instance of _`WebSocketMessagesViewModel`_.

_`WebSocketMessagesViewModel`_ extends the _`PagingTableModel`_, which holds only _`PagingTableModel.MAX_PAGE_SIZE`_ entries in cache at any point in time, but the row count returns the total number of messages to be shown, resulting in a scrollbar that reflects a table containing all entries. When scrolling, or when new messages arrive, a new page is loaded from database. While in load, place-holder values are shown in the rows. In _`WebSocketMessagesViewModel.getRowCount()`_ the number of rows is cached to save some queries.
The _`WebSocketFuzzMessagesViewModel`_ does also extend _`WebSocketMessagesViewModel`_ as its entries are also stored in the database. See the [\_fuzz\_-extension integration](#fuzz) for more information.

There is another useful helper class, named _`WebSocketUiHelper`_. It has got methods that create UI elements for selecting channels, opcodes and direction. It is used by various dialogues and came into existence to bring up more consistency across dialogues:
  * _`WebSocketBreakDialog`_: specify custom conditions for breakpoints
  * _`FilterWebSocketReplaceDialog`_: allows to replace `WebSocket` payload using defined pattern
  * _`WebSocketMessagesViewFilterDialog`_: restrict types of messages to be shown in the `WebSockets` tab


# extension integration
## filter
The _`FilterWebSocketPayload`_ class allows for modification of `WebSocket`-payloads on specific messages. It is set up in the _`ExtensionWebSocket.hook(...)`_ method. It overwrites the method _`onWebSocketPayload(...)`_ and modifies a messages' payload if criteria are met. The _`ExtensionFilter`_ implements _`WebSocketObserver`_ and calls _`onWebSocketPayload(...)`_ when a message arrives.


## brk
There are several options for the break-behaviour of `WebSocket` messages. These options are enforced in the _`WebSocketBreakpointMessageHandler`_ class. The decision if ZAP should hold on the arrival of a specific message, i.e. if a breakpoint applies, is reached in _`WebSocketBreakpointMessage.match(...)`_. Beforehand _`WebSocketProxyListenerBreak.onMessageFrame(...)`_ does some initial checks before passing on the power of decision.


## fuzz
The _Fuzzer_-tab is able to show a messages view that inherits from the view in the _`WebSockets`_-tab. The correspondent classes are _`WebSocketFuzzMessagesView`_ with its model class _`WebSocketFuzzMessagesViewModel`_. The view model is also backed by the database. The table `websocket_message_fuzz` is used to provide more information on the fuzzed messages. Unsuccessful fuzzed messages do not pass the _`WebSocketStorage`_ class, that is responsible for saving messages into database. As a result there is an extra list for failed messages in _`WebSocketFuzzMessagesViewModel.erroneousMessages`_. A reason for unsuccessful fuzzing attempts may be closed `WebSocket`-channels.

_`WebSocketFuzzMessageDTO`_ extends _`WebSocketMessageDTO`_ and holds additional information on the fuzzing process. When an instance of _`WebSocketFuzzMessageDTO`_ arrives at the _`WebSocketStorage`_ class, additional information is saved to the `websocket_message_fuzz`-table.
You can not only retrieve a _DTO_-object from a _`WebSocketMessage`_, but also create a _`WebSocketMessage`_ from a _`WebSocketMessageDTO`_. The given _DTO_-object is saved as base-DTO in the _`WebSocketMessage`_. When you retrieve the _DTO_-object from a _`WebSocketMessage`_ no new _`WebSocketMessageDTO`_ instance is created, but the base-DTO is returned with current values. This mechanism is used to integrate the fuzzing of `WebSocket` messages.