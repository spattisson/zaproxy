# Sites tab

The Sites tab shows all of the URLs visited in a tree structure. <br>You can select any of the nodes in the<br>
tree to display the request and response for that URL in the relevant tabs.<br>
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
<h3>Delete</h3>
This will remove the node and all of its children from ZAP.<br>However they can be added back in, to prevent<br>
this use the 'Exclude from' menus.<br>
<h3>Break...</h3>
This will bring up a new window which will allow you to set a <a href='HelpStartConceptsBreakpoints'>break point</a> on that URL.<br>The break point is defined via a regular expression. If you visit a URL which matches this expression then ZAP will intercept it and allow you to change either the request and/or the response.<br>
<h3>Alerts for this node</h3>
If the URL selected has <a href='HelpStartConceptsAlerts'>alerts</a> associated with it then they will be listed under this menu.<br>Selecting one of the alerts will cause it to be displayed.<br>
<h3>Resend...</h3>
This will bring up the <a href='HelpUiDialogsResend'>Resend dialog</a> which allows you to resend the request after making any changes to it that you want to.<br>
<h3>New Alert...</h3>
This will bring up the <a href='HelpUiDialogsAddalert'>Add Alert dialog</a> which allows you to manually record a new <a href='HelpStartConceptsAlerts'>alert</a> against this request.<br>
<h3>Show in History tab</h3>
This will show the selected node in the <a href='HelpUiTabsHistory'>History tab</a>.<br>
<h3>Open URL in Browser</h3>
This will open the URL of the selected node in your default browser.<br>
<h3>Generate anti CSRF test form</h3>
This will open a URL which will give you a generated form for testing for CSRF issues.<br>It will only be<br>
enabled for POST requests, if the API is enabled and if Java supports the opening of URLs in a browser<br>
on your platform.<br>
<h3>Refresh Sites tree</h3>
Occasionally the Sites tree can be displayed incorrectly - this option will redraw it.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
</table>