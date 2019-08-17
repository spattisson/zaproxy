# ZAP 2.8.0 API
## Component: core
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| hosts| view |  | Gets the name of the hosts accessed through/by ZAP |
| sites| view |  | Gets the sites accessed through/by ZAP (scheme and domain) |
| urls| view | baseurl  | Gets the URLs accessed through/by ZAP, optionally filtering by (base) URL. |
| childNodes| view | url  | Gets the child nodes underneath the specified URL in the Sites tree |
| message| view | id*  | Gets the HTTP message with the given ID. Returns the ID, request/response headers and bodies, cookies, note, type, RTT, and timestamp. |
| messages| view | baseurl start count  | Gets the HTTP messages sent by ZAP, request and response, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| messagesById| view | ids*  | Gets the HTTP messages with the given IDs. |
| numberOfMessages| view | baseurl  | Gets the number of messages, optionally filtering by URL |
| mode| view |  | Gets the mode |
| version| view |  | Gets ZAP version |
| excludedFromProxy| view |  | Gets the regular expressions, applied to URLs, to exclude from the local proxies. |
| homeDirectory| view |  |  |
| sessionLocation| view |  | Gets the location of the current session file |
| proxyChainExcludedDomains| view |  | Gets all the domains that are excluded from the outgoing proxy. For each domain the following are shown: the index, the value (domain), if enabled, and if specified as a regex. |
| optionProxyChainSkipName| view |  | Use view proxyChainExcludedDomains instead. |
| optionProxyExcludedDomains| view |  | Use view proxyChainExcludedDomains instead. |
| optionProxyExcludedDomainsEnabled| view |  | Use view proxyChainExcludedDomains instead. |
| zapHomePath| view |  | Gets the path to ZAP's home directory. |
| optionMaximumAlertInstances| view |  | Gets the maximum number of alert instances to include in a report. |
| optionMergeRelatedAlerts| view |  | Gets whether or not related alerts will be merged in any reports generated. |
| optionAlertOverridesFilePath| view |  | Gets the path to the file with alert overrides. |
| alert| view | id*  | Gets the alert with the given ID, the corresponding HTTP message can be obtained with the 'messageId' field and 'message' API method |
| alerts| view | baseurl start count riskId  | Gets the alerts raised by ZAP, optionally filtering by URL or riskId, and paginating with 'start' position and 'count' of alerts |
| alertsSummary| view | baseurl  | Gets number of alerts grouped by each risk level, optionally filtering by URL |
| numberOfAlerts| view | baseurl riskId  | Gets the number of alerts, optionally filtering by URL or riskId |
| optionDefaultUserAgent| view |  | Gets the user agent that ZAP should use when creating HTTP messages (for example, spider messages or CONNECT requests to outgoing proxy). |
| optionDnsTtlSuccessfulQueries| view |  | Gets the TTL (in seconds) of successful DNS queries. |
| optionHttpState| view |  |  |
| optionProxyChainName| view |  |  |
| optionProxyChainPassword| view |  |  |
| optionProxyChainPort| view |  |  |
| optionProxyChainRealm| view |  |  |
| optionProxyChainUserName| view |  |  |
| optionTimeoutInSecs| view |  | Gets the connection time out, in seconds. |
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
| snapshotSession| action | name overwrite  | Snapshots the session, optionally with the given name, and overwriting existing files. If no name is specified the name of the current session with a timestamp appended is used. If a relative path is specified it will be resolved against the "session" directory in ZAP "home" dir. |
| clearExcludedFromProxy| action |  | Clears the regexes of URLs excluded from the local proxies. |
| excludeFromProxy| action | regex*  | Adds a regex of URLs that should be excluded from the local proxies. |
| setHomeDirectory| action | dir*  |  |
| setMode| action | mode*  | Sets the mode, which may be one of [safe, protect, standard, attack] |
| generateRootCA| action |  | Generates a new Root CA certificate for the local proxies. |
| sendRequest| action | request* followRedirects  | Sends the HTTP request, optionally following redirections. Returns the request sent and response received and followed redirections, if any. The Mode is enforced when sending the request (and following redirections), custom manual requests are not allowed in 'Safe' mode nor in 'Protected' mode if out of scope. |
| runGarbageCollection| action |  |  |
| deleteSiteNode| action | url* method postData  | Deletes the site node found in the Sites Tree on the basis of the URL, HTTP method, and post data (if applicable and specified).  |
| addProxyChainExcludedDomain| action | value* isRegex isEnabled  | Adds a domain to be excluded from the outgoing proxy, using the specified value. Optionally sets if the new entry is enabled (default, true) and whether or not the new value is specified as a regex (default, false). |
| modifyProxyChainExcludedDomain| action | idx* value isRegex isEnabled  | Modifies a domain excluded from the outgoing proxy. Allows to modify the value, if enabled or if a regex. The domain is selected with its index, which can be obtained with the view proxyChainExcludedDomains. |
| removeProxyChainExcludedDomain| action | idx*  | Removes a domain excluded from the outgoing proxy, with the given index. The index can be obtained with the view proxyChainExcludedDomains. |
| enableAllProxyChainExcludedDomains| action |  | Enables all domains excluded from the outgoing proxy. |
| disableAllProxyChainExcludedDomains| action |  | Disables all domains excluded from the outgoing proxy. |
| setOptionMaximumAlertInstances| action | numberOfInstances*  | Sets the maximum number of alert instances to include in a report. A value of zero is treated as unlimited. |
| setOptionMergeRelatedAlerts| action | enabled*  | Sets whether or not related alerts will be merged in any reports generated. |
| setOptionAlertOverridesFilePath| action | filePath  | Sets (or clears, if empty) the path to the file with alert overrides. |
| enablePKCS12ClientCertificate| action | filePath* password* index  | Enables use of a PKCS12 client certificate for the certificate with the given file system path, password, and optional index. |
| disableClientCertificate| action |  | Disables the option for use of client certificates. |
| deleteAllAlerts| action |  | Deletes all alerts of the current session. |
| deleteAlert| action | id*  | Deletes the alert with the given ID.  |
| setOptionDefaultUserAgent| action | String*  | Sets the user agent that ZAP should use when creating HTTP messages (for example, spider messages or CONNECT requests to outgoing proxy). |
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
| setOptionTimeoutInSecs| action | Integer*  | Sets the connection time out, in seconds. |
| setOptionUseProxyChain| action | Boolean*  | Sets whether or not the outgoing proxy should be used. The address/hostname of the outgoing proxy must be set to enable this option. |
| setOptionUseProxyChainAuth| action | Boolean*  |  |
| proxy.pac| other |  |  |
| rootcert| other |  | Gets the Root CA certificate used by the local proxies. |
| setproxy| other | proxy*  |  |
| xmlreport| other |  | Generates a report in XML format |
| htmlreport| other |  | Generates a report in HTML format |
| jsonreport| other |  | Generates a report in JSON format |
| mdreport| other |  | Generates a report in Markdown format |
| messageHar| other | id*  | Gets the message with the given ID in HAR format |
| messagesHar| other | baseurl start count  | Gets the HTTP messages sent through/by ZAP, in HAR format, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| messagesHarById| other | ids*  | Gets the HTTP messages with the given IDs, in HAR format. |
| sendHarRequest| other | request* followRedirects  | Sends the first HAR request entry, optionally following redirections. Returns, in HAR format, the request sent and response received and followed redirections, if any. The Mode is enforced when sending the request (and following redirections), custom manual requests are not allowed in 'Safe' mode nor in 'Protected' mode if out of scope. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

