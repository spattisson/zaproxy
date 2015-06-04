# ZAP 2.4.0 API
## Component: context
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| contextList| view   |              | List context names of current session |
| excludeRegexs| view   | contextName`*`  | List excluded regexs for context |
| includeRegexs| view   | contextName`*`  | List included regexs for context |
| context| view   | contextName`*`  | List the information about the named context |
| excludeFromContext| action | contextName`*` regex`*`  | Add exclude regex to context |
| includeInContext| action | contextName`*` regex`*`  | Add include regex to context |
| newContext| action | contextName  | Creates a new context in the current session |
| exportContext| action | contextName`*` contextFile`*`  |               |
| importContext| action | contextFile`*`  |               |
| setContextInScope| action | contextName`*` booleanInScope`*`  | Sets a context to in scope (contexts are in scope by default) |

Starred parameters are mandatory

Back to [index](ApiGen_Index)
