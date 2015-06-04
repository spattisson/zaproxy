# Forced Browse tab
The Forced Browse tab allows you to perform a [Forced Browse](HelpAddonsBruteforceConcepts) scan on any of the sites that have been accessed. <br><br>Sites can be selected via the toolbar or the <i>Sites tab</i>. <br>Any sites that have have been are are currently being scanned are marked in bold in the toolbar Sites pulldown control. <br>The toolbar provides a set of buttons which allow you to start, stop, pause and resume the scan. <br>A progress bar shows how far the scan of the selected site has progressed. <br>The 'Current scans' value shows how many scans are currently active - hovering over this value will show a list of the sites being scanned in a popup.<br>
<h2>Right click menu</h2>
Right clicking on one or more rows will bring up a menu which will allow you to:<br>
<h3>Exclude from</h3>
This menu has the following submenus:<br>
<h4>Proxy</h4>
This will exclude the selected nodes from the proxy. They will still be proxied via ZAP but will not<br>
be shown in any of the tabs. <br>This can be used to ignore URLs that you know are not relevant to the system<br>
you are currently testing. <br>The nodes can be included again via the <i>Session Properties</i> dialog<br>
<h4>Scanner</h4>
This will prevent the selected notes from being actively scanned. <br>The nodes can be included again via<br>
the <i>Session Properties</i> dialog<br>
<h4>Spider</h4>
This will prevent the selected nodes from being spidered. <br>The nodes can be included again via the <i>Session<br>
Properties</i> dialog<br>
<h3>Copy</h3>
This will copy the selected URLs to the clipboard.<br>
<h3>Resend...</h3>
This will bring up the <i>Resend dialog</i> which allows you to resend the request after making any changes<br>
to it that you want to.<br>
<h3>New Alert...</h3>
This will bring up the <i>Add Alert dialog</i> which allows you to manually record a new <i>alert</i> against this<br>
request.<br>
<h3>Open URL in Browser</h3>
This will open the URL of the selected node in your default browser.<br>
<h3>Generate anti CSRF test form</h3>
This will open a URL which will give you a generated form for testing for CSRF issues. <br>It will only be<br>
enabled for POST requests, if the API is enabled and if Java supports the opening of URLs in a browser<br>
on your platform.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpAddonsBruteforceOptions'>Options Forced Browse screen</a></td><td>for details of the forced browse configuration</td></tr>
</table>