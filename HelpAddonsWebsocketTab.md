# WebSocket tab

The WebSockets tab displays all messages from WebSocket connections. While ZAP is active, visit e.g.:
[Mozilla's BrowserQuest](http://browserquest.mozilla.org/) to see WebSockets in action.
## Filters
### Channel Selector
You can restrict the display of messages to one specific WebSocket channel or all. <br>If you select a specific<br>
channel, then the <i>Show handshake</i> button ( <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/handshake.png' /> ) becomes enabled. When you click on it, the corresponding HTTP<br>
handshake is shown in the Request/Response tab.<br>
<h3>Filter Dialog</h3>
In the filter dialog ( <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/054.png' /> ) you can further control which messages are displayed. <br><br>
<h2>Breakpoints</h2>
You can set custom breakpoints using the <i>Add Custom Breakpoints</i> button ( <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/break_add.png' /> ). <br>Alternatively you can use<br>
the <i>Right click menu</i>. <br><br>
<h2>Right click menu</h2>
Right clicking on a WebSocket message will bring up a menu which will allow you to:<br>
<h3>Exclude from WebSocket</h3>
WebSocket connections can be excluded from the WebSockets tab by adding an excluded URL to the <i>Session<br>
Properties</i>. Clicking on this item, brings up the session properties with the URL pre-filled. Excluding<br>
a WebSocket connection will not result in closing the connection, but in forwarding them without further<br>
processing.<br>
<h3>Break...</h3>
This will bring up the <i>Add Break Point dialog</i> which allows you to set up a custom break point.