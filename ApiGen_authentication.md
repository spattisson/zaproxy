# ZAP 2.8.0 API
## Component: authentication
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| getSupportedAuthenticationMethods| view |  | Gets the name of the authentication methods. |
| getAuthenticationMethodConfigParams| view | authMethodName*  | Gets the configuration parameters for the authentication method with the given name. |
| getAuthenticationMethod| view | contextId*  | Gets the name of the authentication method for the context with the given ID. |
| getLoggedInIndicator| view | contextId*  | Gets the logged in indicator for the context with the given ID. |
| getLoggedOutIndicator| view | contextId*  | Gets the logged out indicator for the context with the given ID. |
| setAuthenticationMethod| action | contextId* authMethodName* authMethodConfigParams  | Sets the authentication method for the context with the given ID. |
| setLoggedInIndicator| action | contextId* loggedInIndicatorRegex*  | Sets the logged in indicator for the context with the given ID. |
| setLoggedOutIndicator| action | contextId* loggedOutIndicatorRegex*  | Sets the logged out indicator for the context with the given ID. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

