# Options Applications screen

This screen allows you to configure the [applications](HelpAddonsInvokeConcepts) that can be invoked.<br>By default there are no applications available, you need to add all of the applications that you want to use.<br>
<h3>Display Name</h3>
The name that will be used for this application in ZAP. <br>
<h3>Full Command</h3>
The full path of the application you want to invoke. <br>Only one command can be specified. If you want to<br>
run multiple commands in one go, or set up environmental variables, then you should create a script or<br>
batch file and then invoke this from ZAP.<br>
<h3>Parameters</h3>
The parameters that ZAP should pass to the command. <br>The following tags may be used to pass parameters:<br>
<table>
<tr><td></td><td>%url%</td><td>the full url, e.g. '<a href='http://localhost/test?a=b'>http://localhost/test?a=b</a>'</td></tr>
<tr><td></td><td>%site%</td><td>the site, e.g. '<a href='http://localhost:8080/'>http://localhost:8080/</a>'</td></tr>
<tr><td></td><td>%host%</td><td>the hostname, e.g. 'localhost'</td></tr>
<tr><td></td><td>%port%</td><td>the port, e.g. '80'</td></tr>
<tr><td></td><td>%cookie%</td><td>the first cookie field from the request header (if any)</td></tr>
<tr><td></td><td>%postdata%</td><td>the POST data sent, if any, with any newlines replaced with "\n"</td></tr>
</table>
So if a command accepted a URL using '-u' you would specify the parameters as: '-u %url%'<br>
<h3>Capture Output</h3>
If checked then the command run and any output it generates will be displayed on the <i>Output tab</i>. <br>You<br>
should always use this options when running scripts or commands that do not have a UI. <br>You can also use<br>
this options for troubleshooting - if an application does not run as expected then copy the command run<br>
and try it from a command line prompt.<br>
<h3>Output to Note</h3>
If checked then any output will be appended to a <i>Note</i> attached to the relevant <i>History tab</i> record. <br>Note<br>
that some nodes in the <i>Sites tab</i> do not have associated <i>History tab</i> records - for those nodes this option<br>
will have no effect.