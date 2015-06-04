# History tab

The History tab shows a list of all of the requests in the order in which they were made.<br>For each request<br>
you can see:<br>
<table>
<tr><td></td><td>The request index - each request is numbered, starting at 1</td></tr>
<tr><td></td><td>The HTML method, e.g. GET or POST</td></tr>
<tr><td></td><td>The URL requested</td></tr>
<tr><td></td><td>The HTTP response code</td></tr>
<tr><td></td><td>A short summary of what the HTTP response code means</td></tr>
<tr><td></td><td>The length of time the whole request took</td></tr>
<tr><td></td><td>Any <a href='HelpStartConceptsAlerts'>Alerts</a> on the request</td></tr>
<tr><td></td><td>Any <a href='HelpStartConceptsNotes'>Notes</a> you have added to request</td></tr>
<tr><td></td><td>Any <a href='HelpStartConceptsTags'>Tags</a> on the request</td></tr>
</table>
Selecting a requests will display it in the <a href='HelpUiTabsRequest'>Request tab</a> and <a href='HelpUiTabsResponse'>Response tab</a> above.<br>
<h2>The filter toolbar</h2>
A filter toolbar is provided which allows you to restrict which requests are displayed.<br>Clicking on the<br>
<blockquote><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/054.png' /> Filter button displays the <a href='HelpUiDialogsHist_filter'>History Filter dialog</a>.<br>A summary of the filter currently applied is displayed to the right of the button.<br>
<h2>Right click menu</h2>
Right clicking on a node will bring up a menu which will allow you to:<br>
<h3>Attack</h3>
The Attack menu has the following submenus:<br>
<h4>Active Scan...</h4>
This will launch the <a href='HelpUiDialogsAdvascan'>Active Scan</a> dialog which allows you to initiate an <a href='HelpStartConceptsAscan'>active scan</a> with the starting point set to the request you selected.<br>
<h4>Spider...</h4>
This will launch the <a href='HelpUiDialogsSpider'>Spider</a> dialog which allows you to initiate the <a href='HelpStartConceptsSpider'>spider</a> with the starting point set to the request you selected.<br>
<h3>Include in Context</h3>
This menu allows you to include the selected nodes and all of their subordinates in the specified <a href='HelpStartConceptsContexts'>context</a>.<br>You also have the option to create a new context.<br>The <a href='HelpUiDialogsSessionContexts'>Session Contexts</a> dialog will be displayed to allow you to make any additional changes.<br>
<h3>Exclude from Context</h3>
This menu allows you to exclude the selected nodes and all of their subordinates from the specified <a href='HelpStartConceptsContexts'>context</a>.<br>The <a href='HelpUiDialogsSessionContexts'>Session Contexts</a> dialog will be displayed to allow you to make any additional changes.<br>
<h3>Flag as context</h3>
This menu has the following submenus for each of the <a href='HelpStartConceptsContexts'>contexts</a> you have defined:<br>
<h4>Login request</h4>
This identifies the specified node as a login request.<br>You may only have one node identified as such in<br>
any one context.<br>The <a href='HelpUiDialogsSessionContexts'>Session Contexts</a> dialog will be displayed to allow you to make any additional changes.<br>
<h4>Logout request</h4>
This identifies the specified node as a logout request.<br>You may only have one node identified as such<br>
in any one context.<br>The <a href='HelpUiDialogsSessionContexts'>Session Contexts</a> dialog will be displayed to allow you to make any additional changes.<br>
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
<h3>Manage Tags...</h3>
This will bring up the <a href='HelpUiDialogsManagetags'>Manage Tags dialog</a> which allows you to change the <a href='HelpStartConceptsTags'>tags</a> associated with the request.<br>
<h3>Note...</h3>
This will bring up the <a href='HelpUiDialogsAddnote'>Add Note dialog</a> which allows you to record <a href='HelpStartConceptsNotes'>notes</a> related to the request.<br>
<h3>Delete</h3>
This will remove the node and all of its children from ZAP.<br>However they can be added back in, to prevent<br>
this use the 'Exclude from' menus.<br>
<h3>Break...</h3>
This will bring up the <a href='HelpUiDialogsAddbreak'>Add Break Point dialog</a> which allows you to set a break point on that URL.<br>
<h3>Scan this History</h3>
This will perform an <a href='HelpStartConceptsAscan'>active scan</a> against the URL related to the selected request.<br>
<h3>Alerts for this node</h3>
If the URL selected has <a href='HelpStartConceptsAlerts'>alerts</a> associated with it then they will be listed under this menu.<br>Selecting one of the alerts will cause it to be displayed.<br>
<h3>Resend...</h3>
This will bring up the <a href='HelpUiDialogsResend'>Resend dialog</a> which allows you to resend the request after making any changes to it that you want to.<br>
<h3>New Alert...</h3>
This will bring up the <a href='HelpUiDialogsAddalert'>Add Alert dialog</a> which allows you to manually record a new <a href='HelpStartConceptsAlerts'>alert</a> against this request.<br>
<h3>Show in Sites tab</h3>
This will show the selected message in the <a href='HelpUiTabsSites'>Sites tab</a>.<br>
<h3>Open URL in Browser</h3>
This will open the URL of the selected node in your default browser.<br>
<h3>Generate anti CSRF test form</h3>
This will open a URL which will give you a generated form for testing for CSRF issues.<br>It will only be<br>
enabled for POST requests, if the API is enabled and if Java supports the opening of URLs in a browser<br>
on your platform.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
</table>