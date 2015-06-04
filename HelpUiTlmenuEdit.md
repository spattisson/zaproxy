# The Edit menu
This menu handles finding strings in specific tabs, searching for strings across all requests and responses
and managing session tracking.
### Find...
This opens the [Find dialog](HelpUiDialogsFind) which allows you to find a string in the currently selected window.<br>
<h3>Enable Session Tracking (Cookie)</h3>
This allows session details stored in cookies to be tracked.<br>This option must be selected to enable the<br>
"Use current tracking session" checkbox in the <a href='HelpUiDialogsResend'>Resend</a> and <a href='HelpUiDialogsMan_req'>Manual Request Editor dialogs</a>. <br>Session tracking ensures that any requests are sent with the latest session details.<br>For example you may record a session when logged in as one user and then logout and login as another user.<br>If you resend a request from the first session without session tracking then it will use the cookies from the first session.<br>If you resend the same request with session tracking then it will use the cookies from the second session.<br>
<h3>Reset Session State</h3>
This clears the session tracking.<br>
<h3>Search...</h3>
This selects the <a href='HelpUiTabsSearch'>Search tab</a> which allows you to search for regular expressions in all URLs, requests and responses..<br>
<h3>Next</h3>
This selects the next occurrence of the last string searched for.<br>The relevant message will be selected<br>
in the Search tab and the string will be displayed and highlighted in the <a href='HelpUiTabsRequest'>Request</a> or <a href='HelpUiTabsResponse'>Response</a> tab as appropriate.<br>
<h3>Previous</h3>
This selects the previous occurrence of the last string searched for.<br>The relevant message will be selected<br>
in the Search tab and the string will be displayed and highlighted in the <a href='HelpUiTabsRequest'>Request</a> or <a href='HelpUiTabsResponse'>Response</a> tab as appropriate.<br>
<h3>Encode/Decode/Hash...</h3>
This displays the <a href='HelpUiDialogsEnc_dec'>Encode/Decode/Hash dialog</a>.<br>
<br>
Note that <a href='HelpStartConceptsAddons'>add-ons</a> can add additional menu items.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiTlmenuTlmenu'>The top level menu</a></td><td></td></tr>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
</table>