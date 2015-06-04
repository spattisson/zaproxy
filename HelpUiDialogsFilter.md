# Filter dialog

This allows you to set [filters](HelpStartConceptsFilters) that are applied to requests and responses.
The following filters are supported by default.
## Change user agent to other browsers
## Detect insecure or potentially malicious content in HTTP responses
## Detect and alert 'Set-cookie' attempt in HTTP response for modification
## Avoid browser cache (strip off IfModifiedSince)
## Log cookies sent by browser
## Log unique GET queries into file
## Log unique POST queries into file
## Log request and response into file
## Replace HTTP request body using defined pattern
## Replace HTTP request header using defined pattern
## Replace HTTP response body using defined pattern
## Replace HTTP response header using defined pattern
## Send ZAP session request ID

This filter will add a special header tag to each request send to the server. So you can track ZAP's
requests, when investigating your own web application. It's helpful to have a distinct id for multiple
requests, when parsing for example HTTP server's log files.

Request header is modified like this (example):
<pre>
X-ZAP-RequestID: <sessionName>–<number><br>
</pre>
  * ```
sessionName```is URL encoded name of the session
  * ```
number```is starting by one; increased on each request; is valid only per session
## Accessed via
<table>
<tr><td></td><td><a href='HelpUiTlmenuTools'>Top level Tools menu</a></td><td>'Filter...' menu item</td></tr>
</table>
## See also
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsDialogs'>Dialogs</a></td><td>for details of the dialogs or popups </td></tr>
</table>