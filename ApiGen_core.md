# ZAP 2.4.0 API
## Component: core
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| alert  | view   | id`*`        | Gets the alert with the given ID, the corresponding HTTP message can be obtained with the 'messageId' field and 'message' API method |
| alerts | view   | baseurl start count  | Gets the alerts raised by ZAP, optionally filtering by URL and paginating with 'start' position and 'count' of alerts |
| numberOfAlerts| view   | baseurl      | Gets the number of alerts, optionally filtering by URL |
| hosts  | view   |              | Gets the name of the hosts accessed through/by ZAP |
| sites  | view   |              | Gets the sites accessed through/by ZAP (scheme and domain) |
| urls   | view   |              | Gets the URLs accessed through/by ZAP |
| message| view   | id`*`        | Gets the HTTP message with the given ID. Returns the ID, request/response headers and bodies, cookies and note. |
| messages| view   | baseurl start count  | Gets the HTTP messages sent by ZAP, request and response in HAR format, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| numberOfMessages| view   | baseurl      | Gets the number of messages, optionally filtering by URL |
| version| view   |              | Gets ZAP version |
| excludedFromProxy| view   |              | Gets the regular expressions, applied to URLs, to exclude from the Proxy |
| homeDirectory| view   |              |               |
| optionHttpStateEnabled| view   |              |               |
| optionUseProxyChain| view   |              |               |
| optionProxyChainName| view   |              |               |
| optionProxyChainPort| view   |              |               |
| optionProxyChainSkipName| view   |              |               |
| optionUseProxyChainAuth| view   |              |               |
| optionProxyChainUserName| view   |              |               |
| optionProxyChainRealm| view   |              |               |
| optionProxyChainPassword| view   |              |               |
| optionProxyChainPrompt| view   |              |               |
| optionHttpState| view   |              |               |
| optionTimeoutInSecs| view   |              |               |
| optionSingleCookieRequestHeader| view   |              |               |
| optionProxyExcludedDomains| view   |              |               |
| optionProxyExcludedDomainsEnabled| view   |              |               |
| shutdown| action |              | Shuts down ZAP |
| newSession| action | name overwrite  | Creates a new session, optionally overwriting existing files |
| loadSession| action | name`*`      | Loads the session with the given name |
| saveSession| action | name`*` overwrite  | Saves the session with the name supplied, optionally overwriting existing files |
| snapshotSession| action |              |               |
| clearExcludedFromProxy| action |              |               |
| excludeFromProxy| action | regex`*`     |               |
| setHomeDirectory| action | dir`*`       |               |
| generateRootCA| action |              |               |
| sendRequest| action | request`*` followRedirects  | Sends the HTTP request, optionally following redirections. Returns the request sent and response received and followed redirections, if any. |
| deleteAllAlerts| action |              |               |
| setOptionProxyChainName| action | String`*`    |               |
| setOptionProxyChainRealm| action | String`*`    |               |
| setOptionProxyChainUserName| action | String`*`    |               |
| setOptionProxyChainPassword| action | String`*`    |               |
| setOptionProxyChainSkipName| action | String`*`    |               |
| setOptionHttpStateEnabled| action | Boolean`*`   |               |
| setOptionProxyChainPort| action | Integer`*`   |               |
| setOptionProxyChainPrompt| action | Boolean`*`   |               |
| setOptionTimeoutInSecs| action | Integer`*`   |               |
| setOptionUseProxyChain| action | Boolean`*`   |               |
| setOptionUseProxyChainAuth| action | Boolean`*`   |               |
| setOptionSingleCookieRequestHeader| action | Boolean`*`   |               |
| proxy.pac| other  |              |               |
| rootcert| other  |              |               |
| setproxy| other  | proxy`*`     |               |
| xmlreport| other  |              | Generates a report in XML format |
| htmlreport| other  |              | Generates a report in HTML format |
| messageHar| other  | id`*`        | Gets the message with the given ID in HAR format |
| messagesHar| other  | baseurl start count  | Gets the HTTP messages sent through/by ZAP, in HAR format, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| sendHarRequest| other  | request`*` followRedirects  | Sends the first HAR request entry, optionally following redirections. Returns, in HAR format, the request sent and response received and followed redirections, if any. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)
