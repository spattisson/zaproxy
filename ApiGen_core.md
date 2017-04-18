# ZAP 2.6.0 API
## Component: core
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| alert| view | id*  | Gets the alert with the given ID, the corresponding HTTP message can be obtained with the 'messageId' field and 'message' API method |
| alerts| view | baseurl start count  | Gets the alerts raised by ZAP, optionally filtering by URL and paginating with 'start' position and 'count' of alerts |
| numberOfAlerts| view | baseurl  | Gets the number of alerts, optionally filtering by URL |
| hosts| view |  | Gets the name of the hosts accessed through/by ZAP |
| sites| view |  | Gets the sites accessed through/by ZAP (scheme and domain) |
| urls| view |  | Gets the URLs accessed through/by ZAP |
| message| view | id*  | Gets the HTTP message with the given ID. Returns the ID, request/response headers and bodies, cookies and note. |
| messages| view | baseurl start count  | Gets the HTTP messages sent by ZAP, request and response, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| numberOfMessages| view | baseurl  | Gets the number of messages, optionally filtering by URL |
| mode| view |  | Gets the mode |
| version| view |  | Gets ZAP version |
| excludedFromProxy| view |  | Gets the regular expressions, applied to URLs, to exclude from the Proxy |
| homeDirectory| view |  |  |
| sessionLocation| view |  | Gets the location of the current session file |
| proxyChainExcludedDomains| view |  | Gets all the domains that are excluded from the outgoing proxy. For each domain the following are shown: the index, the value (domain), if enabled, and if specified as a regex. |
| optionProxyChainSkipName| view |  | Use view proxyChainExcludedDomains instead. |
| optionProxyExcludedDomains| view |  | Use view proxyChainExcludedDomains instead. |
| optionProxyExcludedDomainsEnabled| view |  | Use view proxyChainExcludedDomains instead. |
| optionDefaultUserAgent| view |  |  |
| optionDnsTtlSuccessfulQueries| view |  | Gets the TTL (in seconds) of successful DNS queries. |
| optionHttpState| view |  |  |
| optionProxyChainName| view |  |  |
| optionProxyChainPassword| view |  |  |
| optionProxyChainPort| view |  |  |
| optionProxyChainRealm| view |  |  |
| optionProxyChainUserName| view |  |  |
| optionTimeoutInSecs| view |  |  |
| optionHttpStateEnabled| view |  |  |
| optionProxyChainPrompt| view |  |  |
| optionSingleCookieRequestHeader| view |  |  |
| optionUseProxyChain| view |  |  |
| optionUseProxyChainAuth| view |  |  |
| accessUrl| action | url* followRedirects  | Convenient and simple action to access a URL, optionally following redirections. Returns the request sent and response received and followed redirections, if any. Other actions are available which offer more control on what is sent, like, 'sendRequest' or 'sendHarRequest'. |
| shutdown| action |  | Shuts down ZAP |
| newSession| action | name overwrite  | Creates a new session, optionally overwriting existing files. If a relative path is specified it will be resolved against the "session" directory in ZAP "home" dir. |
| loadSession| action | name*  | Loads the session with the given name. If a relative path is specified it will be resolved against the "session" directory in ZAP "home" dir. |
| saveSession| action | name* overwrite  | Saves the session with the name supplied, optionally overwriting existing files. If a relative path is specified it will be resolved against the "session" directory in ZAP "home" dir. |
| snapshotSession| action |  |  |
| clearExcludedFromProxy| action |  | Clears the regexes of URLs excluded from the proxy. |
| excludeFromProxy| action | regex*  | Adds a regex of URLs that should be excluded from the proxy. |
| setHomeDirectory| action | dir*  |  |
| setMode| action | mode*  | Sets the mode, which may be one of [safe, protect, standard, attack] |
| generateRootCA| action |  | Generates a new Root CA certificate for the Local Proxy. |
| sendRequest| action | request* followRedirects  | Sends the HTTP request, optionally following redirections. Returns the request sent and response received and followed redirections, if any. The Mode is enforced when sending the request (and following redirections), custom manual requests are not allowed in 'Safe' mode nor in 'Protected' mode if out of scope. |
| deleteAllAlerts| action |  | Deletes all alerts of the current session. |
| runGarbageCollection| action |  |  |
| deleteSiteNode| action | url* method postData  | Deletes the site node found in the Sites Tree on the basis of the URL, HTTP method, and post data (if applicable and specified).  |
| addProxyChainExcludedDomain| action | value* isRegex isEnabled  | Adds a domain to be excluded from the outgoing proxy, using the specified value. Optionally sets if the new entry is enabled (default, true) and whether or not the new value is specified as a regex (default, false). |
| modifyProxyChainExcludedDomain| action | idx* value isRegex isEnabled  | Modifies a domain excluded from the outgoing proxy. Allows to modify the value, if enabled or if a regex. The domain is selected with its index, which can be obtained with the view proxyChainExcludedDomains. |
| removeProxyChainExcludedDomain| action | idx*  | Removes a domain excluded from the outgoing proxy, with the given index. The index can be obtained with the view proxyChainExcludedDomains. |
| enableAllProxyChainExcludedDomains| action |  | Enables all domains excluded from the outgoing proxy. |
| disableAllProxyChainExcludedDomains| action |  | Disables all domains excluded from the outgoing proxy. |
| setOptionDefaultUserAgent| action | String*  |  |
| setOptionProxyChainName| action | String*  |  |
| setOptionProxyChainPassword| action | String*  |  |
| setOptionProxyChainRealm| action | String*  |  |
| setOptionProxyChainSkipName| action | String*  | Use actions [add|modify|remove]ProxyChainExcludedDomain instead. |
| setOptionProxyChainUserName| action | String*  |  |
| setOptionDnsTtlSuccessfulQueries| action | Integer*  | Sets the TTL (in seconds) of successful DNS queries (applies after ZAP restart). |
| setOptionHttpStateEnabled| action | Boolean*  |  |
| setOptionProxyChainPort| action | Integer*  |  |
| setOptionProxyChainPrompt| action | Boolean*  |  |
| setOptionSingleCookieRequestHeader| action | Boolean*  |  |
| setOptionTimeoutInSecs| action | Integer*  |  |
| setOptionUseProxyChain| action | Boolean*  |  |
| setOptionUseProxyChainAuth| action | Boolean*  |  |
| proxy.pac| other |  |  |
| rootcert| other |  | Gets the Root CA certificate of the Local Proxy. |
| setproxy| other | proxy*  |  |
| xmlreport| other |  | Generates a report in XML format |
| htmlreport| other |  | Generates a report in HTML format |
| mdreport| other |  | Generates a report in Markdown format |
| messageHar| other | id*  | Gets the message with the given ID in HAR format |
| messagesHar| other | baseurl start count  | Gets the HTTP messages sent through/by ZAP, in HAR format, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| sendHarRequest| other | request* followRedirects  | Sends the first HAR request entry, optionally following redirections. Returns, in HAR format, the request sent and response received and followed redirections, if any. The Mode is enforced when sending the request (and following redirections), custom manual requests are not allowed in 'Safe' mode nor in 'Protected' mode if out of scope. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

