# Release 1.4.0

The following changes were made in this release:
## Significant changes:
### Issue 133 (on Google Code): Add Syntax highlighting to Response Panel
The HTML panels now support switchable syntax highlighting.
### Issue 153 (on Google Code): fuzzdb integration
The fuzzer includes fuzzdb (http://code.google.com/p/fuzzdb/) fuzzing files.<br>Note that some fuzzdb files<br>
have been left out as they cause common anti virus scanners to flag them as containing viruses.<br>You can<br>
replace them (and upgrade fuzzdb) by downloading the latest version of fuzzdb and expanding it in the<br>
'fuzzers' library.<br>
<h3>Issue 212 (on Google Code): Parameter analysis</h3>
A new Params tab shows a summary of all of the parameters a site has used.<br>
<h3>Issue 228 (on Google Code): Enhanced XSS scanner</h3>
The Cross Site Scripting active scanner has been rewritten from scratch to find more potential XSS issues<br>
and report fewer false positives.<br>
<h3>Issue 244 (on Google Code): Port the Watcher passive checks</h3>
The following checks have been ported from Watcher (thanks to Chris Weber for oking this):<br>
<table>
<tr><td></td><td>Check.Pasv.CrossDomain.ScriptReference.cs</td><td>checks for cross-domain javascript files inclusion.</td></tr>
<tr><td></td><td>Check.Pasv.Header.CacheControl.cs</td><td>checks HTTP cache-control header on SSL pages.</td></tr>
<tr><td></td><td>Check.Pasv.Header.ContentTypeMissing.cs</td><td>checks that the Content-Type HTTP header is not missing.</td></tr>
<tr><td></td><td>Check.Pasv.Header.FrameOptions.cs</td><td>checks that the X-FRAME-OPTIONS is not missing or insecurely set.</td></tr>
<tr><td></td><td>Check.Pasv.Header.IeXssProtection.cs</td><td>checks that the X-XSS-Protection has not been set to disable IE's XSS protection.</td></tr>
<tr><td></td><td>Check.Pasv.Header.MimeSniff.cs</td><td>checks that the X-CONTENT-TYPE-OPTIONS has been set.</td></tr>
<tr><td></td><td>Check.Pasv.InformationDisclosure.DatabaseErrors.cs</td><td>checks for database error messages.</td></tr>
<tr><td></td><td>Check.Pasv.InformationDisclosure.DebugErrors.cs</td><td>checks for debugging error messages.</td></tr>
<tr><td></td><td>Check.Pasv.InformationDisclosure.InUrl.cs</td><td>checks for information disclosure in URL parameters.</td></tr>
<tr><td></td><td>Check.Pasv.InformationDisclosure.ReferrerLeak.cs</td><td>checks HTTP Referer header for information disclosure.</td></tr>
</table>
<h3>Issue 253 (on Google Code): Plugable extensions</h3>
Full extensions can now be plugged into ZAP dynamically with full access to all of ZAPs features.<br>
<h2>Minor changes:</h2>
<h3>Issue 54 (on Google Code): Clean shutdown</h3>
<h3>Issue 90 (on Google Code): Add GUI support for unsecure SSL/TLS renegotiation</h3>
<h3>Issue 102 (on Google Code): Save raw response and request, and save body of response and request</h3>
<h3>Issue 126 (on Google Code): Allow working directory and config file to be set via cmd line</h3>
<h3>Issue 154 (on Google Code): Include param id in reports</h3>
<h3>Issue 164 (on Google Code): Toolbar config button</h3>
<h3>Issue 168 (on Google Code): Reveal hidden fields in web pages</h3>
<h3>Issue 192 (on Google Code): Enable/Disable breakpoints</h3>
<h3>Issue 193 (on Google Code): Detect directory traversal vulnerabilities</h3>
<h3>Issue 194 (on Google Code): Enhancement: Show request ID on Search pane</h3>
<h3>Issue 200 (on Google Code): Detect CSRF vulnerabilities</h3>
<h3>Issue 230 (on Google Code): Enhance zap.sh to cope with symbolic links</h3>
<h3>Issue 236 (on Google Code): Option to toggle URLencoding</h3>
<h3>Issue 242 (on Google Code): Export node / req/resp via right click</h3>
<h3>Issue 248 (on Google Code): Delete alerts / retest feature request</h3>
<h3>Issue 251 (on Google Code): Restructure alerts code</h3>
<h3>Issue 253 (on Google Code): Allow extensions to define dependencies</h3>
<h3>Issue 270 (on Google Code): Icon changes</h3>
<h3>Issue 277 (on Google Code): Rationalize right click menu items</h3>
<h3>Issue 279 (on Google Code): Core extensions</h3>
<h3>Issue 282 (on Google Code): Add author, description and URL to extensions</h3>
<h2>Bug fixes:</h2>
<h3>Issue 42 (on Google Code): Arbitrary Redirection</h3>
<h3>Issue 94 (on Google Code): PKCS#11 driver</h3>
<h3>Issue 107 (on Google Code): The last intercepted request/response remains in the Break window</h3>
<h3>Issue 135 (on Google Code): Broken URLs in Sites Panel</h3>
<h3>Issue 148 (on Google Code): New HTTP Panel broke the Undo/Redo Manager</h3>
<h3>Issue 180 (on Google Code): Tabular view for GET request</h3>
<h3>Issue 187 (on Google Code): Encoding issues</h3>
<h3>Issue 197 (on Google Code): Decoder cannot process base64 input without line breaks</h3>
<h3>Issue 198 (on Google Code): The report is not generated when a "Parameter tampering" alert with "NULL" character exists</h3>
<h3>Issue 210 (on Google Code): Exception thrown when using the "Path Traversal" option in the active scan</h3>
<h3>Issue 223 (on Google Code): Exception in "Sites" tab when choosing a popup option, "Delete (from view)" or "Purge (from DB)", when no node tree is selected</h3>
<h3>Issue 224 (on Google Code): takes too much time to recover from an proxy port number outside valid range</h3>
<h3>Issue 225 (on Google Code): ZAP exits on startup if an option value contains extended characters like å,ä,ö</h3>
<h3>Issue 226 (on Google Code): proxy port number edit box should not allow millions of characters</h3>
<h3>Issue 227 (on Google Code): Tools, Options should go to the same tab as last time</h3>
<h3>Issue 237 (on Google Code): Bug: Problems with HTTP Panels</h3>
<h3>Issue 238 (on Google Code): Exception when using a custom fuzz file</h3>
<h3>Issue 241 (on Google Code): zap.sh Xmx value for stable performance</h3>
<h3>Issue 243 (on Google Code): When the DynamicLoader loads from local jar, doesn't take into account the package name</h3>
<h3>Issue 246 (on Google Code): Pragma Header requires Cache-Control Header for HTTP/1.1 requests</h3>
<h3>Issue 255 (on Google Code): Exception in API when due to illegal character in XML context</h3>
<h3>Issue 256 (on Google Code): Calling HttpMessage.setGetParams looses the port</h3>
<h3>Issue 260 (on Google Code): Exception when deleting ("Purge (from DB)") "History" tab entries</h3>
<h3>Issue 261 (on Google Code): Partial language match not working</h3>
<h3>Issue 262 (on Google Code): "Weak authentication" alerts not showing with spider</h3>
<h3>Issue 263 (on Google Code): "Cookie without secure flag" alerts not showing with spider</h3>
<h3>Issue 264 (on Google Code): Exception in "Manual Request Editor"/"Resend" dialogues</h3>
<h3>Issue 268 (on Google Code): Change ZAP Report XML</h3>
<h3>Issue 269 (on Google Code): Spider depth parameter</h3>
<h3>Issue 274 (on Google Code): Tidy up delete / purge options</h3>
<h3>Issue 280 (on Google Code): Escape URLs in sites tree</h3>
<h3>Issue 283 (on Google Code): RFE: Font anti-aliasing not enabled by default in request/response</h3>
<h3>Issue 284 (on Google Code): Request/response etc header panels too small</h3>
<h3>Issue 286 (on Google Code): Search string not highlighted for fuzz results</h3>
<h3>Issue 287 (on Google Code): Passive scanner doesnt pick up new anticsrf tokens</h3>
<h3>Issue 289 (on Google Code): fuzzdb files cause virus alerts</h3>
<h3>Issue 291 (on Google Code): Path Traversal has 'param' empty but put the param name in 'attack'</h3>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>