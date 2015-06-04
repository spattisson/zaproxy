# Release 1.2.0

The following changes were made in this release:
## Significant changes:
### Memory Leaks
Memory leaks have been fixed in the [active scanner](HelpStartConceptsAscan) and [spider](HelpStartConceptsSpider).
### Invoke applications
External applications can now be invoked from the Sites and History tabs.
### Passive Scanner
The [passive scanner](HelpStartConceptsPscan) now looks for vulnerabilities, such as:
<table>
<tr><td></td><td>Autocomplete forms with password fields</td></tr>
<tr><td></td><td>Cookies without the 'HttpOnly' flag</td></tr>
<tr><td></td><td>SSL Cookies without the 'secure' flag</td></tr>
<tr><td></td><td>Weak authentication</td></tr>
</table>
## Minor changes:
### XML Reports
A new 'Generate XML Report...' menu item is now included in the top level [Reports](HelpUiTlmenuReport) menu.
### Manual Request Editor and Resend dialogs
Requests submitted by the [Manual Request Editor](HelpUiDialogsMan_req) and [Resend](HelpUiDialogsResend) dialogs are now shown in the [Sites](HelpUiTabsSites) and [History](HelpUiTabsHistory) tabs.<br>A new 'Method' pull down allows you to switch between the HTTP methods, this automatically moves parameters between the URL and the body when a POST method is selected or deselected.<br>
<h3>Alerts UI</h3>
The <a href='HelpUiTabsSites'>Sites</a> tab now shows any alerts as flags to the right of any node names.<br>The alert counts in the <a href='HelpUiFooter'>footer</a> now show the number of different types of alerts rather than the total number of instances.<br>
<h3>Active scanner delay option</h3>
The delay in milliseconds between each <a href='HelpStartConceptsAscan'>active scanner</a> request can now be set via the <a href='HelpUiDialogsOptionsAscan'>Options Active Scan screen</a>. This will increase the time an active scan takes but will reduce the load on the target.<br>
<h3>UI Changes</h3>
The <a href='HelpUiTabsSites'>Sites</a> tab now takes up all of the left hand side - this can be changed back via the <a href='HelpUiDialogsOptionsAscan'>Options Display screen</a> if required.<br><br>The 'toolbar' on the <a href='HelpUiTabsRequest'>Request</a>, <a href='HelpUiTabsResponse'>Response</a> and <a href='HelpUiTabsBreak'>Break</a> tabs and the <a href='HelpUiDialogsMan_req'>Manual Request Editor</a> and <a href='HelpUiDialogsResend'>Resend</a> dialogs is now at the top rather than the bottom.<br><br>The scanner counts in the <a href='HelpUiFooter'>footer</a> are now displayed on the right hand side.<br><br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>