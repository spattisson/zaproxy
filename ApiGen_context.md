# ZAP 2.6.0 API
## Component: context
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| contextList| view |  | List context names of current session |
| excludeRegexs| view | contextName*  | List excluded regexs for context |
| includeRegexs| view | contextName*  | List included regexs for context |
| context| view | contextName*  | List the information about the named context |
| technologyList| view |  | Lists the names of all built in technologies |
| includedTechnologyList| view | contextName*  | Lists the names of all technologies included in a context |
| excludedTechnologyList| view | contextName*  | Lists the names of all technologies excluded from a context |
| excludeFromContext| action | contextName* regex*  | Add exclude regex to context |
| includeInContext| action | contextName* regex*  | Add include regex to context |
| newContext| action | contextName*  | Creates a new context with the given name in the current session |
| removeContext| action | contextName*  | Removes a context in the current session |
| exportContext| action | contextName* contextFile*  | Exports the context with the given name to a file. If a relative file path is specified it will be resolved against the "contexts" directory in ZAP "home" dir. |
| importContext| action | contextFile*  | Imports a context from a file. If a relative file path is specified it will be resolved against the "contexts" directory in ZAP "home" dir. |
| includeContextTechnologies| action | contextName* technologyNames*  | Includes technologies with the given names, separated by a comma, to a context |
| includeAllContextTechnologies| action | contextName*  | Includes all built in technologies in to a context |
| excludeContextTechnologies| action | contextName* technologyNames*  | Excludes technologies with the given names, separated by a comma, from a context |
| excludeAllContextTechnologies| action | contextName*  | Excludes all built in technologies from a context |
| setContextInScope| action | contextName* booleanInScope*  | Sets a context to in scope (contexts are in scope by default) |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

