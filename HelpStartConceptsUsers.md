# Users

Users are the ZAP representations of websites/webapps' users. They allow certain actions to be performed
from the point of view of an user of the webapps. For each **[Context](HelpStartConceptsContexts)**, a set of Users can be defined, which can then be used in actions related to the context. Most commonly, during various scans the request messages can be sent from the point of view of an User.

The concept of Users is tightly tied to the concepts of [Session Management](HelpStartConceptsSessionManagement) and [Authentication](HelpStartConceptsAuthentication). When a User is first used somewhere in ZAP, an authentication is performed (according to the Authentication Method defined for the Context) and a Session is created and configured for this user (according to the Session Management defined for the Context). After that, requests sent from the point of view of an User are modified (if necessary) and sent in such a way that the web server identifies them as being sent by an authenticated webapp/website user. If anytime a message is sent from the perspective of a User and the response received seems unauthenticated (as identified using the _Logged In_ and _Logged Out_ [Authentication indicators](HelpStartConceptsAuthentication)), a new authentication is performed and the Session is updated accordingly.

In order to perform the authentication of an user on a website / in a webapp, the Authentication Method
defines how the authentication is done (the process), while the necessary credentials (the exact identifiers)
are dependent on the user, so, in ZAP, they are configured in the Users.
## Configured via
<table>
<tr><td></td><td><a href='HelpUiDialogsSessionContexts#users'>Session Contexts Dialog</a></td><td></td></tr>
</table>
## See also
<table>
<tr><td></td><td><a href='http://youtu.be/cR4gw-cPZOA'>Youtube tutorial</a></td><td>of the Authentication, Session Management and Users Management features of ZAP <code>[</code>external link to <a href='http://youtu.be/cR4gw-cPZOA'>http://youtu.be/cR4gw-cPZOA</a>].</td></tr>
<tr><td></td><td><a href='HelpStartConceptsAuthentication'>Authentication Overview</a></td><td>for an overview of Authentication in ZAP</td></tr>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
<tr><td></td><td><a href='HelpUiDialogsSessionContexts'>Session Contexts Dialog</a></td><td>for an overview of the Session Properties</td></tr>
</table>