# WebSocket Scanner Infrastructure [4276](https://github.com/zaproxy/zaproxy/issues/4276)

**Mentors:** [Simon Bennetts](https://twitter.com/psiinon), Ricardo Pereira, [Rick Mitchell](https://twitter.com/kingthorin_rm)


This project aims to support for Scans to WebSocket extension of ZAP.
WebSockets is a very recent protocol, which was standardized in 2011. One of
the basic features of WebSocket is establishing a connection over TCP and
remaining open. In that way it allows the server and the client to create a
full-duplex communication channel, thus allowing both of them to truly
communicate asynchronously. This is the biggest advantage of WebSocket contrary
to traditional Ajax Request/Response. That is the reason the WS is suitable for
chats, messages notifications, monitoring etc. Furthermore, in recent years WS
protocol was used widely over the web applications. With the current version of
ZAP we are able to intercept and show WS payloads, set breakpoint on specific
types of WS’s payloads and fuzz payloads. Also, ZAP WS add-on is considered as a
reliable tool for WS communication analysis and debugging.

WebSocket Protocol comes with many differences in reference to Http protocol.
The most common is the format of the messages/payloads. In contrast with
HTTP, WebSocket protocol does not define the specific format of the messages
will be transmitted over the TCP connection. That means at the same connection
may be transferred messages with a different format. In addition, WebSocket
protocol keeps the TCP connection opened in order to offer us a full duplex
client/server communication in contrast with the classic request/response
technique. Those are the most challenging parts which are tried to overcome by
this Project. In any other case, this implementation attempts to emulate the
existing HTTP scanner.

We were aiming to implement an easy to extend infrastructure in order to support
active and passive scans. The implementation has to support easy addition of plugins.
As also it should offer them some utilities in order to help developers create easy
scans to WebSocket protocol. In addition, after some meetings with my mentors
we decided to create a script plugin which will support those scans. ZAP has a
powerful feature which allows us to write scans via
scripting languages (Javascript, Python, Zest and Ruby). Let's dive into the project!

## Summarize my Work

Before starting to code for the infrastructure I had to resolve some issues as also
build some utilities will have been used for the infrastructure. And course we had to make some initial research.

## Add regex & non-regex filter on WebSockets[PR#1506](https://github.com/zaproxy/zap-extensions/pull/1506)

_(That was developed before coding period)_


## Find some Examples

As I mentioned before, WebSocket protocol it's a "nightmare" in reference to
payload format. We knew that before, so we decide to collect some examples about
WebSocket payloads. I created an html page (in my blog) where I have been collecting some
examples. You can check the examples in https://manosmagnus.github.io/data/websocket_examples/WebSocketExamples.html .

* **Add Method getPayloadAsString by replacing unmapped & malformed Chars [PR#1637](https://github.com/zaproxy/zap-extensions/pull/1637)**

  We find out that in many cases binary payloads hide some information about messages. So I decided to introduce a new method to read those "hidden" information of the binary payloads. We end up with something like this:

  _(More about implementation and how it works in PR)_

* **Export Websocket Communication to Emacs Org File [PR#104](https://github.com/zaproxy/community-scripts/pull/104)**

  I found out that beauty of ZAP is to do things automatically. I want to
  collect as many examples as I could without losing much time. So in the
  end, I write a simple python script in order to export whole WebSocket
  Communication to EmacsOrg format and make my html page quick, beautiful and
  easy. 

  _(More about implementation and how it works in PR)_

## (Re)Open WebSocket Connection

Another major work has to be done before start looking on scanner infrastructure is to manual establish a WebSocket connection. That was also requested from zap community [#4290](https://github.com/zaproxy/zaproxy/issues/4290)

As it is known ZAP behaves as an intercepting proxy server. That means your browser connection through the proxy. The proxy itself records all the communication between your browser and the web application. That provides you the contents of HTTP/S conversations.

ZAP has also the ability to act as client. We use ZAP as a client to perform some active scans. Until now we don't have the ability to establish webSockets connection from zap. In many cases, use ZAP as proxy comes with many restrictions in consequence of using browser and make manual testing.
 
In order to build a basic infrastructure for active scans, we should be able to establish a websocket connection. Re)Establishing a websocket connection comes with many "obstacles" should be passed. The first one I had to address was the heartbeat messages. Many Websocket applications implement heartbeat messages, called PING/PONG, to keep ebsocket connection alive. In general, WebSocket protocol comes with a standardized frame used for PING and PONGS which is specified in [RFC](https://tools.ietf.org/html/rfc6455#section-5.5.2).

_(Find more info about that in my blog [post](https://manosmagnus.github.io/#sec-2-1))_

*  **Websocket heartbeat messages are handled by WebSocket Proxy [PR#1686](https://github.com/zaproxy/zap-extensions/pull/1686)**

     This PR handles the PING/PONG messages in order to keep manual established
     WebSocket connection opened.

* **WebSocketUtils: Generate Sec-WebSocket-Key [PR#1691](https://github.com/zaproxy/zap-extensions/pull/1691)**

    Utilities to generate new Sec-WebSocket-Key.

* **Extract methods from ExtensionWebSocket to WebSocketUtils [PR#1697](https://github.com/zaproxy/zap-extensions/pull/1697)**

   Some minor changes on the core of WebSocket Extension.

* **Websocket Handshake Builder and Sender [PR#1689](https://github.com/zaproxy/zap-extensions/pull/1689)**

    Introduce a class in order to wrap up the Handshake Message and the available options. As also a class to send the Handshake and establish a new manual WebSocket Connection.

* **Reopen WebSocket Connection in order to send manual messages [PR#1618](https://github.com/zaproxy/zap-extensions/pull/1618)**

    This PR related mostly with the UI.

My work released by the core team in version 18 of WebSockets add-on.

![(Re)Establish WebSocket Connection](https://manosmagnus.github.io/data/png/open.gif)


## WebSocket Test Framework

A test framework with Nano-Httpd and some test created in order to test WebSocket extension.

* **Update Nano-Httpd to version 2.3.1 [PR#1700](https://github.com/zaproxy/zap-extensions/pull/1700)**

* **Websocket Test Utilities [PR#1703](https://github.com/zaproxy/zap-extensions/pull/1703)**

* **Tests for ServerConnectionEstablisher and WebSocketProxy [PR#1738](https://github.com/zaproxy/zap-extensions/pull/1738)**

## WebSocket Passive Scanner

* **[Websocket Passive Scan] Script Mechanism [PR#1718](https://github.com/zaproxy/zap-extensions/pull/1718)**

A basic infrastructure created to support passive scans on WebSocket protocol. Passive scan plugins are used to warn the user of potential vulnerabilities that can be detected passively - they are not allowed to send any message over the WebSocket channel or manipulate the messages in any way. Passive plugins run in a separate background thread so that they have as little effect on performance as possible. You can write passive scan rules either dynamically by using scripts or by extending the [WebSocketPassiveScanner](https://github.com/zaproxy/zap-extensions/pull/1718/files#diff-d20e9efd18e4b6cec20209c70f1a07ae)

  A plugin which allows users to write scripts was implemented. The script Plugin gives the ability to the users and developers write their own passive scan with scripting languages (python, javascript and ruby). In addition, infrastructure has the appropriate utilities to raise alerts if it's necessary. In order to create your passive scan, you have to implement the [WebSocketPassiveScript](https://github.com/zaproxy/zap-extensions/pull/1718/files#diff-31eba028511bf166cd091012f69c0f12) on your script. There are also available documented examples with [python](https://github.com/zaproxy/zap-extensions/pull/1718/files#diff-267d98ea0233319ef980b1d49eaef7c4) and [javascript](https://github.com/zaproxy/zap-extensions/pull/1718/files#diff-04c0c7ca9b213d492bff1cb804d7d7a8).

_(More info about the implementation in PR)_

![PScan example](https://manosmagnus.github.io/data/png/pscan.gif)

## WebSocket Active Scanner

Active scan rules attack the server and therefore are only run when explicitly invoked by the user.  

* **WebSocket TreeMap and Payload Analyzer [PR#1742](https://github.com/zaproxy/zap-extensions/pull/1742)**

Treemap is a formal way to represent the different components of a WebSocket communication. In addition, tree structure it's the most suitable way to iterate over the different messages. As I mentioned before, WebSocket protocol does not define a certain format of messages. So it was required to analyze all those different payloads on a "formal" structure. For this reason, I introduced two interfaces which developers can implement to analyze the structure of the messages ( [PayloadAnalyzer](https://github.com/zaproxy/zap-extensions/pull/1742/files#diff-1bfe23d36fc8e79c410247b5ba4c8f20) and[PayloadStructure](https://github.com/zaproxy/zap-extensions/pull/1742/files#diff-7feef61ddd998c294b0f219ffa1431e0)). I use those interface to create analyze JSON messages.

_(More info about Tree Map in PR)_

* **WebSocket active scan infrastructure [PR#1768](https://github.com/zaproxy/zap-extensions/pull/1768)** 

Last but not least the WebSocket active scanner. Active Scanner infrastructure based on WebSocket tree map. It provides the basic classes to developers in order to write active scan rules for websocket. Furthermore, a plugin was implemented in order to give the ability to user write their own active scans with scripting languages. To write your own script just implement the interface class [WebSocketActiveMessageScript](https://github.com/zaproxy/zap-extensions/pull/1768/files#diff-a22234459f1b3330d87a3c3d3b1743e0). There is also a Template script in [Javascript](https://github.com/zaproxy/zap-extensions/pull/1768/files#diff-2acec7b9c267afa6349ff6c80a76348e) 

 _(More info about active scan infrastructure in PR)_

![AScan Example](https://manosmagnus.github.io/data/png/ascan.gif)
    


