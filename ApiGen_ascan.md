# ZAP 2.5.0 API
## Component: ascan
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| status| view | scanId  |  |
| scanProgress| view | scanId  |  |
| messagesIds| view | scanId*  |  |
| alertsIds| view | scanId*  |  |
| scans| view |  |  |
| scanPolicyNames| view |  |  |
| excludedFromScan| view |  |  |
| scanners| view | scanPolicyName policyId  |  |
| policies| view | scanPolicyName policyId  |  |
| attackModeQueue| view |  |  |
| optionAttackPolicy| view |  |  |
| optionDefaultPolicy| view |  |  |
| optionDelayInMs| view |  |  |
| optionExcludedParamList| view |  |  |
| optionHandleAntiCSRFTokens| view |  |  |
| optionHostPerScan| view |  |  |
| optionMaxChartTimeInMins| view |  |  |
| optionMaxResultsToList| view |  |  |
| optionMaxScansInUI| view |  |  |
| optionTargetParamsEnabledRPC| view |  |  |
| optionTargetParamsInjectable| view |  |  |
| optionThreadPerHost| view |  |  |
| optionAllowAttackOnStart| view |  |  |
| optionInjectPluginIdInHeader| view |  |  |
| optionPromptInAttackMode| view |  |  |
| optionPromptToClearFinishedScans| view |  |  |
| optionRescanInAttackMode| view |  |  |
| optionScanHeadersAllRequests| view |  | Tells whether or not the HTTP Headers of all requests should be scanned. Not just requests that send parameters, through the query or request body. |
| optionShowAdvancedDialog| view |  |  |
| scan| action | url* recurse inScopeOnly scanPolicyName method postData  |  |
| scanAsUser| action | url* contextId* userId* recurse scanPolicyName method postData  | Active Scans from the perspective of a User, obtained using the given Context ID and User ID. See 'scan' action for more details. |
| pause| action | scanId*  |  |
| resume| action | scanId*  |  |
| stop| action | scanId*  |  |
| removeScan| action | scanId*  |  |
| pauseAllScans| action |  |  |
| resumeAllScans| action |  |  |
| stopAllScans| action |  |  |
| removeAllScans| action |  |  |
| clearExcludedFromScan| action |  |  |
| excludeFromScan| action | regex*  |  |
| enableAllScanners| action | scanPolicyName  |  |
| disableAllScanners| action | scanPolicyName  |  |
| enableScanners| action | ids* scanPolicyName  |  |
| disableScanners| action | ids* scanPolicyName  |  |
| setEnabledPolicies| action | ids* scanPolicyName  |  |
| setPolicyAttackStrength| action | id* attackStrength* scanPolicyName  |  |
| setPolicyAlertThreshold| action | id* alertThreshold* scanPolicyName  |  |
| setScannerAttackStrength| action | id* attackStrength* scanPolicyName  |  |
| setScannerAlertThreshold| action | id* alertThreshold* scanPolicyName  |  |
| addScanPolicy| action | scanPolicyName*  |  |
| removeScanPolicy| action | scanPolicyName*  |  |
| setOptionAttackPolicy| action | String*  |  |
| setOptionDefaultPolicy| action | String*  |  |
| setOptionAllowAttackOnStart| action | Boolean*  |  |
| setOptionDelayInMs| action | Integer*  |  |
| setOptionHandleAntiCSRFTokens| action | Boolean*  |  |
| setOptionHostPerScan| action | Integer*  |  |
| setOptionInjectPluginIdInHeader| action | Boolean*  |  |
| setOptionMaxChartTimeInMins| action | Integer*  |  |
| setOptionMaxResultsToList| action | Integer*  |  |
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

