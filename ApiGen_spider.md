# ZAP 2.6.0 API
## Component: spider
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| allUrls| view |  | Returns a list of unique URLs from the history table based on HTTP messages added by the Spider. |
| domainsAlwaysInScope| view |  | Gets all the domains that are always in scope. For each domain the following are shown: the index, the value (domain), if enabled, and if specified as a regex. |
| excludedFromScan| view |  | Gets the regexes of URLs excluded from the spider scans. |
| fullResults| view | scanId*  |  |
| optionDomainsAlwaysInScope| view |  | Use view domainsAlwaysInScope instead. |
| optionDomainsAlwaysInScopeEnabled| view |  | Use view domainsAlwaysInScope instead. |
| optionHandleODataParametersVisited| view |  |  |
| optionHandleParameters| view |  |  |
| optionMaxChildren| view |  | Gets the maximum number of child nodes (per node) that can be crawled, 0 means no limit. |
| optionMaxDepth| view |  |  |
| optionMaxDuration| view |  |  |
| optionMaxScansInUI| view |  |  |
| optionParseComments| view |  |  |
| optionParseGit| view |  |  |
| optionParseRobotsTxt| view |  |  |
| optionParseSVNEntries| view |  |  |
| optionParseSitemapXml| view |  |  |
| optionPostForm| view |  |  |
| optionProcessForm| view |  |  |
| optionRequestWaitTime| view |  |  |
| optionScope| view |  |  |
| optionScopeText| view |  |  |
| optionSendRefererHeader| view |  | Gets whether or not the 'Referer' header should be sent while spidering. |
| optionShowAdvancedDialog| view |  |  |
| optionSkipURLString| view |  |  |
| optionThreadCount| view |  |  |
| optionUserAgent| view |  |  |
| results| view | scanId  |  |
| scans| view |  |  |
| status| view | scanId  |  |
| allUrls| other |  |  |
| domainsAlwaysInScope| other |  |  |
| excludedFromScan| other |  |  |
| fullResults| other | scanId*  |  |
| optionDomainsAlwaysInScope| other |  |  |
| optionDomainsAlwaysInScopeEnabled| other |  |  |
| optionHandleODataParametersVisited| other |  |  |
| optionHandleParameters| other |  |  |
| optionMaxChildren| other |  |  |
| optionMaxDepth| other |  |  |
| optionMaxDuration| other |  |  |
| optionMaxScansInUI| other |  |  |
| optionParseComments| other |  |  |
| optionParseGit| other |  |  |
| optionParseRobotsTxt| other |  |  |
| optionParseSVNEntries| other |  |  |
| optionParseSitemapXml| other |  |  |
| optionPostForm| other |  |  |
| optionProcessForm| other |  |  |
| optionRequestWaitTime| other |  |  |
| optionScope| other |  |  |
| optionScopeText| other |  |  |
| optionSendRefererHeader| other |  |  |
| optionShowAdvancedDialog| other |  |  |
| optionSkipURLString| other |  |  |
| optionThreadCount| other |  |  |
| optionUserAgent| other |  |  |
| results| other | scanId  |  |
| scans| other |  |  |
| status| other | scanId  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

