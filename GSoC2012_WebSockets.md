# Introduction

This project aims to adding support for `WebSockets` to ZAP. `WebSockets` are an upcoming standard that can be used for communication between browsers and web servers. The advantages of `WebSockets` are low overhead and a persistent full duplex channel. To ease development and testing of new applications (e.g.: `BrowserQuest`) ZAP should support `WebSockets`. As a result, one can see & even edit messages.



# Personal Details
My name is Robert Koch and I am enrolled into the master course _Software Engineering & Internet Computing_ at the _Vienna University of Technology_.

I love all security related courses. In the last semester we had to write a simple SSL stripper acting as an intercepting proxy to conduct a Man-in-the-Middle attack.

I'm familiar with Java as it is present in almost all programming related courses on the university. Additionally I learned a lot about SOA, Web Services, SCA & distributed systems in recent semesters. Most of the time we used Eclipse, Maven and Svn or Git for development in our group works.

My operating system is Ubuntu since 2005. I've also tried Fedora and `OpenSuse`, but I liked the Debian way most. My primary development hardware is my Lenovo T410 laptop.

# Scope & Schedule

## Feature list
  * capturing `WebSockets`-messages
    * messages are collected from various fragments
    * dealing not only with “ws://” but also with secure “wss://” `WebSockets` connections
  * display messages
    * filterable by
      * out- & ingoing messages
      * message type: beside text frames, there are also binary frames and several control frames (ping/pong/close).
    * nice-2-have: add beautifying support for JSON data
  * breakpoints:
    * set via sites panel, where WS connection is shown
    * set some custom Regex, that has to be fulfilled by a message in order to trigger the breakpoint
    * set via arrows “all incoming messages” and/or “all outgoing messages”
  * filters:
    * adding filters like the “Replace HTTP request body using defined pattern” for `WebSockets` as “Replace outgoing `WebSockets` messages using defined pattern”
      * another filter for incoming messages
  * various options for the settings dialogue (as they can be foreseen now) to:
    * capture also ping/pong messages
    * capture blacklist – avoid storing `WebSockets` messages for high-volume communication on specific domains (could also be implemented as opt-in, i.e. whitelist)
  * inject arbitrary messages (e.g. to close a connection)

## Non-feature list
  * Other socket connections from other browser Plug-ins, such as Flash, Silverlight or Java are not considered.
  * Fuzzing Support - although that may be a viable extension
  * Interpreting binary message content - beside text-frames, there are also binary-frames; interpreting this data won't be done
  * Support for `WebSockets` extensions as defined in http://tools.ietf.org/html/rfc6455#section-9 - maybe such custom extensions can be supported by providing an extension mechanism like with the filters. As there are no extensions for now, this may be a future task.
    * Maybe I will consider this point though - discussion about it is going on.

