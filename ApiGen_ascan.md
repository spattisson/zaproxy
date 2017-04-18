# ZAP 2.6.0 API
## Component: ascan
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| alertsIds| view | scanId*  |  |
| attackModeQueue| view |  |  |
| excludedFromScan| view |  | Gets the regexes of URLs excluded from the active scans. |
| excludedParamTypes| view |  | Gets all the types of excluded parameters. For each type the following are shown: the ID and the name. |
| excludedParams| view |  | Gets all the parameters that are excluded. For each parameter the following are shown: the name, the URL, and the parameter type. |
| messagesIds| view | scanId*  |  |
| optionAllowAttackOnStart| view |  |  |
| optionAttackPolicy| view |  |  |
| optionDefaultPolicy| view |  |  |
| optionDelayInMs| view |  |  |
| optionExcludedParamList| view |  | Use view excludedParams instead. |
| optionHandleAntiCSRFTokens| view |  |  |
| optionHostPerScan| view |  |  |
| optionInjectPluginIdInHeader| view |  | Tells whether or not the active scanner should inject the HTTP request header X-ZAP-Scan-ID, with the ID of the scanner that's sending the requests. |
| optionMaxChartTimeInMins| view |  |  |
| optionMaxResultsToList| view |  |  |
| optionMaxRuleDurationInMins| view |  |  |
| optionMaxScanDurationInMins| view |  |  |
| optionMaxScansInUI| view |  |  |
| optionPromptInAttackMode| view |  |  |
| optionPromptToClearFinishedScans| view |  |  |
| optionRescanInAttackMode| view |  |  |
| optionScanHeadersAllRequests| view |  | Tells whether or not the HTTP Headers of all requests should be scanned. Not just requests that send parameters, through the query or request body. |
| optionShowAdvancedDialog| view |  |  |
| optionTargetParamsEnabledRPC| view |  |  |
| optionTargetParamsInjectable| view |  |  |
| optionThreadPerHost| view |  |  |
| policies| view | scanPolicyName policyId  |  |
| scanPolicyNames| view |  |  |
| scanProgress| view | scanId  |  |
| scanners| view | scanPolicyName policyId  |  |
| scans| view |  |  |
| status| view | scanId  |  |
| alertsIds| other | scanId*  |  |
| attackModeQueue| other |  |  |
| excludedFromScan| other |  |  |
| excludedParamTypes| other |  |  |
| excludedParams| other |  |  |
| messagesIds| other | scanId*  |  |
| optionAllowAttackOnStart| other |  |  |
| optionAttackPolicy| other |  |  |
| optionDefaultPolicy| other |  |  |
| optionDelayInMs| other |  |  |
| optionExcludedParamList| other |  |  |
| optionHandleAntiCSRFTokens| other |  |  |
| optionHostPerScan| other |  |  |
| optionInjectPluginIdInHeader| other |  |  |
| optionMaxChartTimeInMins| other |  |  |
| optionMaxResultsToList| other |  |  |
| optionMaxRuleDurationInMins| other |  |  |
| optionMaxScanDurationInMins| other |  |  |
| optionMaxScansInUI| other |  |  |
| optionPromptInAttackMode| other |  |  |
| optionPromptToClearFinishedScans| other |  |  |
| optionRescanInAttackMode| other |  |  |
| optionScanHeadersAllRequests| other |  |  |
| optionShowAdvancedDialog| other |  |  |
| optionTargetParamsEnabledRPC| other |  |  |
| optionTargetParamsInjectable| other |  |  |
| optionThreadPerHost| other |  |  |
| policies| other | scanPolicyName policyId  |  |
| scanPolicyNames| other |  |  |
| scanProgress| other | scanId  |  |
| scanners| other | scanPolicyName policyId  |  |
| scans| other |  |  |
| status| other | scanId  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

