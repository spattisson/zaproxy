# WebSocket specific options

This screen allows you to configure the WebSocket options:
### Forward all
If you're not interested in WebSockets communication, but you want to allow its messages being sent back
& forth through ZAP, then you should enable this option. As a result no message will be stored in
the session database. Moreover no message will appear in the WebSockets tab. This setting can be useful
if you have to deal with performance critical WebSocket connections and you're not interested what is
being sent. <br><br>If you want to ignore just one specific channel, check out the WebSocket specific <i>Session<br>
Properties</i>.<br>
<h3>Break on all</h3>
In the <i>Break</i> toolbar, there are two buttons:<br>
<ul><li><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/105.png' /> <i>Set break on all requests</i>
</li><li><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/106.png' /> <i>Set break on all responses</i>
When you enable this option, then all outgoing (respectively incoming) WebSocket messages are also caught<br>
by these control buttons. <br><br>By default this option is disabled. In this case only HTTP messages are caught,<br>
but you can add explicit breakpoints on WebSocket communication in the <a href='HelpAddonsWebsocketTab'>WebSocket tab</a>.<br>
<h3>Break on Ping & Pong messages</h3>
<i>PING</i> and <i>PONG</i> messages are often used by WebSocket servers to determine the health of the current connection.<br>
If you catch an incoming <i>PING</i> message, the browser is not able to return a <i>PONG</i> message immediately,<br>
resulting in a bad latency value. <br><br>If this option is disabled no <i>PING</i> or <i>PONG</i> message is caught when you:<br>
</li><li>set a breakpoint on <u>all requests</u> or <u>all responses</u>, <i>or</i>
</li><li>step through to the next request or response and a <i>PING</i> or <i>PONG</i> message arrives<br>
This setting does not affect breakpoints that are set explicitly on <i>PING</i> or <i>PONG</i> messages. You can view<br>
such explicit breakpoints in the <i>Breakpoints tab</i>.