# ZAP 2.6.0 API
## Component: authentication
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| getSupportedAuthenticationMethods| view |  |  |
| getAuthenticationMethodConfigParams| view | authMethodName*  |  |
| getAuthenticationMethod| view | contextId*  |  |
| getLoggedInIndicator| view | contextId*  |  |
| getLoggedOutIndicator| view | contextId*  |  |
| setAuthenticationMethod| action | contextId* authMethodName* authMethodConfigParams  |  |
| setLoggedInIndicator| action | contextId* loggedInIndicatorRegex*  |  |
| setLoggedOutIndicator| action | contextId* loggedOutIndicatorRegex*  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

