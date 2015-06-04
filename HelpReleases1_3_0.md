# Release 1.3.0

The following changes were made in this release:
## Significant changes:
### Fuzzing
Strings in a response can now be fuzzed to try to find vulnerabilities.<br>Anti CRSF tokens can be detected<br>
and automatically regenerated when fuzzing.<br>This functionality is based on code from the OWASP JBroFuzz<br>
project.<br>
<h3>Dynamic SSL certificates</h3>
The support for SSL connections was improved and simplified.<br>User's can now create their own root certificate<br>
and distribute this into their HTTP clients.<br>See <a href='HelpUiDialogsOptionsDynsslcert'>Option: Dynamic SSL Certificates</a> for more details.<br>
<h3>Daemon mode and API</h3>
Starting ZAP with the "-daemon" command line option will cause it to run in the background in 'headless'<br>
mode, meaning that no UI is displayed.<br>An initial API has been implemented in XML, JSON and HTML.<br>If ZAP<br>
is running as a daemon then the API is automatically enabled, otherwise the API must be enabled via the<br>
Options API screen.<br>The API can be navigated by opening <a href='http://zap/'>http://zap/</a> in your browser when proxying via<br>
ZAP.<br>
<h3>Beanshell integration</h3>
The <a href='http://www.beanshell.org/'>BeanShell</a> is an interactive Java shell that can be used to execute BeanShell scripts.<br>These scripts are a simplified form of Java that use many elements from Java syntax, but in a simpler scripting format. <br>All Java code is also valid BeanShell code.<br>BeanShell integration in OWASP ZAP enables you to write scripts using the ZAP functions and data set.<br>This can be a very powerful feature for analyzing web applications.<br>
<h3>Full internationalisation</h3>
All display string are now fully internationalised.<br>
<h3>Localisation</h3>
Out of the box support for the following languages:<br>
<table>
<tr><td></td><td>English</td></tr>
<tr><td></td><td>Brazilian Portuguese</td></tr>
<tr><td></td><td>Chinese</td></tr>
<tr><td></td><td>French</td></tr>
<tr><td></td><td>German</td></tr>
<tr><td></td><td>Greek</td></tr>
<tr><td></td><td>Indonesian</td></tr>
<tr><td></td><td>Japanese</td></tr>
<tr><td></td><td>Polish</td></tr>
<tr><td></td><td>Spanish</td></tr>
</table>
<h2>Minor changes:</h2>
<h3>Hex view</h3>
The <a href='HelpUiTabsRequest'>Request</a>, <a href='HelpUiTabsResponse'>Response</a> tabs now provide a 'Hex View' option which will display the request and response bodies in hex format.<br>
<h3>Search results</h3>
The <a href='HelpUiTabsSearch'>Search tab </a> now displays all instances of a string found rather than just the first instance in each request or response.<br>
<h3>Exclude URLs</h3>
URLs can be explicitly excluded from the active scanner, spider and from the proxy.<br>
<h3>Copy support</h3>
Most of the panels now provide a 'right click' 'Copy' menu option, including the Port Scan and Brute<br>
Force panels.<br>
<h3>Undo/Redo support</h3>
All of the input fields now support Undo/Redo actions using the operating systems default Undo/Redo accelerators:<br>
<ul><li>Windows/Linux: Ctrl+Z / Ctrl+Y<br>
</li><li>Mac OS X: Cmd+Z / Cmd+Shift+Z<br>
<h3>Port scanner proxy support and timeout option</h3>
The Port Scanner can now use the outgoing proxy (if configured) and the timeout in milliseconds can also<br>
now be set.<br>
<h3>Request and response break buttons</h3>
There are now 2 'Set Break' buttons to allow breaks to be set on all requests and all responses independently.<br>
<h3>Expand Sites and Information tab buttons</h3>
There are now 2 buttons which allow you to switch between having the Sites and Information tabs expanded.<br>
<h3>Break tab icon changes colour when break point hit</h3>
While the Break tab is not in use its icon is a grey cross:  <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/101grey.png' /> .<br>When a <a href='HelpStartConceptsBreakpoints'>break point</a> is hit the tab icon is changed to a red cross:  <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/101.png' /> .<br>
<h3>Adjustable timeout</h3>
The <a href='HelpUiDialogsOptionsConnection'>Option: Connection</a> screen allows you to set the timeout in seconds to make it easier to test slow applications.<br>
<h3>Library updates</h3>
Most of the libraries used by ZAP have been updated to the latest versions.<br>
<h3>A new icon :)</h3>
Thanks to Simon Egli and all others for submitting cool icon suggestions.<br>
<h2>Known issues:</h2>
<h3>Mac OS X: Dynamic SSL and Google Chrome</h3>
Currently Dynamic SSL is not working when using Google Chrome. This is because of an unresolved known<br>
issue with Google Chrome and Mac OS X Keychain. When importing OWASP ZAP's Root CA into the keychain<br>
and requesting a SSL website, an "Invalid certificate" error message is shown.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>