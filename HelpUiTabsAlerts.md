# Alerts tab

The Alerts tab show the [Alerts](HelpStartConceptsAlerts) that have been raised in this session.<br>The alerts are displayed in a tree in risk order in the left hand pane, and each node of the tree shows the total number of alerts underneath it.<br>Selecting an alert with one click will display it in the right hand pane.<br>Double clicking an alert will display the <a href='HelpUiDialogsAddalert'>Add Alert</a> dialog which will allow you to change the alert details.<br>
<br>
Alerts can either be raised by <a href='HelpStartConceptsAscan'>Automated scanning</a> or manually via the <a href='HelpUiTabsHistory'>History tab</a>.<br>
<h2>Filtering alerts</h2>
The filter buttons, shown immediately above the tree, allows you to restrict which alerts are displayed:<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/target.png' /> / <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/fugue/target-grey.png' />  Show only URLs in Scope / Show all URLs</h3>
Allows to show only the alerts of URLs that are in <a href='HelpStartConceptsScope'>scope</a>.<br>
<h3><img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/094.png' /> / <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/earth-grey.png' />  Link / Unlink with Sites selection</h3>
Allows to show only the alerts of the <a href='HelpUiTabsSites'>Sites tab</a> selected tree node.<br>
<br>
<b>Note:</b> Selecting one filter will disable the other as they are mutually exclusive.<br>
<h2>Right click menu</h2>
Right clicking on a node will bring up a menu which will allow you to:<br>
<h3>Resend...</h3>
This will bring up the <a href='HelpUiDialogsResend'>Resend dialog</a> which allows you to resend the request associated with the alert after making any changes to it that you want to.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
</table>