## Schedule as Gantt
[![](http://ubuntuone.com/1Whj9dYd0sjypCFi5Fdv1n?nonsense=schedule.png)](http://ubuntuone.com/1Whj9dYd0sjypCFi5Fdv1n)

# Tests
I use the Autobahn test suite to ensure that my `WebSocket` proxy implementation behaves correctly and does not change any message.
After bigger work packages I run these tests and fix failing ones. They helped me a lot to identify incorrect code, as you can read in weekly status reports.

## Setup

Download and install:
```
git clone git://github.com/tavendo/AutobahnTestSuite.git
cd AutobahnTestSuite/autobahntestsuite
sudo python setup.py install
```

Start testing server:
```
wstest -m fuzzingserver
```

Then visit the test interface in the browser via:
```
http://localhost:8088/
```

Run tests once without ZAP, and one time with ZAP. Then compare test results.

My configuration file `fuzzingserver.json` in the working directory (where I issued the `wstest` command) contains:
```
{
   "url": "ws://localhost:9001",

   "options": {"failByDrop": false},
   "outdir": "./reports/clients",
   "webport": 8088,

   "cases": ["*"],
   "exclude-cases": ["9.*"],
   "exclude-agent-cases": {}
}
```

For my tests I keep out the performance tests (`9.*`). Since CW27 more advanced tests were added in the trunk, that are really slow. Moreover, support for binary communication in ZAP is not ready yet.

## Protocol

|  | _7.3.1_ | _7.3.2_ | _7.9.`*`_ | **Note** |
|:-|:--------|:--------|:----------|:---------|
| _CW29_ | <font color='green'>PASSED</font> | <font color='green'>PASSED</font> | partly <font color='green'>passes</font>: 2-3, 6-8 & 10-13 | behaves like Firefox 14 without ZAProxy |
| _CW27_ | <font color='red'>FAILED</font> | <font color='red'>FAILED</font> | <font color='red'>FAILED</font> | behaves like Firefox 13 without ZAProxy |
| _CW22_ | <font color='green'>PASSED</font> | <font color='red'>FAILED</font> | <font color='red'>FAILED</font> | behaves like Firefox 12 without ZAProxy |

# Finished Future Work
  * **November 22, 2012**:
    * utilized _manual request editor_ to craft and send custom messages to existing channels
    * _resend_ context menu option added to WebSocket messages - brings up the _manual request editor_
  * **January 4, 2013**
    * fixed issue with handshake via HTTP-CONNECT through non-transparent proxies - should work for the ws:// scheme now.

# Future Work
  * searching - search through payload and show results in search tab
  * ensure `WebSocket` support for ZAP in daemon mode too (i.e.: without GUI)
  * Some issues to fix:
    * need a reproducible setup for my home network, such that I can work this out
    * support for maximum payload length of 2^63 bytes
    * emphasize <invalid UTF8> messages
    * find appropriate font that can display all UTF-8 characters. This [demo](http://isr.nu/ws/WebSocketTest.htm) uses exotic signs, that are not displayed in my ZAP version. Maybe this has something to do with system fonts?!
  * Nice-2-Have:
    * expose `WebSocket` communication through ZAP's API
    * support for some `WebSocket` extension protocols; could have support for:
      * [multiplexing](http://tools.ietf.org/html/draft-ietf-hybi-websocket-multiplexing-03)
      * [per-frame deflate](http://tools.ietf.org/html/draft-tyoshino-hybi-websocket-perframe-deflate-06)
      * [per-frame compression](http://tools.ietf.org/html/draft-ietf-hybi-websocket-perframe-compression-04) [pywebsocket](http://code.google.com/p/pywebsocket/) claims to support it, but refers to version 00 instead of current 04


# Weekly Status Updates

Here I will post what I've achieved, if I was able to meet my schedule, about problems keeping me from that and other project-relevant things.

<a href='Hidden comment: 
* 27 August: Final results of GSoC 2012 announced.
* 31 August: Students can begin submitting required code samples to Google.

== calendar week 34 (20 August - 26 August) ==
* 20 August: Firm "pencils down" date. Mentors, students and organization administrators can begin submitting final evaluations to Google.
* 24 August: Final evaluation deadline Google begins issuing student and mentoring organization payments provided forms and evaluations are on file.

'></a>

## calendar week 34 (20 August - 26 August)
_20 August: Firm 'pencils down' date. Mentors, students and organization administrators can begin submitting final evaluations to Google._

_24 August: Final evaluation deadline Google begins issuing student and mentoring organization payments provided forms and evaluations are on file._


## calendar week 33 (13 August - 19 August)
_13 August: Suggested 'pencils down' date. Take time to scrub code, write tests, improve documentation, etc._
  * merged websockets branch into trunk
  * extended help pages
  * improved `JavaDocs` - fixed several issues
    * included libraries in classpath
    * fixed @param warnings
    * fixed @return warnings in ZAP package
    * extended comments
  * wrote [developer documentation](InternalWebSockets) with class diagrams
  * observed problems with HSQLDB - posted to forum & asked for [help](http://sourceforge.net/projects/hsqldb/forums/forum/73674/topic/5519631)
    * upgrade issue is now resolved in HSQLDB trunk - created jar and replaced old library version

## calendar week 32 (6 August - 12 August)
  * re-structured _Data Transfer Objects_
    * `WebSocketMessageDTO` now contains reference to `WebSocketChannelDTO`
    * `WebSocketChannelDTO` got new attribute _url_
  * support for scopes & modes
    * had a hard session merging changes from trunk into my branch
    * in safe mode you cannot:
      * fuzz open connections
      * use replace filter to modify payload
      * set breakpoints and catch messages
    * in protected mode, only channels _in scope_ are not excluded from these potentially dangerous operations listed above
      * added two new images indicating targeted channels:  ![https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-connect-target.png](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-connect-target.png) ![https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-disconnect-target.png](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-disconnect-target.png)
    * in standard mode everything is allowed
  * improved support for BINARY messages
    * show payload if readable
  * upgraded to version 2.2.9 of HSQLDB
    * new Blob & Clob Types that should perform much better
    * [LOB issue](https://sourceforge.net/projects/hsqldb/forums/forum/73674/topic/5519631) reported to HSQLDB help forum
      * continuing old sessions does not work for `WebSocket` payloads - column in `WebSocket` tab remains empty (column uses CLOB for TEXT & BLOB for BINARY messages)
  * read primary keys for channels/messages from database (error when resuming sessions) - or use database to create them


## calendar week 31 (30 July - 5 August)
  * finished fuzzing support for `WebSockets`
  * tried again to setup Squid as non-transparent proxy - try was successful, but how can I tell Firefox that its HTTPS should go through this proxy (for now it ignores the proxy for HTTPS) - wanted to test the HTTP CONNECT method to establish a `WebSocket` connection
  * support for large payloads - do not show them directly, but display warn message first (as with large HTTP response bodies)
  * improved performance of `WebSocket` JTable by:
    * loading only ~150 payload characters from database
    * load full payload when selected to show in Request/Response tab
    * cache row count as long as no new message has arrived (prevents many queries)
    * noticed bad performance of HSQLDB - got `OutOfMemory` exceptions when running some performance tests from Autobahn test suite (`9.1.*` & `9.2.*`)
      * fixed `OutOfMemory` errors after writing or reading huge payloads by closing all `PreparedStatements`, that were created on-the-fly
  * better handling of binary data
    * distinction between utf8 (non-binary payload) and binary payload
    * introduced separate database columns (`payload_utf8` & `payload_bytes`) - either one of them has to be _`NOT NULL`_
    * **TODO**: Handle binary payloads better - for now only "<binary data>" is shown in preview column & in Text view:
      * show utf8 characters if possible

## calendar week 30 (23 July - 29 July)
  * implemented blacklisted channels in _Session Property_ dialogue like "_Exclude from Spider_"
    * originally wanted to implement it as option, but this setting has more of a temporary lifestyle than a persistent one
    * created `SessionExcludeFromWebSockets` class and attached it to _Session Property_ dialog
    * created `PopupMenuExcludeFromWebSockets` class and show it when you right onto some message in `WebSockets` tab
    * when blacklisted (or white-listed again) a new `State` is sent: EXCLUDED (respectively INCLUDED)
      * storage observer removes channel from DB or recreates it
      * UI observer updates its elements
    * fixed help index in `SessionExcludeFrom*` classes
    * extended Help for _Session Properties_ dialogue
    * reformatted Messages.properties (installed [ResourceBundle Editor](http://sourceforge.net/projects/eclipse-rbe/))
  * added `WebSocket` options
    * directly reachable by a button in `WebSockets` tab
    * containing 3 checkboxes:
      * **forward all**: Do only forward messages for all channels, but do not process them further (in UI or database). _Default:_ disabled (process all channels)
      * **break on all**: Catch also `WebSocket` messages when breakpoints via all-request/all-response breakpoint-buttons are enabled in Break-Toolbar. This does not affect custom breakpoints set in `WebSockets` tab & shown in Breakpoints tab. _Default:_ disabled (catch only HTTP messages)
      * **break on ping/pong**: Catch also Ping & Pong messages when breakpoint is set for all-requests/all-response _or_ when stepping through several messages. This does also not affect custom breakpoints where Ping & Pong are explicitly chosen. Ping & Pong messages are often used by servers to test connection health. _Default:_ disabled (do not catch them)
    * applied options
      * custom `BreakpointMessageHandler` class that enforces the break options
    * added help pages for the `WebSockets` tab + `WebSocket` options dialog
  * started with implementation of fuzzing support for `WebSockets`
    * applied patch from thc202 allowing to fuzz more generic interface _Message_
    * build upon his templates for `WebSockets`
    * fuzzed messages in `JTable` of Fuzz tab are backed by database - created:
```
CREATE CACHED TABLE websocket_message_fuzz (
    id BIGINT NOT NULL,
    websocket_message_id BIGINT NOT NULL,
    websocket_channel_id BIGINT NOT NULL,
    state VARCHAR(50) NOT NULL,
    fuzz LONGVARCHAR NOT NULL,
    PRIMARY KEY (id, websocket_message_id, websocket_channel_id),
    FOREIGN KEY (websocket_message_id, websocket_channel_id) REFERENCES websocket_message(id, websocket_channel_id) ON DELETE CASCADE
);
```
    * send custom messages on _`WebSocketProxy`_ and inform observers about it
    * support for _`WebSocketFuzzMessageDAO`_ that extends _`WebSocketMessageDAO`_
    * popup allowing to switch from message in Fuzz tab to same message in `WebSockets` tab


## calendar week 29 (16 July - 22 July)
  * searched for ways to do a pagination for a `JTable`
    * i.e.: to load only some entries (that are currently disabled)
    * found the [PagedTableModel](http://www.coderanch.com/t/345383/GUI/java/JTable-Paging) class from Brian Cole as most appropriate way and asked him if I'm allowed to use his code in this project and he agreed
  * added `TableWebSocket` to
    * Paros' database class
    * save `WebSocket` communication in two tables:
```
CREATE CACHED TABLE websocket_channel (
    id BIGINT PRIMARY KEY,
    host VARCHAR(255) NOT NULL,
    port INTEGER NOT NULL,
    start_timestamp TIMESTAMP NOT NULL,
    end_timestamp TIMESTAMP NULL,
    history_id INTEGER NULL,
    FOREIGN KEY (history_id) REFERENCES HISTORY(HISTORYID)
);

CREATE CACHED TABLE websocket_message (
    id BIGINT NOT NULL,
    websocket_channel_id BIGINT NOT NULL,
    timestamp TIMESTAMP NOT NULL,
    opcode TINYINT NOT NULL,
    payload LONGVARCHAR NOT NULL,
    payload_length BIGINT NOT NULL,
    is_outgoing BOOLEAN NOT NULL,
    PRIMARY KEY (id, websocket_channel_id),
    FOREIGN KEY (websocket_channel_id) REFERENCES websocket_channel(id)
);
```
    * created new `WebSocketStorage` class that is added as `WebSocketObserver` to each new channel
      * it stores all messages received in the database
      * the new `onStateChange(State, WebSocketProxy)` in `WebSocketObserver` enables to retrieve information about new channels
  * support for session changes
    * retain data when session is only saved, but
    * clear UI when new session is created
  * refactored GUI to:
    * load data from database
    * use of just one `TableModel` instead of several instances as before
    * page-in only some messages, but show scrollbar such as all messages were loaded
    * a placeholder value is returned while the data is in load (you can see some dots when you scroll down or up very fast)
  * minor changes:
    * added warning dialog to `WebSocketBreakDialog`s when an invalid pattern is added
    * new `WebSocketChannelDAO` to complement `WebSocketMessageDAO`
      * usage in the channel `ComboBox`
      * used to communicate with the database
    * fixed timestamp of messages: 1 Nanosecond is 1\*10^**-9** seconds
    * replaced primitive data types in DAO with Objects to allow null values
    * new `WebSocketMessagePrimaryKey` that encapsulates message & channel id and is used by `TableWebSocket` & in first column of the `WebSocket` panel
  * ran Autobahn test suite with through Firefox 14 and fixed one failed test
  * created todo list and thought about future tasks


## calendar week 28 (9 July - 15 July)
  * continued work on 'Replace `WebSocket` payload'-filter, from calendar week 26 and made it work
    * enter some pattern and replacement text, that is applied to matching messages

  * Some thoughts about consistency of the `WebSockets` implementation. The user can do different things in different areas - currently users can:
    * filter display of messages in `WebSocket` tab by
      * _opcode_ (via the filter dialog triggered by filter button)
      * _channel_ (via `ComboBox`)
      * sort them on custom column
      * **TODO**: Think about
        * integration with search extension to filter on payload
        * added filter for: _incoming_ & _outgoing_ messages
    * add custom breakpoints and restrict them by
      * _opcode_
      * _channel_
      * _payload pattern_
      * added restriction for: _incoming_ & _outgoing_ messages
    * replace payloads of `WebSocket` messages when
      * _pattern_ is found
      * on _incoming_ & _outgoing_ messages
      * added restriction for: _opcode_
      * added restriction for: _channel_

  * Moved common code from above's dialogues into new `WebSocketUiHelper` class, that avoids code duplication and provides common dialogue functionality. This steps aids also to more consistency between different dialogues.

  * a further idea about consistency from Simon brought me to replace the _speech bubble_ icon ![https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/029.png](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/029.png) with a _plug_, that is either _connected_ ![https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-connect.png](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-connect.png), or _disconnected_ ![https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-disconnect.png](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/plug-disconnect.png)
    * show _plug_ on http handshake message in `SiteMap`
    * show _plug_ in channel selectors beside host name & port (`JComboBox`)
    * show _plug_ in `WebSocket` tab
    * show _plug_ in Request/Response tab when a `WebSocket` message is shown
    * either connected or disconnected, that depends on channel status
      * **TODO**: trigger some UI update, when status changes (often these updates lack behind and changes are often only reflected when element is focused)
  * Had to fix problems with `JComboBox` in popups. I use them to show the different `WebSocket` channels (e.g.: `echo.websocket.org:443 (#1)`). When a new connection is established, the model of the combo-box is updated. If the added string is wider than the current width of the box, the whole content of the panel disappeared. I've implemented the following steps to...
    * avoid the display of long lines in two rows:
```
setText("<html><p style=\"white-space:nowrap;\">" + value.toString() + "</p></html>");
```
    * avoid increasing width. Setting minimum/maximum/preferred size of `JComboBox` did not work. But with the following code the given size is not exceeded:
```
channelsComboBox.setPrototypeDisplayValue(new ComboBoxChannelItem("XXXXXXXXXXXXXXXXXX"));

channelsList.setPrototypeCellValue(new ComboBoxChannelItem("XXXXXXXXXXXXXXXXXX"));
```
    * showing items in full width when dropdown of `JComboBox` appears: see [custom dropdown](http://tutiez.com/how-make-jcombobox-drop-down-width-as-wide-as-needed.html)


## calendar week 27 (2 July - 8 July)
  * got huge help from thc202 regarding Request/Response/Break-panel - it does not only allow _`HttpMessage`_, but a more generic _Message_ interface now
    * implemented possibility to set & send custom `WebSocket` payload
    * **TODO**: support for maximum payload length of 2^63 bytes
    * **TODO**: support for binary payload modification (for now only for opcode TEXT)
    * **TODO**: What to do with huge payloads (several MBs)? GUI freezes when they should be shown in Request/Response panel.
  * show status code (2 byte) on CLOSE-frames as readable string (4 digit) in payload
    * allow for modification also
  * fixed sorting of channel selector in `WebSocketPanel`
  * updated Autobahn Test Suite to current master ([0538cc38b25de870d94582779fc39eafc5fec668](https://github.com/tavendo/AutobahnTestSuite/commit/0538cc38b25de870d94582779fc39eafc5fec668)).
    * fixed some older tests again and provided support for new tests:
      * several UTF-8 issues were to fix
      * tests regarding status code failed
  * refactored custom breakpoints add/edit dialog for `WebSocket` messages
    * break on all or specific opcode
    * break on all or specific channels
    * break on arbitrary payload or specific pattern


## calendar week 26 (25 June - 1 July)
  * allow the filter extension to take external filters (not just from its package)
  * added 'Replace `WebSocket` payload', with
    * pattern & replacement as with the HTTP request/response filters
    * checkboxes for incoming & outgoing messages
  * extensions can now setup themself as `WebSocketObserver` by registering on the `ExtensionHook` (hook method in extensions)
    * listen to all channels
  * fixed some problems from CW25 (e.g.: auto-scroll-down)
  * shared how to setup [SwingExplorer](http://www.swingexplorer.com) with ZAP on UIStartDevelopment
  * switched from `JList` to `JTable` in `WebSocket` tab, that has got several advantages:
    * header row with column titles
    * custom column widths can be chosen by users
    * custom sorting by clicking on column header
  * fixed some issues regarding the view of all channels' messages
  * refactored channel selector
  * began with implementing `WebSocket` specific options - planned settings so far:
    * origin blacklist: origins (hostname + port) on that list are not tracked by ZAP, but are forwarded in the background - useful for high volume `WebSocket` connections, that are used for streaming, downloads, etc.

## calendar week 25 (18 June - 24 June)
  * finished my semester on university (had 2 presentations & an oral exam this week)
  * tried to setup [Squid](http://www.squid-cache.org/) as non-transparent proxy - but failed
    * wanted to force the browser to use the CONNECT method to establish a TCP connection (as described in [RFC6455 Section 4.1 - Proxy Usage](http://tools.ietf.org/html/rfc6455#section-4.1)), as Yvan had sporadic problems when trying out my `WebSockets` branch
    * won't try that again, until I got a reproducible setup, allowing me to examine the problem
  * created a `WebSocketPanel` that is shown in the 'information'-window (beside History tab) - removed previous created tab beside request/response
    * shows all messages in a list
    * filterable by channel via a select box
    * filterable by opcode via filter dialog
    * there are some todos left for this part:
      * scroll automatically down => solved on 27th June
      * joined model does not update - i.e. if no specific channel is selected the view does not update itself => solved on 27th June
      * provide further filters (e.g.: payload length > x, < x or = x)
      * create `WebSocket` entry in options dialog
  * next steps:
    * use existing request/response tabs to display messages in detail
      * use hex mode as default for BINARY messages
      * show outgoing messages in request tab and incoming messages in response tab
    * finish todos from above's list


## calendar week 24 (11 June - 17 June)
  * good resources for GUI programming, that helped me a lot (while still hard for me), are:
    * [SWT, Swing or AWT: Which is right for you?](http://www.ibm.com/developerworks/grid/library/os-swingswt/) - good, short overview to understand what is the difference & history of GUI programming in Java.
    * Official tutorial about: [creating a GUI With JFC/Swing](http://docs.oracle.com/javase/tutorial/uiswing/TOC.html) - a lot to read with good examples.
    * [WindowBuilder Pro](https://developers.google.com/java-dev-tools/wbpro/) - eclipse based GUI designer. Previously commercial, now brought for free to the Java community by Google. Good to play around as this graphical tool is also creating some code for you, that can be used elsewhere.
  * The first draft is available in the `WebSocket` branch. If you visit e.g.: [BrowserQuest](http://browserquest.mozilla.org/) the HTTP handshake of the `WebSocket` upgrade is added as usual in the Sites-panel. When you click on it, an additional tab beside _Request_, _Response_, _Break_ is shown named _`WebSocket`_. There, incoming & outgoing messages are displayed.
  * Finally I have used a [SpringLayout](http://docs.oracle.com/javase/tutorial/uiswing/layout/spring.html) to position these messages. 3 days of endless reading and playing around I got this basic version ready for use. However there are several things that needs to be improved. Here are the issues (so I do not forget something):
    * positioning of message information (opcode, timestamp, etc) could be better - does not look pretty now
    * automatic resizing of message textareas if you use a bigger screen (maybe additionally allowing the user to resize the textarea himself)
    * automatic scrolling does not always work fine - if several messages arrive in short time, it does not keep track of constantly scrolling down
    * when you click on a request in the _History_ tab in the bottom area, the _`WebSockets`_ tab does not appear right now - need to listen also there
    * if you switch from one WebSocket connection to another (in the _Sites_ panel) then the _Break_ tab is selected (should be the _`WebSockets`_ tab again)
    * if communication list is getting long, I could outsource messages into database - however I need to do that anyway as this is used to save a session
    * I have to take a look at the memory consumption also - I hope it does not explode due to my inexperience in GUI programming
  * got great feedback from Simon on the user interface and will implement his advices next week
    * before that I try to finish my todo from CW19 - add support for setting up the `WebSockets` connection through Http CONNECT

## calendar week 23 (4 June - 10 June)
  * read into GUI programming in Java
  * studied existing code
  * first steps regarding UI
  * implemented observer pattern for `WebSocket` message frames
  * several blockers on University this week

## calendar week 22 (28 May - 3 June)
  * a network intermediary (proxy) is allowed to:
    * change the fragmentation of packets -> preserve fragmentation when no frame-payload is changed by the ZAP-user. As a result upcoming WS-extensions, that assume some fixed fragmentation will work out of the box (as long as you do not change any frame-payload and just view communication)
    * split a frame up into several TCP packets or join several frames together into one TCP packet -> do not make any assumptions about TCP packet structure, as pointed out in this [forum post](https://groups.google.com/d/topic/autobahnws/fDjVX2be_hY/discussion)
  * so setting up the Autobahn test suite requires Python 2.7 as stated in the [Github repository](https://github.com/tavendo/AutobahnTestSuite) - furthermore:
    1. check out the master or another tagged version via:
```
    git clone git://github.com/tavendo/AutobahnTestSuite.git
    cd AutobahnTestSuite/autobahntestsuite
    sudo python setup.py install
```
    1. we need to change the port our test server is running, as its default is 8080 (that is also default for ZAP)
      * after running this command `wstest -m fuzzingserver` (you can issue this command wherever you want outside of your local Autobahn test suite) it will either terminate itself as the port is in use or you have to quit it manually (via Ctrl+C)
      * a file has been created named `fuzzingserver.json` - change the `webport` inside from `8080` to e.g.: `8088`
      * then run `wstest -m fuzzingserver` again from the same working directory
    1. open up your browser and visit `http://localhost:8088` where Autobahn should appear now
    1. run the tests twice under `Test your browser` (you may have to restart your browser and trigger the test again, as it sometimes hangs):
      * so run it once with proxy settings turned on (enter "ZAP" as User-Agent)
      * once without proxy (leaving the User-Agent unmodified)
    1. after running the tests you can view the `Client Reports` - both ZAP & your browser should pass & fail the same tests
  * I ran the test suite against Firefox 12, while another try with Chromium 22 failed, as it did not adhere to system wide proxy settings for the local URLs. I passed all tests meaning that my proxy implementation is able to process all kind of frames, handles errors in an appropriate way and performs in a sufficient manner, except on these tests:
    * 7.3.2 - As Firefox fails this test as well, no misbehaviour can be detected.
    * 7.9.`*` - ditto
  * The comprehensive Autobahn test suite helped me a lot identifying problems with my implementation. Here I summed up several issues:
    * WS-frames are allowed to occur directly after `\r\n\r\n` of the HTTP handshake response -> reuse of the `BufferedInputStream` of the `HttpClient` library
    * WS-frames are allowed to be split across TCP packets -> A `int InputStream.read(byte[]) ` does not block until the whole buffer is filled, but returns the number of bytes retrieved. If it differs from the length of the given buffer, you have to call it again via `int InputStream.read(buffer, bytesAlreadyRetrieved, buffer.length - bytesAlreadyRetrieved) `
    * WS-frames may contain invalid UTF-8 -> catch UTF-8 errors and forward invalid frames
    * WS-frames may consist of thousands of frames resulting in a message of several `MegaBytes` -> forward each frame as soon as it is read and do not wait until the whole message is collected
    * WS-close-frames may contain a close code consisting only of one byte, instead of two required bytes -> forward frame and process close code only if 2 bytes long
    * after an unfinished TEXT-frame, another non-control frame might be sent, that is not the awaited CONTINUATION-frame -> forward frame also in this case
    * shutdown WS-Proxy in ZAP as soon as one side fails
    * improved logging (use a channel number to log messages; do not log messages that are longer than 10000 characters for performance reasons)

## calendar week 21 (21 May - 27 May)
  * moved from NIO (`SocketChannel`) to Sockets, as HTTPS is much easier to process with `SSLSocket` - starting with NIO & `SSLEngine` would work, but resuming an `SSLSocket` with a `SocketChannel` + `SSLEngine` did not work.
  * Due to the rewriting the following examples work:
    * [EchoServer](http://www.websocket.org/echo.html) - does work with WS & WSS (SSL)
    * [WebSocketsTest.com](http://websocketstest.com/) - does also report a working `WebSocket`
    * [BrowserQuest](http://browserquest.mozilla.org/) - `BrowserGame` based on WS (no SSL)
  * Want to use the [Atmosphere test suite](http://autobahn.ws/testsuite) to ensure that all types/traces of messages are forwarded correctly.
    * Had issues with running theses tests through ZAP - with the help of `Wireshark` I found out that Atmosphere sends its first frame directly after the handshake response (i.e. it puts the frame into the same TCP packet). Moreover it places several frames into the "response body", but the `HttpClient`-library ignores the response body as no content-length was set and discards bytes, which leads to an error. Now that I've found out what went wrong, I pass not only the socket from inside the `HTTPClient` to the `WebSockets` extension, but also the `BufferedInputStream` from the handshake response.
      * The "chopped tests" fail. They test whether an implementation is TCP stream agnostic, i.e. how frames are split up into network packets - see also post in Autobahn forum https://groups.google.com/forum/?fromgroups#!topic/autobahnws/fDjVX2be_hY. I will work on this issue and further test compliance in calendar week 22.
    * While `Wireshark` revealed the problem, there is also nice support for viewing `WebSocket`-frames in new versions of Chrome. See [WebSocket frame inspection in Chrome DevTools](http://updates.html5rocks.com/2012/05/Websocket-Frame-Inspection-now-in-Chrome-DevTools)


## calendar week 20 (14 May - 20 May)
  * first weekly meeting on monday, where I talked to my mentor Yvan & Simon
  * tried hard to get SSL working - after endless googling and trial&error I gave up and won't use Java's NIO features as I was not able to resume the existing session with the `SSLEngine`.
  * So the plan for next week is to rewrite my basic read & write procedures to use blocking I/O with `Sockets`, instead of non-blocking I/O with `SocketChannels`. That would allow me to use `SSLSocket` and its internal handling of the SSL handshaking.


## calendar week 19 (7 May - 13 May)
  * setup SVN branch (as we should use one branch per `GSoC` project)
  * committed upgrade to [HttpClient](http://hc.apache.org/httpclient-3.x/) 3.1 to this new branch
  * read a lot about Java NIO (as this new I/O allows for more efficient handling in comparison to streams - Monsoon is also based on Java's NIO features). I found a nice tutorial (that still contains some errors) at http://tutorials.jenkov.com/java-nio/overview.html. Better code examples for Java NIO can be found here: https://www.ibm.com/developerworks/java/tutorials/j-nio/.
  * tried to extract remoteChannel from `HttpClient` (from ZAP to servers) to be used in `WebSockets` processing
  * studied [Monsoon](http://code.google.com/p/monsoon/) and derived my initial structure for `WebSockets` support
  * ran into problems regarding closed sockets - Ricardo [pointed out the problem](https://groups.google.com/d/msg/zaproxy-develop/L4QGxESiXGI/rS0c5YYHUeEJ) and guided me into the right direction.
  * first `WebSocket` frames are received and sent as described [here](https://groups.google.com/d/msg/zaproxy-develop/L4QGxESiXGI/mQsNijLQ86EJ). Still a lot of TODOs for this basic functionality:
    * support for secure `WebSockets`
    * support for handshake via Http-CONNECT through non-transparent proxies
    * close-frame handling and clean-up


## calendar week 18 (30 April - 6 May)
  * first steps in ZAP Google Group
  * setup Wiki page for weekly status updates and progress
  * read a lot of ZAP code to find out how and where support for `WebSockets` can be established

> I stumbled over a problem with the [HttpClient](http://hc.apache.org/httpclient-3.x/) library in version 3.0: It ignores the HTTP status code 101 as you can see here:
```java

int status = this.statusLine.getStatusCode();
if ((status >= 100) && (status < 200)) {
if (LOG.isInfoEnabled()) {
LOG.info("Discarding unexpected response: " + this.statusLine.toString());
}
this.statusLine = null;
}
```

Unfortunately this status is essential for the HTTP-based handshake for a `WebSockets` connection. In the method _`readResponse`_ of the class _`HttpMethodBase`_ no 101 status is set, leading to a timeout and a failed HTTP response. I evaluated various solutions to this problem (as you can lookup on the [GoogleGroup](https://groups.google.com/d/msg/zaproxy-develop/L4QGxESiXGI/Hp9OIMACk6cJ)). The one that I will go for is an upgrade to version 3.1 of [HttpClient](http://hc.apache.org/httpclient-3.x/). It allows me to extend the _`GetMethod`_ class and get rid of the ignorance of this status code. Changes since version 3.0 are stated in this [release notes](http://archive.apache.org/dist/httpcomponents/commons-httpclient/RELEASE_NOTES.txt). I hope that migration won't break existing features. A first exchange on the websockets-branch did compile and run without problems.
  * Study of standards: [RFC6455](http://tools.ietf.org/html/rfc6455) and [W3C WebSocket API](http://dev.w3.org/html5/websockets/). Good starting point also: http://www.sitepoint.com/websockets-stable-and-ready-for-developers/
  * Search for existing work (or comments from ZAP's Google Group):
    * [Atmosphere](https://github.com/Atmosphere/atmosphere) - The only Portable `WebSocket`/Comet Framework supporting Scala, Groovy and Java
    * [Fiddler](http://blogs.msdn.com/b/fiddler/archive/2011/11/22/fiddler-and-websockets.aspx) - has already rudimentary support for `WebSockets` (Windows only)
    * [websocket-draft-eval](https://code.google.com/p/websocket-draft-eval/) - Sample code for evaluation of `WebSocket` draft proposals (outdated but code contains some useful hints - Apache 2.0 licensed)
    * [Monsoon](http://code.google.com/p/monsoon/) - Websocket Library (nice architecture, high code quality, need to study that)


## calendar week 17 (23 April - 29 April)
  * finished todo-list on Google Melange
  * tried to setup a wiki site on Mozilla, which failed as no confirmation mail was sent to me (https://bugzilla.mozilla.org/show_bug.cgi?id=748734).
  * established contact to project leader of ZAP
  * setup build environment for ZAP within Eclipse