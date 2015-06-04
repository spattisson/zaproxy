# WebSocket specific session properties


## Exclude from WebSocket
This allows you to manage the URLs where WebSocket communication is not processed in ZAP. <br>Although all<br>
messages from excluded URLs are forwarded, nothing is stored nor can you view them in the user interface.<br>
This feature is useful for high volume, performance critical WebSocket connections. <br>You can differentiate<br>
on the port for one given domain, by using e.g.: <i>example.com:443</i> to exclude WebSocket connections from<br>
example.com only on port 443.