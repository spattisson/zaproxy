# ZAP 2.6.0 API
## Component: spider
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| status| view | scanId  |  |
| results| view | scanId  |  |
| fullResults| view | scanId*  |  |
| scans| view |  |  |
| excludedFromScan| view |  | Gets the regexes of URLs excluded from the spider scans. |
| allUrls| view |  | Returns a list of unique URLs from the history table based on HTTP messages added by the Spider. |
| domainsAlwaysInScope| view |  | Gets all the domains that are always in scope. For each domain the following are shown: the index, the value (domain), if enabled, and if specified as a regex. |
| optionDomainsAlwaysInScope| view |  | Use view domainsAlwaysInScope instead. |
| optionDomainsAlwaysInScopeEnabled| view |  | Use view domainsAlwaysInScope instead. |
| optionHandleParameters| view |  |  |
| optionMaxChildren| view |  | Gets the maximum number of child nodes (per node) that can be crawled, 0 means no limit. |
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
| optionSendRefererHeader| view |  | Gets whether or not the 'Referer' header should be sent while spidering. |
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
| clearExcludedFromScan| action |  | Clears the regexes of URLs excluded from the spider scans. |
| excludeFromScan| action | regex*  | Adds a regex of URLs that should be excluded from the spider scans. |
| addDomainAlwaysInScope| action | value* isRegex isEnabled  | Adds a new domain that's always in scope, using the specified value. Optionally sets if the new entry is enabled (default, true) and whether or not the new value is specified as a regex (default, false). |
| modifyDomainAlwaysInScope| action | idx* value isRegex isEnabled  | Modifies a domain that's always in scope. Allows to modify the value, if enabled or if a regex. The domain is selected with its index, which can be obtained with the view domainsAlwaysInScope. |
| removeDomainAlwaysInScope| action | idx*  | Removes a domain that's always in scope, with the given index. The index can be obtained with the view domainsAlwaysInScope. |
| enableAllDomainsAlwaysInScope| action |  | Enables all domains that are always in scope. |
| disableAllDomainsAlwaysInScope| action |  | Disables all domains that are always in scope. |
| setOptionHandleParameters| action | String*  |  |
| setOptionScopeString| action | String*  | Use actions [add|modify|remove]DomainAlwaysInScope instead. |
| setOptionSkipURLString| action | String*  |  |
| setOptionUserAgent| action | String*  |  |
| setOptionHandleODataParametersVisited| action | Boolean*  |  |
| setOptionMaxChildren| action | Integer*  | Sets the maximum number of child nodes (per node) that can be crawled, 0 means no limit. |
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
| setOptionSendRefererHeader| action | Boolean*  | Sets whether or not the 'Referer' header should be sent while spidering. |
| setOptionShowAdvancedDialog| action | Boolean*  |  |
| setOptionThreadCount| action | Integer*  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

