# ZAP 2.8.0 API
## Component: script
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| listEngines| view |  | Lists the script engines available |
| listTypes| view |  | Lists the script types available. |
| listScripts| view |  | Lists the scripts available, with its engine, name, description, type and error state. |
| globalVar| view | varKey*  | Gets the value of the global variable with the given key. Returns an API error (DOES_NOT_EXIST) if no value was previously set. |
| globalVars| view |  | Gets all the global variables (key/value pairs). |
| scriptVar| view | scriptName* varKey*  | Gets the value of the variable with the given key for the given script. Returns an API error (DOES_NOT_EXIST) if no script with the given name exists or if no value was previously set. |
| scriptVars| view | scriptName*  | Gets all the variables (key/value pairs) of the given script. Returns an API error (DOES_NOT_EXIST) if no script with the given name exists. |
| enable| action | scriptName*  | Enables the script with the given name |
| disable| action | scriptName*  | Disables the script with the given name |
| load| action | scriptName* scriptType* scriptEngine* fileName* scriptDescription charset  | Loads a script into ZAP from the given local file, with the given name, type and engine, optionally with a description, and a charset name to read the script (the charset name is required if the script is not in UTF-8, for example, in ISO-8859-1). |
| remove| action | scriptName*  | Removes the script with the given name |
| runStandAloneScript| action | scriptName*  | Runs the stand alone script with the given name |
| clearGlobalVar| action | varKey*  | Clears the global variable with the given key. |
| clearGlobalVars| action |  | Clears the global variables. |
| clearScriptVar| action | scriptName* varKey*  | Clears the variable with the given key of the given script. Returns an API error (DOES_NOT_EXIST) if no script with the given name exists. |
| clearScriptVars| action | scriptName*  | Clears the variables of the given script. Returns an API error (DOES_NOT_EXIST) if no script with the given name exists. |
| setScriptVar| action | scriptName* varKey* varValue  | Sets the value of the variable with the given key of the given script. Returns an API error (DOES_NOT_EXIST) if no script with the given name exists. |
| setGlobalVar| action | varKey* varValue  | Sets the value of the global variable with the given key. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

