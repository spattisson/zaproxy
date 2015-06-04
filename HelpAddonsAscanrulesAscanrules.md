# Active Scan Rules
The following release quality active scan rules are included in this add-on:
## Code Injection
This rule submits PHP and ASP attack strings as values for URL parameters in a request and examines the
response to see if those values have been evaluated by the server. First, requests are constructed and
sent containing injected PHP instructions to print a token. In the event of a match between the token
and the content of the response body, the scanner raises an alert and returns immediately. If there aren't
any matches, the scanner will construct requests with several injected ASP strings that instruct the
server to write the product of two randomly generated integers in the response. If the body of the response
matches the product, an alert is raised.
## Command Injection
This rule submits `*`NIX and Windows OS commands as URL parameter values to determine whether or not the
web application is passing unchecked user input directly to the underlying OS. The injection strings
consist of meta-characters that may be interpreted by the OS as join commands along with a payload that
should generate output in the response if the application is vulnerable. If the content of a response
body matches the payload, the scanner raises an alert and returns immediately. In the event that none
of the error-based matching attempts return output in the response, the scanner will attempt a blind
injection attack by submitting sleep instructions as the payload and comparing the elapsed time between
sending the request and receiving the response against a heuristic time-delay lower limit. If the elapsed
time is greater than this limit, an alert is raised with medium confidence and the scanner returns immediately.
## Client Browser Cache
This rule checks the headers of secure pages and reports an alert if they allow a browser to cache the
page.
## Cross Site Scripting (reflected)
This rule starts by submitting a 'safe' value and analyzing all of the locations in which this value
occurs in the response (if any). <br>It then performs a series of attacks specifically targeted at the location<br>
in which each of the instances occurs, including tag attributes, URL attributes, attributes in tags which<br>
support src attributes, html comments etc.<br>
<h2>Cross Site Scripting (persistent)</h2>
This rule starts by submitting a unique 'safe' value and then spiders the whole application to find all<br>
of the locations in which the value occurs.<br>It then performs a series of attacks in the same way that<br>
the 'reflected' version does but in this case checks all of the target locations in other pages.<br>
<h2>Directory Browsing</h2>
This rule checks to see if a request will provide access to a directory listing by examining the response<br>
body for patterns used with Apache, IIS and other web server software.<br>
<h2>External Redirect</h2>
This rule submits a variety of URL redirect strings as parameter values in a request, then examines the<br>
headers and bodies of responses to determine whether or not a redirect occurred and of what type. The<br>
cause of redirect is searched for in the "Location" and "Refresh" header fields, as well as by HTML meta<br>
tags and Javascript in the body of the response. An alert is raised including the redirection type and<br>
the scanner returns immediately.<br>
<h2>CRLF Injection</h2>
This rule submits various CRLF special characters preceding an injected "Set-Cookie" header as a parameter<br>
to the server. If the response contains an identical Set-Cookie header, an alert is raised and the scanner<br>
returns immediately.<br>
<h2>Parameter Tampering</h2>
This rule submits requests with parameter values known to cause errors to be displayed to the user if<br>
handled improperly. Responses are checked to make sure that they return a server error status code, then<br>
compared with a normal HTTP response to make sure it does not raise an alert if the bad parameter has<br>
no effect on output. Finally, the content of the reponse body is compared against various patterns that<br>
may be found in Java servlet, Microsoft VBScript, OLE DB, JET, PHP and Tomcat errors. If a match is found,<br>
an alert is raised and the scanner returns immediately.<br>
<h2>Path Traversal</h2>
This rule attempts to access files and directories outside of the web document root by constructing various<br>
combinations of pathname prefixes and local file targets for Windows and <code>*</code>NIX systems as well as Java<br>
servlets. If the body of the response matches a pattern corresponding to the current target file an alert<br>
is raised and the scanner returns immediately. If none of the common local file targets succeed, path<br>
traversal is attempted using the filename in the URL. As long as submitting an arbitrary filename does<br>
not return an OK status code but the real filename does, an alert is raised and the scanner returns immediately.<br>
<h2>Remote File Include</h2>
This rule submits a series of requests with external URLs as parameter values and looks for a match between<br>
the the response body and the title of the page hosted at those URLs. If there is a match between the<br>
expected string and the response body, and the header returned a status code of 200, an alert is raised<br>
and the scanner returns immediately.<br>
<h2>Server Side Include</h2>
This rule checks to see what OS the server is running on, then sends requests with a corresponding HTML<br>
SSI directive as a parameter value. If the response body matches a pattern indicating the SSI was successful,<br>
an alert is raised and the scanner returns immediately.<br>
<h2>SQL Injection</h2>
This scanner scans for SQL Injection vulnerabilities in an RDBMS-independent fashion, by attacking url<br>
parameters and form parameters with fragments of valid and invalid SQL syntax, using error based, boolean<br>
based, Union based, and stacked query SQL Injection techniques. <br>This scanner may be able to fingerprint<br>
the RDBMS if the application throws a known RDBMS specific SQL error message. <br>This scanner does not exploit<br>
any RDBMS specific techniques, and so is the best SQL injection scanner to use as a starting point.