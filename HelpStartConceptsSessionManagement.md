# Session Management

ZAP handles multiple types of session management (called **Session Management Methods**) that can be used
for websites / webapps. Each **[Context](HelpStartConceptsContexts)** has a Session Management Method defined which dictates how sessions are kept.

So far, just a cookie based session management method has been implemented, but the system supports easy
addition of new methods, according to user needs.
### Cookie-Based Session Management

In the case of this method the session is being tracked through cookies. Currently, the session tokens
that are used are imported from the [Http Sessions](HelpStartConceptsHttpsessions) Extension.
## Configured via
<table>
<tr><td></td><td><a href='HelpUiDialogsSessionContexts#sm'>Session Contexts Dialog</a></td><td></td></tr>
</table>
## See also
<table>
<tr><td></td><td><a href='http://youtu.be/cR4gw-cPZOA'>Youtube tutorial</a></td><td>of the Authentication, Session Management and Users Management features of ZAP <code>[</code>external link to <a href='http://youtu.be/cR4gw-cPZOA'>http://youtu.be/cR4gw-cPZOA</a>].</td></tr>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
<tr><td></td><td><a href='HelpUiDialogsSessionContexts'>Session Contexts Dialog</a></td><td>for an overview of the Session Properties</td></tr>
</table>