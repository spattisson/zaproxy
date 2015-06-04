# Active Scan tab
The Active Scan tab allows you to perform an [active scan](HelpStartConceptsAscan).<br><br>The 'New Scan' button launches the <a href='HelpUiDialogsAdvascan'>Active Scan dialog</a> which allows you to specify exactly what should be scanned. <br><br>The toolbar provides a set of buttons which allow you to start, stop, pause and resume the scan selected.<br>A progress bar shows how far the scan of the selected site has progressed.<br>The 'Current scans' value shows how many scans are currently active - hovering over this value will show a list of the sites being scanned in a popup.<br>
<h2>Right click menu</h2>
Right clicking on a node will bring up a menu which will allow you to:<br>
<h3>Exclude from</h3>
This menu has the following submenus:<br>
<h4>Proxy</h4>
This will exclude the selected nodes from the proxy. They will still be proxied via ZAP but will not<br>
be shown in any of the tabs.<br>This can be used to ignore URLs that you know are not relevant to the system<br>
you are currently testing.<br>The nodes can be included again via the <a href='HelpUiDialogsSessionSessprop'>Session Properties</a> dialog<br>
<h4>Scanner</h4>
This will prevent the selected nodes from being actively scanned.<br>The nodes can be included again via<br>
the <a href='HelpUiDialogsSessionSessprop'>Session Properties</a> dialog<br>
<h4>Spider</h4>
This will prevent the selected nodes from being spidered.<br>The nodes can be included again via the <a href='HelpUiDialogsSessionSessprop'>Session Properties</a> dialog<br>
<h3>Resend...</h3>
This will bring up the <a href='HelpUiDialogsResend'>Resend dialog</a> which allows you to resend the request after making any changes to it that you want to.<br>
<h3>New Alert...</h3>
This will bring up the <a href='HelpUiDialogsAddalert'>Add Alert dialog</a> which allows you to manually record a new <a href='HelpStartConceptsAlerts'>alert</a> against this request.<br>
<h3>Show in Sites tab</h3>
This will show the selected message in the <a href='HelpUiTabsSites'>Sites tab</a>.<br>
<h3>Open URL in Browser</h3>
This will open the URL of the selected node in your default browser.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsAscan'>Options Active Scan screen</a></td><td>for details of the active scan configuration</td></tr>
</table>