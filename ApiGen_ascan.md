# ZAP 2.7.0 API
## Component: ascan
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| status| view | scanId  |  |
| scanProgress| view | scanId  |  |
| messagesIds| view | scanId*  | Gets the IDs of the messages sent during the scan with the given ID. A message can be obtained with 'message' core view. |
| alertsIds| view | scanId*  | Gets the IDs of the alerts raised during the scan with the given ID. An alert can be obtained with 'alert' core view. |
| scans| view |  |  |
| scanPolicyNames| view |  |  |
| excludedFromScan| view |  | Gets the regexes of URLs excluded from the active scans. |
| scanners| view | scanPolicyName policyId  |  |
| policies| view | scanPolicyName policyId  |  |
| attackModeQueue| view |  |  |
| excludedParams| view |  | Gets all the parameters that are excluded. For each parameter the following are shown: the name, the URL, and the parameter type. |
| optionExcludedParamList| view |  | Use view excludedParams instead. |
| excludedParamTypes| view |  | Gets all the types of excluded parameters. For each type the following are shown: the ID and the name. |
| optionAttackPolicy| view |  |  |
| optionDefaultPolicy| view |  |  |
| optionDelayInMs| view |  |  |
| optionHandleAntiCSRFTokens| view |  |  |
| optionHostPerScan| view |  |  |
| optionMaxChartTimeInMins| view |  |  |
| optionMaxResultsToList| view |  |  |
| optionMaxRuleDurationInMins| view |  |  |
| optionMaxScanDurationInMins| view |  |  |
| optionMaxScansInUI| view |  |  |
| optionTargetParamsEnabledRPC| view |  |  |
| optionTargetParamsInjectable| view |  |  |
| optionThreadPerHost| view |  |  |
| optionAllowAttackOnStart| view |  |  |
| optionInjectPluginIdInHeader| view |  | Tells whether or not the active scanner should inject the HTTP request header X-ZAP-Scan-ID, with the ID of the scanner that's sending the requests. |
| optionPromptInAttackMode| view |  |  |
| optionPromptToClearFinishedScans| view |  |  |
| optionRescanInAttackMode| view |  |  |
| optionScanHeadersAllRequests| view |  | Tells whether or not the HTTP Headers of all requests should be scanned. Not just requests that send parameters, through the query or request body. |
| optionShowAdvancedDialog| view |  |  |
| scan| action | url recurse inScopeOnly scanPolicyName method postData contextId  | Runs the active scanner against the given URL and/or Context. Optionally, the 'recurse' parameter can be used to scan URLs under the given URL, the parameter 'inScopeOnly' can be used to constrain the scan to URLs that are in scope (ignored if a Context is specified), the parameter 'scanPolicyName' allows to specify the scan policy (if none is given it uses the default scan policy), the parameters 'method' and 'postData' allow to select a given request in conjunction with the given URL. |
| scanAsUser| action | url contextId userId recurse scanPolicyName method postData  | Active Scans from the perspective of a User, obtained using the given Context ID and User ID. See 'scan' action for more details. |
| pause| action | scanId*  |  |
| resume| action | scanId*  |  |
| stop| action | scanId*  |  |
| removeScan| action | scanId*  |  |
| pauseAllScans| action |  |  |
| resumeAllScans| action |  |  |
| stopAllScans| action |  |  |
| removeAllScans| action |  |  |
| clearExcludedFromScan| action |  | Clears the regexes of URLs excluded from the active scans. |
| excludeFromScan| action | regex*  | Adds a regex of URLs that should be excluded from the active scans. |
| enableAllScanners| action | scanPolicyName  |  |
| disableAllScanners| action | scanPolicyName  |  |
| enableScanners| action | ids* scanPolicyName  |  |
| disableScanners| action | ids* scanPolicyName  |  |
| setEnabledPolicies| action | ids* scanPolicyName  |  |
| setPolicyAttackStrength| action | id* attackStrength* scanPolicyName  |  |
| setPolicyAlertThreshold| action | id* alertThreshold* scanPolicyName  |  |
| setScannerAttackStrength| action | id* attackStrength* scanPolicyName  |  |
| setScannerAlertThreshold| action | id* alertThreshold* scanPolicyName  |  |
| addScanPolicy| action | scanPolicyName* alertThreshold attackStrength  |  |
| removeScanPolicy| action | scanPolicyName*  |  |
| updateScanPolicy| action | scanPolicyName* alertThreshold attackStrength  |  |
| importScanPolicy| action | path*  | Imports a Scan Policy using the given file system path. |
| addExcludedParam| action | name* type url  | Adds a new parameter excluded from the scan, using the specified name. Optionally sets if the new entry applies to a specific URL (default, all URLs) and sets the ID of the type of the parameter (default, ID of any type). The type IDs can be obtained with the view excludedParamTypes.  |
| modifyExcludedParam| action | idx* name type url  | Modifies a parameter excluded from the scan. Allows to modify the name, the URL and the type of parameter. The parameter is selected with its index, which can be obtained with the view excludedParams. |
| removeExcludedParam| action | idx*  | Removes a parameter excluded from the scan, with the given index. The index can be obtained with the view excludedParams. |
| skipScanner| action | scanId* scannerId*  | Skips the scanner using the given IDs of the scan and the scanner. |
| setOptionAttackPolicy| action | String*  |  |
| setOptionDefaultPolicy| action | String*  |  |
| setOptionAllowAttackOnStart| action | Boolean*  |  |
| setOptionDelayInMs| action | Integer*  |  |
| setOptionHandleAntiCSRFTokens| action | Boolean*  |  |
| setOptionHostPerScan| action | Integer*  |  |
| setOptionInjectPluginIdInHeader| action | Boolean*  | Sets whether or not the active scanner should inject the HTTP request header X-ZAP-Scan-ID, with the ID of the scanner that's sending the requests. |
| setOptionMaxChartTimeInMins| action | Integer*  |  |
| setOptionMaxResultsToList| action | Integer*  |  |
| setOptionMaxRuleDurationInMins| action | Integer*  |  |
| setOptionMaxScanDurationInMins| action | Integer*  |  |
| setOptionMaxScansInUI| action | Integer*  |  |
| setOptionPromptInAttackMode| action | Boolean*  |  |
| setOptionPromptToClearFinishedScans| action | Boolean*  |  |
| setOptionRescanInAttackMode| action | Boolean*  |  |
| setOptionScanHeadersAllRequests| action | Boolean*  | Sets whether or not the HTTP Headers of all requests should be scanned. Not just requests that send parameters, through the query or request body. |
| setOptionShowAdvancedDialog| action | Boolean*  |  |
| setOptionTargetParamsEnabledRPC| action | Integer*  |  |
| setOptionTargetParamsInjectable| action | Integer*  |  |
| setOptionThreadPerHost| action | Integer*  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

