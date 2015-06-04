# How can ZAP automatically authenticate via forms?


ZAP supports form based authentication, and can automatically (re)authenticate, for example when using the Spider or Active Scanner.

There are a few steps required to set this up which can be performed via either the UI or the API.

Via the UI:
  1. Explore your app while proxying through ZAP
  1. Login using a valid username and password
  1. Define a Context, eg by right clicking the top node of your app in the Sites tab and selecting "Include in Context"
  1. Find the 'Login request' in the Sites or History tab
  1. Right click it and select "Flag as Context" / "<Context id> Login Request"
  1. Find a string in a response which can be used to determine if the user is logged in or not
  1. Highlight this string, right click and select "Flag as Context" / "<Context id> Logged in/out Indicator" as relevant
  1. The "Automatic re-authentication" button should now be enabled
  1. Pressing this button in will cause ZAP to resend the authentication request whenever it detects that the user is no longer logged in, ie by using the 'logged in' or 'logged out' indicator.

Via the API the process is the same but using the API calls:
  1. [context/includeInContext](http://code.google.com/p/zaproxy/wiki/ApiGen_context)
  1. [auth/setLoginUrl](http://code.google.com/p/zaproxy/wiki/ApiGen_auth)
  1. [auth/setLoginIndicator](http://code.google.com/p/zaproxy/wiki/ApiGen_auth) or `setLogoutIndicator`
  1. [auth/autoReauthOn](http://code.google.com/p/zaproxy/wiki/ApiGen_auth)





---

[Back to the FAQ](FAQtoplevel)