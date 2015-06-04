# AJAX Spider tab

The AJAX Spider tab shows you the set of unique URIs found by [AJAX Spider](HelpAddonsSpiderAjaxConcepts).
<br>For each request you can see:<br>
<table>
<tr><td></td><td>The request index - each request is numbered, starting at 1</td></tr>
<tr><td></td><td>The request timestamp</td></tr>
<tr><td></td><td>The HTML method, e.g. GET or POST</td></tr>
<tr><td></td><td>The URL requested</td></tr>
<tr><td></td><td>The HTTP response status code</td></tr>
<tr><td></td><td>A short summary of what the HTTP response code means</td></tr>
<tr><td></td><td>The length of time the whole request took</td></tr>
<tr><td></td><td>The size of the response header</td></tr>
<tr><td></td><td>The size of the response body</td></tr>
<tr><td></td><td>Any <i>Alerts</i> on the request </td></tr>
<tr><td></td><td>Any <i>Notes</i> you have added to request </td></tr>
<tr><td></td><td>Any <i>Tags</i> you have added to request </td></tr>
</table>
Selecting a requests will display it in the <i>Request tab</i> and <i>Response tab</i> above. <br>
<h2>Right click menu</h2>
Right clicking on a node will bring up a menu which will allow you to:<br>
<h3>Attack</h3>
The Attack menu has the following submenus:<br>
<h4>Active Scan Site</h4>
This will initiate an <i>Active Scan</i> of the whole of the site containing the selected node. <br>The <i>Active Scan<br>
tab</i> will be display and will show the progress of the scan. <br>
<h4>Active Scan Node</h4>
This will initiate an <i>Active Scan</i> of just the node selected. <br>The <i>Active Scan tab</i> will be display and<br>
will show the progress of the scan. <br>
<h4>Spider Site</h4>
This will initiate a <i>spider</i> of the whole of the site containing the selected node. <br>The <i>Spider tab</i> will<br>
be display and will show the progress of the scan. <br>
<h4>Forced Browse Site</h4>
This will initiate a <i>forced browse</i> of the whole of the site containing the selected node. <br>The <i>Forced<br>
Browse tab</i> will be display and will show the progress of the scan. <br>
<h4>Forced Browse Directory</h4>
This will initiate a <i>forced browse</i> on the selected directory. <br>The <i>Forced Browse tab</i> will be displayed<br>
and will show the progress of the scan. <br>
<h4>Forced Browse Directory (and children)</h4>
This will initiate a <i>forced browse</i> on the selected directory and all children found. <br>The <i>Forced Browse<br>
tab</i> will be displayed and will show the progress of the scan. <br>
<h3>Exclude from</h3>
This menu has the following submenus:<br>
<h4>Proxy</h4>
This will exclude the selected nodes from the proxy. They will still be proxied via ZAP but will not<br>
be shown in any of the tabs. <br>This can be used to ignore URLs that you know are not relevant to the system<br>
you are currently testing. <br>The nodes can be included again via the <i>Session Properties</i> dialog<br>
<h4>Scanner</h4>
This will prevent the selected nodes from being actively scanned. <br>The nodes can be included again via<br>
the <i>Session Properties</i> dialog<br>
<h4>Spider</h4>
This will prevent the selected nodes from being spidered. <br>The nodes can be included again via the <i>Session<br>
Properties</i> dialog<br>
<h3>Run application</h3>
This menu allows you to <i>invoke applications</i> that you have configured via the <i>Options Applications screen</i>
which is also accessible via the 'Configure applications...' submenu.<br>
<h3>Manage Tags...</h3>
This will bring up the <i>Manage Tags dialog</i> which allows you to change the <i>tags</i> associated with the request.<br>
<h3>Note...</h3>
This will bring up the <i>Add Note dialog</i> which allows you to record <i>notes</i> related to the request.<br>
<h3>Break...</h3>
This will bring up the <i>Add Break Point dialog</i> which allows you to set a break point on that URL. <br>
<h3>Alerts for this node</h3>
If the URL selected has <i>alerts</i> associated with it then they will be listed under this menu. <br>Selecting<br>
one of the alerts will cause it to be displayed.<br>
<h3>Resend...</h3>
This will bring up the <i>Resend dialog</i> which allows you to resend the request after making any changes<br>
to it that you want to.<br>
<h3>New Alert...</h3>
This will bring up the <i>Add Alert dialog</i> which allows you to manually record a new <i>Alert</i> against this<br>
request.<br>
<h3>Open URL in Browser</h3>
This will open the URL of the selected node in your default browser.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpAddonsSpiderAjaxConcepts'>AJAX Spider</a></td><td>for an overview of the AJAX Spider</td></tr>
<tr><td></td><td><a href='HelpAddonsSpiderAjaxOptions'>Options AJAX Spider screen</a></td><td>for an overview of the AJAX Spider Options</td></tr>
<tr><td></td><td><a href='HelpAddonsSpiderAjaxScandialog'>AJAX Spider dialog</a></td><td>for an overview of the AJAX Spider Dialog</td></tr>
</table>