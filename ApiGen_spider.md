# ZAP 2.5.0 API
## Component: spider
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| status| view | scanId  |  |
| results| view | scanId  |  |
| fullResults| view | scanId*  |  |
| scans| view |  |  |
| excludedFromScan| view |  |  |
| optionDomainsAlwaysInScope| view |  |  |
| optionDomainsAlwaysInScopeEnabled| view |  |  |
| optionHandleParameters| view |  |  |
| optionMaxDepth| view |  |  |
| optionMaxDuration| view |  |  |
| optionMaxScansInUI| view |  |  |
| optionRequestWaitTime| view |  |  |
| optionScope| view |  |  |
| optionScopeText| view |  |  |
| optionSkipURLString| view |  |  |
| optionThreadCount| view |  |  |
| optionUserAgent| view |  |  |
| optionHandleODataParametersVisited| view |  |  |
| optionParseComments| view |  |  |
| optionParseGit| view |  |  |
| optionParseRobotsTxt| view |  |  |
| optionParseSVNEntries| view |  |  |
| optionParseSitemapXml| view |  |  |
| optionPostForm| view |  |  |
| optionProcessForm| view |  |  |
| optionSendRefererHeader| view |  | Sets whether or not the 'Referer' header should be sent while spidering |
| optionShowAdvancedDialog| view |  |  |
| scan| action | url maxChildren recurse contextName subtreeOnly  | Runs the spider against the given URL (or context). Optionally, the 'maxChildren' parameter can be set to limit the number of children scanned, the 'recurse' parameter can be used to prevent the spider from seeding recursively, the parameter 'contextName' can be used to constrain the scan to a Context and the parameter 'subtreeOnly' allows to restrict the spider under a site's subtree (using the specified 'url'). |
| scanAsUser| action | contextId* userId* url maxChildren recurse subtreeOnly  | Runs the spider from the perspective of a User, obtained using the given Context ID and User ID. See 'scan' action for more details. |
| pause| action | scanId*  |  |
| resume| action | scanId*  |  |
| stop| action | scanId  |  |
| removeScan| action | scanId*  |  |
| pauseAllScans| action |  |  |
| resumeAllScans| action |  |  |
| stopAllScans| action |  |  |
| removeAllScans| action |  |  |
| clearExcludedFromScan| action |  |  |
| excludeFromScan| action | regex*  |  |
| setOptionHandleParameters| action | String*  |  |
| setOptionScopeString| action | String*  |  |
| setOptionSkipURLString| action | String*  |  |
| setOptionUserAgent| action | String*  |  |
| setOptionHandleODataParametersVisited| action | Boolean*  |  |
| setOptionMaxDepth| action | Integer*  |  |
| setOptionMaxDuration| action | Integer*  |  |
| setOptionMaxScansInUI| action | Integer*  |  |
| setOptionParseComments| action | Boolean*  |  |
| setOptionParseGit| action | Boolean*  |  |
| setOptionParseRobotsTxt| action | Boolean*  |  |
| setOptionParseSVNEntries| action | Boolean*  |  |
| setOptionParseSitemapXml| action | Boolean*  |  |
| setOptionPostForm| action | Boolean*  |  |
| setOptionProcessForm| action | Boolean*  |  |
| setOptionRequestWaitTime| action | Integer*  |  |
| setOptionSendRefererHeader| action | Boolean*  |  |
| setOptionShowAdvancedDialog| action | Boolean*  |  |
| setOptionThreadCount| action | Integer*  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

