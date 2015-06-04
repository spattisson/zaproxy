# ZAP 2.4.0 API
## Component: spider
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| status | view   | scanId       |               |
| results| view   | scanId       |               |
| fullResults| view   | scanId`*`    |               |
| scans  | view   |              |               |
| excludedFromScan| view   |              |               |
| optionMaxDepth| view   |              |               |
| optionScopeText| view   |              |               |
| optionScope| view   |              |               |
| optionThreadCount| view   |              |               |
| optionPostForm| view   |              |               |
| optionProcessForm| view   |              |               |
| optionSkipURLString| view   |              |               |
| optionRequestWaitTime| view   |              |               |
| optionUserAgent| view   |              |               |
| optionParseComments| view   |              |               |
| optionParseRobotsTxt| view   |              |               |
| optionParseSitemapXml| view   |              |               |
| optionParseSVNEntries| view   |              |               |
| optionParseGit| view   |              |               |
| optionHandleParameters| view   |              |               |
| optionHandleODataParametersVisited| view   |              |               |
| optionDomainsAlwaysInScope| view   |              |               |
| optionDomainsAlwaysInScopeEnabled| view   |              |               |
| optionMaxScansInUI| view   |              |               |
| optionShowAdvancedDialog| view   |              |               |
| optionSendRefererHeader| view   |              | Sets whether or not the 'Referer' header should be sent while spidering |
| scan   | action | url`*` maxChildren  |               |
| scanAsUser| action | url`*` contextId`*` userId`*` maxChildren`*`  |               |
| pause  | action | scanId`*`    |               |
| resume | action | scanId`*`    |               |
| stop   | action | scanId       |               |
| removeScan| action | scanId`*`    |               |
| pauseAllScans| action |              |               |
| resumeAllScans| action |              |               |
| stopAllScans| action |              |               |
| removeAllScans| action |              |               |
| clearExcludedFromScan| action |              |               |
| excludeFromScan| action | regex`*`     |               |
| setOptionSkipURLString| action | String`*`    |               |
| setOptionHandleParameters| action | String`*`    |               |
| setOptionScopeString| action | String`*`    |               |
| setOptionUserAgent| action | String`*`    |               |
| setOptionMaxDepth| action | Integer`*`   |               |
| setOptionThreadCount| action | Integer`*`   |               |
| setOptionPostForm| action | Boolean`*`   |               |
| setOptionProcessForm| action | Boolean`*`   |               |
| setOptionRequestWaitTime| action | Integer`*`   |               |
| setOptionParseComments| action | Boolean`*`   |               |
| setOptionParseRobotsTxt| action | Boolean`*`   |               |
| setOptionParseSitemapXml| action | Boolean`*`   |               |
| setOptionParseSVNEntries| action | Boolean`*`   |               |
| setOptionParseGit| action | Boolean`*`   |               |
| setOptionHandleODataParametersVisited| action | Boolean`*`   |               |
| setOptionMaxScansInUI| action | Integer`*`   |               |
| setOptionShowAdvancedDialog| action | Boolean`*`   |               |
| setOptionSendRefererHeader| action | Boolean`*`   |               |

Starred parameters are mandatory

Back to [index](ApiGen_Index)
