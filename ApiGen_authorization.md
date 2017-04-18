# ZAP 2.6.0 API
## Component: authorization
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| getAuthorizationDetectionMethod| view | contextId*  | Obtains all the configuration of the authorization detection method that is currently set for a context. |
| setBasicAuthorizationDetectionMethod| action | contextId* headerRegex bodyRegex statusCode logicalOperator  | Sets the authorization detection method for a context as one that identifies un-authorized messages based on: the message's status code or a regex pattern in the response's header or body. Also, whether all conditions must match or just some can be specified via the logicalOperator parameter, which accepts two values: "AND" (default), "OR".   |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

