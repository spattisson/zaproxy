# Options Display screen

The Display screen allows you to configure:
### Images
If ZAP processes images.
### Display
The layout of the 3 main windows.
### Show break buttons
The location of the break buttons.
### Large request view min size
The minimum size of a request body in bytes at which point a 'large request body' message will be shown
instead of the actual body.<br>This is to prevent very large bodies from slowing down the UI.<br>Setting this<br>
value to -1 will result in request always being displayed no matter how large it is.<br>
<h3>Large response view min size</h3>
The minimum size of a response body in bytes at which point a 'large response body' message will be shown<br>
instead of the actual body.<br>This is to prevent very large bodies from slowing down the UI.<br>Setting this<br>
value to -1 will result in response always being displayed no matter how large it is.<br>
<h3>Output Tabs Time Stamp Options</h3>
Once you've enabled time stamps on the output tab you can configure the format you would like those time<br>
stamps to appear in. Either select a pre-defined format from the drop-down list or enter one of your<br>
own choosing. The format is based on Java's SimpleDateFormat. After choosing or entering a time stamp<br>
format if you press enter the example on the right will be updated to reflect your choice. If ZAP is<br>
unable to use a format you've entered then the example is displayed based on the Default format.<br>
<h3>Font Size</h3>
The default text size used for the ZAP display. If you set this to -1 then the system default size will<br>
be used.<br>The 'Font Example' field will show you how large the default text will appear.<br>This setting will<br>
only take effect when ZAP is restarted.<br>
<table cellpadding='5' border='1'>
<tr><td>Long & Default </td><td>yyyy-MM-dd HH:mm:ss </td></tr>
<tr><td>ISO8601 </td><td>yyyy-MM-dd'T'HH:mm:ssZ </td></tr>
<tr><td>Time Only </td><td>HH:mm:ss </td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface.</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsOptions'>Options dialogs</a></td><td>for details of the other Options dialog screens.</td></tr>
</table>
<h2>External Links</h2>
<table>
<tr><td></td><td><a href='https://code.google.com/p/zaproxy/downloads/list'>https://code.google.com/p/zaproxy/downloads/list</a></td><td>ZAP download page</td></tr>
<tr><td></td><td><a href='http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html'>http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html</a></td><td>For details of Java's SimpleDateFormat.</td></tr>
</table>