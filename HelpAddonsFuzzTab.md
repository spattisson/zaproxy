# Fuzzer tab
The Fuzzer tab shows you the requests and responses performed when you [HelpAddonsFuzz....StartConceptsFuzz fuzz] a string. <br>Selecting a row see the full requests and responses. You can also search for strings in the fuzz results using the <a href='HelpAddonsFuzzSearch'>Search tab</a>. <br>
<h2>HTTP Fuzzer results</h2>
The results have to be manually assessed to know if any vulnerability was found. <br>Meaning of values of<br>
the "State" column:<br>
<ul><li>"Successful" - the message was successfully sent/received;<br>
</li><li>"Error" - an error occurred while creating or sending/receiving the message (for example: malformed HTTP message, time out while reading the response);<br>
</li><li>"Reflected" - the injected fuzz string (value of "Fuzz" column) was found in the response body.<br>
<h2>Right click menu</h2>
Right clicking on a row will bring up a menu which will allow you to:<br>
<h3>Exclude from</h3>
This menu has the following submenus:<br>
<h4>Proxy</h4>
This will exclude the selected nodes from the proxy. They will still be proxied via ZAP but will not<br>
be shown in any of the tabs. <br>This can be used to ignore URLs that you know are not relevant to the system<br>
you are currently testing. <br>The nodes can be included again via the [HelpAddonsFuzz..DialogsSessionSessprop Session Properties] dialog<br>
<h4>Scanner</h4>
This will prevent the selected nodes from being actively scanned. <br>The nodes can be included again via<br>
the [HelpAddonsFuzz..DialogsSessionSessprop Session Properties] dialog<br>
<h4>Spider</h4>
This will prevent the selected nodes from being spidered. <br>The nodes can be included again via the [HelpAddonsFuzz..DialogsSessionSessprop Session Properties] dialog<br>
<h3>Resend...</h3>
This will bring up the [HelpAddonsFuzz..DialogsResend Resend dialog] which allows you to resend the request after making any changes to it that you want to.<br>
<h3>New Alert...</h3>
This will bring up the [HelpAddonsFuzz..DialogsAddalert Add Alert dialog] which allows you to manually record a new [HelpAddonsFuzz....StartConceptsAlerts alert] against this request.<br>
<h3>Open URL in Browser</h3>
This will open the URL of the selected node in your default browser.<br>
<h2>See also</h2>
<table>
<tr><td></td><td>[HelpAddonsFuzz..Overview UI Overview]</td><td>for an overview of the user interface</td></tr>
<tr><td></td><td>[HelpAddonsFuzz..DialogsOptionsFuzz Options Fuzz screen]</td><td>for details of the fuzz configuration</td></tr>
</table>