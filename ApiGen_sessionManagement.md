# ZAP 2.8.0 API
## Component: sessionManagement
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| getSupportedSessionManagementMethods| view |  | Gets the name of the session management methods. |
| getSessionManagementMethodConfigParams| view | methodName*  | Gets the configuration parameters for the session management method with the given name. |
| getSessionManagementMethod| view | contextId*  | Gets the name of the session management method for the context with the given ID. |
| setSessionManagementMethod| action | contextId* methodName* methodConfigParams  | Sets the session management method for the context with the given ID. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

