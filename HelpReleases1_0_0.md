# Release 1.0.0

The following changes were made in this release:
## Significant changes:
### Help screens
Help screens have been added for all of the functionality now provided by ZAP.<br>Context sensitive help<br>
has also been implemented so that when you press the F1 key then the help screen associated with the<br>
tab you have selected will be displayed.<br>
<h3>Break Points</h3>
The implementation of <a href='HelpStartConceptsBreakpoints'>Break Points</a> has been changed to be closer to that provided by software Integrated Development Environments.<br>The break point controls have been moved to the new <a href='HelpUiTltoolbar'>Top Level Toolbar</a>.<br>Break points can now also be set by right clicking nodes in the <a href='HelpUiTabsSites'>Sites</a> and <a href='HelpUiTabsHistory'>History tabs</a>.<br>
<h3>Report menu</h3>
The <a href='HelpUiTlmenuReport'>Report Menu</a> has been significant changed and now includes the following menu items:<br>
<table>
<tr><td></td><td>Generate Report...</td><td>Which now generates reports on demand</td></tr>
<tr><td></td><td>Export Messages to File...</td><td>Moved from the <a href='HelpUiTlmenuFile'>File Menu</a></td></tr>
<tr><td></td><td>Export Response to File...</td><td>Moved from the <a href='HelpUiTlmenuFile'>File Menu</a></td></tr>
<tr><td></td><td>Export ALL URLs to File...</td><td>New functionality</td></tr>
<tr><td></td><td>Compare with another session...</td><td>New functionality</td></tr>
</table>
<h3>Improved history searching</h3>
The new <a href='HelpUiTabsSearch'>Search tab</a> allows you to search for regular expressions in all of the URLs, requests and responses. <br>Next and previous buttons allow you view the found search terms in the <a href='HelpUiTabsRequest'>Request</a> and <a href='HelpUiTabsResponse'>Response tabs</a>. <br>
<h3>History filter</h3>
<a href='HelpUiTabsHistory'>The History Filter Toolbar</a> has been added which allows you to restrict which requests are displayed.<br>Requests can be filtered based on the HTTP methods, the HTTP result codes, and any <a href='HelpStartConceptsTags'>tags</a>, <a href='HelpStartConceptsAlerts'>alerts</a>, or <a href='HelpStartConceptsNotes'>notes</a> that have been applied.<br>
<h3>Notes</h3>
You can now associate <a href='HelpStartConceptsNotes'>notes</a> with any request.<br>
<h3>Multiple Tags</h3>
You can now associate multiple <a href='HelpStartConceptsTags'>tags</a> with any request.<br>
<h3>More control over the alerts</h3>
The <a href='HelpUiDialogsAddalert'>Add Alert dialog</a> allows you to manually add or change an alert.<br>
<h3>New encoder/decoder</h3>
A new <a href='HelpUiDialogsEnc_dec'>Encode/Decode/Hash dialog</a> has replaced the previous Encoder/Decoder.<br>
<h3>Passive scanning</h3>
<a href='HelpStartConceptsPscan'>Passive scanning</a> has been added.<br>In this release ZAP will only use passive scanning for automatically adding <a href='HelpStartConceptsTags'>tags</a>.<br>In future releases it may also raise <a href='HelpStartConceptsAlerts'>alerts</a> for potential issues.<br>
<h2>Minor changes:</h2>
<h3>The Top Level Toolbar</h3>
<a href='HelpUiTltoolbar'>The Top Level Toolbar</a> has been added which provides a set up buttons for commonly used functionality.<br>
<h3>Alert footer summaries</h3>
Counts of the High, Medium, Low and Informational <a href='HelpStartConceptsAlerts'>alerts</a> are now displayed in the <a href='HelpUiFooter'>footer</a>.<br>
<h3>New look and feel</h3>
A new look and feel 'Nimbus' is used.<br>
<h3>Proxy password handling</h3>
<a href='HelpUiDialogsOptionsConnection'>The Options Connection screen</a> has a new option to 'Prompt for proxy credentials on start up'.<br>If this option is selected then your proxy password will not be stored on the hard disk.<br>
<h3>Resend from the Sites tab</h3>
The <a href='HelpUiTabsSites'>Sites tab</a> has a new right click menu item that allows you to resend the request after making any changes to it that you want to.<br>
<h3>User directory maintained between sessions</h3>
The last directory used by the user is now stored in the config file so that it is maintained between<br>
sessions.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
</table>