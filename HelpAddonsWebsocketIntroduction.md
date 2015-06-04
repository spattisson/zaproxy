# WebSockets

WebSockets can be used by web applications or web sites to setup a bi-directional (two-way), full duplex
communication channel over a single TCP connection.<br>It features a lightweight protocol, allowing developers<br>
to realize realtime use cases. WebSockets do also provide an alternative to heavy use of Ajax, HTTP Long<br>
Polling or Comet.<br>

After an initial HTTP based handshake, the TCP connection is kept open, allowing applications to send<br>
& receive arbitrary data. Often port 80 or 443 for encrypted WebSocket channels are used.<br>
<br>
The WebSocket standard is defined in<br>
<dl>
<dt><a href='http://www.w3.org/TR/websockets/'>The WebSocket API (http://www.w3.org/TR/websockets/)</a></dt>
<dd>specifies the interface in browsers</dd>
<dt><a href='https://tools.ietf.org/html/rfc6455'>The WebSocket Protocol (RFC6455) (https://tools.ietf.org/html/rfc6455)</a></dt>
<dd>describes the structure of WebSocket frames upon TCP</dd>
</dl>

ZAP is able to:<br>
<ul><li>intercept and show WebSocket messages<br>
</li><li>set breakpoints on specific types of WebSocket messages<br>
</li><li>fuzz WebSocket messages (send lots of invalid or unexpected data to a browser or server)<br>
WebSocket messages are displayed within the <a href='HelpAddonsWebsocketTab'>WebSockets tab</a>.