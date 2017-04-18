# ZAP 2.6.0 API
## Component: core
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| alert| view | id*  | Gets the alert with the given ID, the corresponding HTTP message can be obtained with the 'messageId' field and 'message' API method |
| alerts| view | baseurl start count  | Gets the alerts raised by ZAP, optionally filtering by URL and paginating with 'start' position and 'count' of alerts |
| excludedFromProxy| view |  | Gets the regular expressions, applied to URLs, to exclude from the Proxy |
| homeDirectory| view |  |  |
| hosts| view |  | Gets the name of the hosts accessed through/by ZAP |
| message| view | id*  | Gets the HTTP message with the given ID. Returns the ID, request/response headers and bodies, cookies and note. |
| messages| view | baseurl start count  | Gets the HTTP messages sent by ZAP, request and response, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| mode| view |  | Gets the mode |
| numberOfAlerts| view | baseurl  | Gets the number of alerts, optionally filtering by URL |
| numberOfMessages| view | baseurl  | Gets the number of messages, optionally filtering by URL |
| optionDefaultUserAgent| view |  |  |
| optionDnsTtlSuccessfulQueries| view |  | Gets the TTL (in seconds) of successful DNS queries. |
| optionHttpState| view |  |  |
| optionHttpStateEnabled| view |  |  |
| optionProxyChainName| view |  |  |
| optionProxyChainPassword| view |  |  |
| optionProxyChainPort| view |  |  |
| optionProxyChainPrompt| view |  |  |
| optionProxyChainRealm| view |  |  |
| optionProxyChainSkipName| view |  | Use view proxyChainExcludedDomains instead. |
| optionProxyChainUserName| view |  |  |
| optionProxyExcludedDomains| view |  | Use view proxyChainExcludedDomains instead. |
| optionProxyExcludedDomainsEnabled| view |  | Use view proxyChainExcludedDomains instead. |
| optionSingleCookieRequestHeader| view |  |  |
| optionTimeoutInSecs| view |  |  |
| optionUseProxyChain| view |  |  |
| optionUseProxyChainAuth| view |  |  |
| proxyChainExcludedDomains| view |  | Gets all the domains that are excluded from the outgoing proxy. For each domain the following are shown: the index, the value (domain), if enabled, and if specified as a regex. |
| sessionLocation| view |  | Gets the location of the current session file |
| sites| view |  | Gets the sites accessed through/by ZAP (scheme and domain) |
| urls| view |  | Gets the URLs accessed through/by ZAP |
| version| view |  | Gets ZAP version |
| htmlreport| action |  |  |
| mdreport| action |  |  |
| messageHar| action | id*  |  |
| messagesHar| action | baseurl start count  |  |
| proxy.pac| action |  |  |
| rootcert| action |  |  |
| sendHarRequest| action | request* followRedirects  |  |
| setproxy| action | proxy*  |  |
| xmlreport| action |  |  |
| alert| other | id*  |  |
| alerts| other | baseurl start count  |  |
| excludedFromProxy| other |  |  |
| homeDirectory| other |  |  |
| hosts| other |  |  |
| message| other | id*  |  |
| messages| other | baseurl start count  |  |
| mode| other |  |  |
| numberOfAlerts| other | baseurl  |  |
| numberOfMessages| other | baseurl  |  |
| optionDefaultUserAgent| other |  |  |
| optionDnsTtlSuccessfulQueries| other |  |  |
| optionHttpState| other |  |  |
| optionHttpStateEnabled| other |  |  |
| optionProxyChainName| other |  |  |
| optionProxyChainPassword| other |  |  |
| optionProxyChainPort| other |  |  |
| optionProxyChainPrompt| other |  |  |
| optionProxyChainRealm| other |  |  |
| optionProxyChainSkipName| other |  |  |
| optionProxyChainUserName| other |  |  |
| optionProxyExcludedDomains| other |  |  |
| optionProxyExcludedDomainsEnabled| other |  |  |
| optionSingleCookieRequestHeader| other |  |  |
| optionTimeoutInSecs| other |  |  |
| optionUseProxyChain| other |  |  |
| optionUseProxyChainAuth| other |  |  |
| proxyChainExcludedDomains| other |  |  |
| sessionLocation| other |  |  |
| sites| other |  |  |
| urls| other |  |  |
| version| other |  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

