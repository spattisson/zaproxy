# Spider dialog

This dialog launches the [spider](HelpStartConceptsSpider).<br>
<h2>Scope</h2>
The first tab allows you to select or change the starting point.<br>If the starting point is in one or more<br>
<a href='HelpStartConceptsContexts'>Contexts</a> then you will be able to choose one of them.<br>If that context has any <a href='HelpStartConceptsUsers'>Users</a> defined then you will be able to select one of them.<br>If you select one of the users then the spider will be performed as that user, with ZAP (re)authenticating as that user whenever necessary. <br><br>If you select 'recurse' then all of the nodes underneath the one selected will also be used to seed the spider. <br><br>If you select 'Show advanced options' then the following tab will be shown which provide fine grain control over the spider process. <br><br>Clicking on the 'Reset' button will reset all of the options to their default values.<br>
<h2>Advanced</h2>
Most of the parameters on this tab correspond to the same parameters on the <a href='HelpUiDialogsOptionsSpider'>Options Spider screen</a>.<br>
<h3>Maximum children to crawl</h3>
This parameter limits the number of children that will be crawled at every node in the tree.<br>This is useful<br>
for data driven applications that have large numbers of 'pages' that are in fact exactly the same code<br>
but containing different data, for example from a database.<br>By default this is set to zero which means<br>
there are no limits applied to the number of child nodes crawled.<br>
<h2>Accessed via</h2>
<table>
<tr><td></td><td><a href='HelpUiTabsSpider'>Spider tab</a></td><td>'New Scan' button</td></tr>
<tr><td></td><td><a href='HelpUiTabsSites'>Sites tab</a></td><td>'Attack / Spider...' right click menu item</td></tr>
<tr><td></td><td><a href='HelpUiTabsHistory'>History tab</a></td><td>'Attack / Spider...' right click menu item</td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsDialogs'>Dialogs</a></td><td>for details of the dialogs or popups </td></tr>
</table>