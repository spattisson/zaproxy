# Authentication

ZAP handles multiple types of authentication (called **Authentication Methods**) that can be used for websites
/ webapps. Each **[Context](HelpStartConceptsContexts)** has an Authentication Method defined which dictates how authentication is handled. The authentication is used to create Web Sessions that correspond to authenticated webapp [Users](HelpStartConceptsUsers).

In order to detect when response messages from web servers correspond to authenticated requests, a set
of indicators can be configured. The **Logged in indicator**, when present in a response message (either
the header or the body), signifies that the response message corresponds to an authenticated request
(e.g. presence of a 'logout link' or a 'Welcome back, User X' pattern). Similarly, the **Logged out indicator**
indicates an unauthenticated request (e.g. presence of a 'login link'). Only the presence of one of the
2 indicators is sufficient for proper functionality. In the case neither of the indicators has been specified,
all messages are considered, by default, authenticated.

To set one of the **Logged in/out Indicators**, either type the regex directly in the _[Session Properties](HelpUiDialogsSessionContexts#auth) dialog -> Authentication panel -> Logged In/Out Indicator field_, either find an authenticated message in the Sites Tree, select it, open the Response View and select the text you wish to define as the indicator using the mouse and select the _Flag as Context... Logged in/out indicator_ right-click menu option.

In order to perform the authentication of an user on a website / in a webapp, the Authentication Method
defines how the authentication is done (the process), while the necessary credentials (the exact identifiers)
are dependent on the user, so, in ZAP, they are configured in the Users.

The generic **main steps** that are needed to configure authentication for a web application are the following:

  1. properly configure a ZAP [Context](HelpStartConceptsContexts) for the web application
  1. set up the [session management method](HelpStartConceptsSessionManagement) for the context to the one that is used in your app
  1. set up the authentication method for the context:
    1. set up at least one of the _Logged In Indicator_ or the _Logged out indicator_, as described above
    1. configure the authentication method for your application, specifying all the requirements (as seen below)
  1. configure a set of [users](HelpStartConceptsUsers) for the context that directly correspond to the authentication method for the context

Authentication methods can be used in multiple places around ZAP. Some of the examples include:
  * defining Users and automatic login
  * detection of authenticated/unauthenticated states
  * performing automatic re-authentication

Multiple authentication methods have been implemented and the system supports easy addition of new methods,
according to user needs. They main ones are described below.
### Manual Authentication

This method allows users to perform the authentication manually (e.g. authenticate in the browser while
proxy-ing through ZAP) and then select the corresponding HttpSession. As the actual authentication is
being performed by you, this method does not support re-authentication in case the webapp logs an user
out.

When using this authentication method, configuring an User for the context require choosing an authenticated
HTTP session.
### Form-Based Authentication

This method is used for websites / webapps where authentication is done by submitting a form or performing
a GET request to a 'login url' using a 'username/password' pair of authentication credentials. Re-authentication
is possible. Configuration can be done using the [Session Contexts Dialog](HelpUiDialogsSessionContexts#auth) or using the contextual PopupMenu: _Flag as... Form-Based Authentication Login Request_.

When using this authentication method, configuring an User for the context requires setting up the _username/password_
pair of credentials that are used for the form based authentication.
### HTTP/NTLM Authentication

This method is used for websites / webapps where authentication is enforced using the HTTP or NTLM Authentication
mechanisms employing HTTP message headers. Three authentication schemes are supported: Basic, Digest
and NTLM. Re-authentication is possible, as the authentication headers are sent with every authenticated
request. Configuration can be done using the [Session Contexts Dialog](HelpUiDialogsSessionContexts#auth).

When using this authentication method, configuring an User for the context requires setting up the _username/password_
pair of credentials that are used for the HTTP/NTLM authentication.
### Script-Based Authentication

This method is useful for websites / webapps where the authentication is a more complex one and some
custom scripts that handle the authentication process are beneficial. To use this method, you must first
define an Authentication script which sends messages or performs other actions as needed by your web-application.
This script is then selected for use for a given Context and it is called whenever an authentication
is performed. Re-authentication is possible. Configuration can be done using the [Session Contexts Dialog](HelpUiDialogsSessionContexts#auth) and requires you to have the Scripts Console ZAP Addon installed from the Marketplace.

When using this authentication method, configuring an User for the context requires setting up the a
set of parameters defined in the script. For more details, see the provided Authentication Script examples.
## Configuration example

A configuration example showing how to fully configure a webapp that uses _form-based authentication_ and
_cookie-based session management_ is seen below:
  1. set up a context for the web application
  1. set up the session management method to _Cookie-based Session Management_
  1. make sure your browser proxies everything through ZAP and log into your application using the browser
  1. go to ZAP and identify the request that was done for the login (most usually it's a HTTP POST request containing the username and the password and possibly other elements)
  1. right click on the request and Flag as Context... Form-based Auth Login Request
  1. a window will be opened already containing the request URL and the parameters (if any). Use the dropdown options to select which of the parameters correspond to the username and to the password
  1. then you need to tell ZAP how to identify whether an authentication succeeded or not. You can do this by setting logged in or logged indicators. These are regex patterns which, if found in a response, tell ZAP whether it's authenticated or not (e.g. presence of a http://example.com/logout link or the presence of a 'Welcome, User X'). Only one of them is necessary. To set one of them, either type the regex directly in the Session Properties -> Authentication -> Logged In Indicator, either find an authenticated message in the Sites Tree, select it, open the Response View and select the text you wish to define as the indicator using the mouse and select the Flag as Context... Logged in indicator right-click menu option.
  1. define as many users as you need in the Session Properties -> Users section.
  1. after this step, various actions are available in ZAP. For example, you now have a new right click option: Attack -> Spider Context As User. Or, using the Forced User Mode, you can force all the interactions that go through ZAP for a given Context to be from the perspective of a User. The User Forced Mode is enabled via the previous-to-last button in the toolbar (the one with the user and the lock) and is configured via Session Properties -> Forced User Mode.
Most of the steps above apply as well for other authentication methods. The only things that change when
trying to configure authentication using a different method are steps 3, 4, 5 and 6. Instead of these,
select the authentication method required from the drop-down list and configure it as needed. More details
about configuring each type of authentication can be above and [here](HelpUiDialogsSessionContexts).
## Configured via
<table>
<tr><td></td><td><a href='HelpUiDialogsSessionContexts#auth'>Session Properties dialog</a></td><td></td></tr>
</table>
## See also
<table>
<tr><td></td><td><a href='http://youtu.be/cR4gw-cPZOA'>Youtube tutorial</a></td><td>of the Authentication, Session Management and Users Management features of ZAP <code>[</code>external link to <a href='http://youtu.be/cR4gw-cPZOA'>http://youtu.be/cR4gw-cPZOA</a>].</td></tr>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
<tr><td></td><td><a href='HelpUiDialogsSessionContexts'>Session Contexts Dialog</a></td><td>for an overview of the Session Properties</td></tr>
<tr><td></td><td><a href='HelpStartConceptsUsers'>Users</a></td><td>for an overview of Users</td></tr>
</table>