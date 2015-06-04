# Session Contexts dialogs

These screens allows you manage [contexts](HelpStartConceptsContexts).

There is a set of screens for each context you define.
### Top screen
This allows you to set the context name and description.
### Include in context
This allows you to manage the URLs which will be included in the context.<br>URLs which dont match any of<br>
the regexs will not be included in the context.<br>
<h3>Exclude from context</h3>
This allows you to manage the URLs which will be excluded from the context.<br>You only need to specify regexs<br>
for URLs that you do not want to include but which match one or more of the 'include' regexes.<br>
<h3>Technology</h3>
This allows you to specify the technologies used in the context, if known.<br>By default all technologies<br>
are included.<br>If you exclude technologies that you know are not used then this may speed up <a href='HelpStartConceptsAscan'>active scanning</a> as rules specific to the excluded technologies can be skipped.<br>
<h3>Authentication</h3>
This allows you to manage the way in which <a href='HelpStartConceptsAuthentication'>Authentication</a> is being done for the Context. Note that changing the authentication method after Users have been defined will cause them to be deleted, as the type of user credentials needs to match the authentication scheme. After selecting the Authentication Method type, the options that need to be configured depend on the Authentication Method.<br>
<h4>Manual Authentication</h4>
No configuration is needed for this authentication method. Read <a href='HelpStartConceptsAuthentication#manual'>more</a>...<br>
<h4>Form-Based Authentication</h4>
To configure this authentication method, you need to supply the <b>login url</b>, to which the login request<br>
is performed, the <b>request body</b> (POST data), if needed, and identify the <b>parameters</b> used to supply the<br>
'username' and 'password'. If no request body is supplied, the login request is performed as a HTTP GET,<br>
otherwise an HTTP POST is used. The credentials themselves are configured in the <a href='HelpUiDialogsSessionContexts#users'>Users</a> tab. Read <a href='HelpStartConceptsAuthentication#formBased'>more</a>...<br>
<h4>HTTP/NTLM Authentication</h4>
To configure this authentication method, you need to supply the <b>hostname</b> and the <b>port</b> of the server the<br>
authentication is done with and the <b>realm</b> the credentials apply to. The credentials themselves are configured<br>
in the <a href='HelpUiDialogsSessionContexts#users'>Users</a> tab. Read <a href='HelpStartConceptsAuthentication#httpAuth'>more</a>...<br>
<h4>Script-Based Authentication</h4>
To use this authentication method, you <b>first</b> need to write (and save) an <b>Authentication Script</b> using<br>
the <b>Scripts</b> tab (see the provided examples and templates for this script type in the Scripts tab). Then<br>
you need to supply the name of the script in the dropdown list. After selecting the script, you need<br>
to press the <b>Load</b> button, loading all the requirements of the script. Any parameters that you have specified<br>
as <i>required</i> or <i>optional</i> in the script will be shown in the interface to be defined. Their values are<br>
available to be used in the script, during the authentication, as seen in the provided examples for Authentication<br>
Scripts. Make sure that after doing any changes to the parameters required by the Authentication script<br>
you re-load the script. Otherwise, the parameters shown in the interface might not be the ones used during<br>
the authentication and errors might occur. The <i>credentials</i> used for each User during the authentication<br>
processed can be also specified in the Authentication Script and are configured in the <a href='HelpUiDialogsSessionContexts#users'>Users</a> tab. Read <a href='HelpStartConceptsAuthentication#scriptBased'>more</a>...<br>
<h3>Session Management</h3>
This allows you to manage the way in which Session Management is being done for the Context. After selecting<br>
the Session Management Method type, the options that need to be configured depend on the Session Management<br>
Method.<br>
<h4>Cookie-Based Session Management</h4>
No configuration is needed for this session management method. Read <a href='HelpStartConceptsSessionManagement#cbsm'>more</a>...<br>
<h3>Users</h3>
This allows you to configure a set of Users that may be used for various other actions throughout the<br>
application.<br>
<br>
The credentials section of the Users depends on the Authentication Method configured for the Context.<br>
<h2>URL regexs</h2>
In the <i>Include in <code>*</code></i>, <i>Exclude from <code>*</code></i> panels and the <i>Logged in/out indicators</i> of the <i>Authentication</i> panel,<br>
you can enter regular expressions to define excluded URLs. While you can escape a single meta-character<br>
with a backslash, you can also use the <b>\Q...\E</b> escape sequence. All the characters between the <b>\Q</b> and<br>
the <b>\E</b> are interpreted as literal characters. E.g. \Q<code>*</code>\d+<code>*</code>\E matches the literal text <code>*</code>\d+<code>*</code>. This escape<br>
sequence is used in ZAP when you exclude URLs via some context menus. <br><b>Note:</b> If your URL contains a "\E",<br>
then you have to do the following steps when using the <b>\Q...\E</b> escape sequence:<br>
<ul><li>Open the escape sequence<br>
</li><li>Close the escape sequence before the "character" \E<br>
</li><li>Escape the backslash<br>
</li><li>Open after the "\E" another escape sequence;<br>
</li><li>Close the escape sequence as normally would.<br>
<br>Example: subdomain.example.com/path?a=<b>\E</b>&moredata=2 should appear as <i>\Qsubdomain.example.com/path?a=\E</i><b>\\E</b><i>\Q&moredata=2\E</i>
<h2>Accessed via</h2>
<table>
<tr><td></td><td><a href='HelpUiTlmenuFile'>Top level File menu</a></td><td>'Properties...' menu item</td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsDialogs'>Dialogs</a></td><td>for details of the dialogs or popups </td></tr>
<tr><td></td><td><a href='HelpStartConceptsAuthentication'>Authentication</a></td><td>for an overview of Authentication </td></tr>
<tr><td></td><td><a href='HelpStartConceptsSessionManagement'>Session Management</a></td><td>for an overview of Session Management </td></tr>
</table>