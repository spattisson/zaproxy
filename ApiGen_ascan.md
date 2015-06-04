# ZAP 2.4.0 API
## Component: ascan
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| status | view   | scanId       |               |
| scanProgress| view   | scanId       |               |
| messagesIds| view   | scanId`*`    |               |
| alertsIds| view   | scanId`*`    |               |
| scans  | view   |              |               |
| scanPolicyNames| view   |              |               |
| excludedFromScan| view   |              |               |
| scanners| view   | scanPolicyName policyId  |               |
| policies| view   | scanPolicyName policyId  |               |
| attackModeQueue| view   |              |               |
| optionMaxScansInUI| view   |              |               |
| optionShowAdvancedDialog| view   |              |               |
| optionExcludedParamList| view   |              |               |
| optionThreadPerHost| view   |              |               |
| optionHostPerScan| view   |              |               |
| optionMaxResultsToList| view   |              |               |
| optionDelayInMs| view   |              |               |
| optionInjectPluginIdInHeader| view   |              |               |
| optionHandleAntiCSRFTokens| view   |              |               |
| optionRescanInAttackMode| view   |              |               |
| optionPromptInAttackMode| view   |              |               |
| optionTargetParamsInjectable| view   |              |               |
| optionTargetParamsEnabledRPC| view   |              |               |
| optionPromptToClearFinishedScans| view   |              |               |
| optionDefaultPolicy| view   |              |               |
| optionAttackPolicy| view   |              |               |
| optionAllowAttackOnStart| view   |              |               |
| scan   | action | url`*` recurse inScopeOnly scanPolicyName method postData  |               |
| scanAsUser| action | url`*` contextId`*` userId`*` recurse scanPolicyName method postData  | Active Scans from the perspective of an User, obtained using the given Context ID and User ID. See 'scan' action for more details. |
| pause  | action | scanId`*`    |               |
| resume | action | scanId`*`    |               |
| stop   | action | scanId`*`    |               |
| removeScan| action | scanId`*`    |               |
| pauseAllScans| action |              |               |
| resumeAllScans| action |              |               |
| stopAllScans| action |              |               |
| removeAllScans| action |              |               |
| clearExcludedFromScan| action |              |               |
| excludeFromScan| action | regex`*`     |               |
| enableAllScanners| action | scanPolicyName  |               |
| disableAllScanners| action | scanPolicyName  |               |
| enableScanners| action | ids`*`       |               |
| disableScanners| action | ids`*`       |               |
| setEnabledPolicies| action | ids`*`       |               |
| setPolicyAttackStrength| action | id`*` attackStrength`*` scanPolicyName  |               |
| setPolicyAlertThreshold| action | id`*` alertThreshold`*` scanPolicyName  |               |
| setScannerAttackStrength| action | id`*` attackStrength`*` scanPolicyName  |               |
| setScannerAlertThreshold| action | id`*` alertThreshold`*` scanPolicyName  |               |
| addScanPolicy| action | scanPolicyName`*`  |               |
| removeScanPolicy| action | scanPolicyName`*`  |               |
| setOptionDefaultPolicy| action | String`*`    |               |
| setOptionAttackPolicy| action | String`*`    |               |
| setOptionMaxScansInUI| action | Integer`*`   |               |
| setOptionShowAdvancedDialog| action | Boolean`*`   |               |
| setOptionThreadPerHost| action | Integer`*`   |               |
| setOptionHostPerScan| action | Integer`*`   |               |
| setOptionMaxResultsToList| action | Integer`*`   |               |
| setOptionDelayInMs| action | Integer`*`   |               |
| setOptionInjectPluginIdInHeader| action | Boolean`*`   |               |
| setOptionHandleAntiCSRFTokens| action | Boolean`*`   |               |
| setOptionRescanInAttackMode| action | Boolean`*`   |               |
| setOptionPromptInAttackMode| action | Boolean`*`   |               |
| setOptionTargetParamsInjectable| action | Integer`*`   |               |
| setOptionTargetParamsEnabledRPC| action | Integer`*`   |               |
| setOptionPromptToClearFinishedScans| action | Boolean`*`   |               |
| setOptionAllowAttackOnStart| action | Boolean`*`   |               |

Starred parameters are mandatory

Back to [index](ApiGen_Index)
