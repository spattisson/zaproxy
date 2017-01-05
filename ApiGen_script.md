# ZAP 2.5.0 API
## Component: script
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| listEngines| view |  | Lists the script engines available |
| listScripts| view |  | Lists the scripts available, with its engine, name, description, type and error state. |
| enable| action | scriptName*  | Enables the script with the given name |
| disable| action | scriptName*  | Disables the script with the given name |
| load| action | scriptName* scriptType* scriptEngine* fileName* scriptDescription  | Loads a script into ZAP from the given local file, with the given name, type and engine, optionally with a description |
| remove| action | scriptName*  | Removes the script with the given name |
| runStandAloneScript| action | scriptName*  | Runs the stand alone script with the give name |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

