# Alerts

An alert is a potential vulnerability and is associated with a specific request.<br>A request can have more<br>
than one alert.<br>

Alerts are shown in the UI with a flag indicating the risk:<br>
<table>
<tr><td></td><td> <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/071.png' />  High</td><td></td></tr>
<tr><td></td><td> <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/076.png' />  Medium</td><td></td></tr>
<tr><td></td><td> <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/074.png' />  Low</td><td></td></tr>
<tr><td></td><td> <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/073.png' />  Informational</td><td></td></tr>
<tr><td></td><td> <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/072.png' />  False Positive</td><td></td></tr>
</table>

Alerts can be raised either via <a href='HelpStartConceptsAscan'>active scanning</a> or manually using the <a href='HelpUiDialogsAddalert'>Add Alert dialog</a>.<br>This dialog also allows you to change alerts.<br>
<br>
Alerts are flagged in the <a href='HelpUiTabsHistory'>History tab</a> with a flag which indicates the highest risk alert.<br>All alerts are listed in the <a href='HelpUiTabsAlerts'>Alerts tab</a> and a count of the total number of alerts by risk is shown in the <a href='HelpUiFooter'>footer</a>.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
</table>