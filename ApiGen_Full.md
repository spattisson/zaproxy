# ZAP 2.4.0 API
## Full List
| _Component_ | _Name_ | _Type_ | _Parameters_ | _Description_ |
|:------------|:-------|:-------|:-------------|:--------------|
| acsrf       | optionTokensNames| view   |              | Lists the names of all anti CSRF tokens |
| acsrf       | addOptionToken| action | String`*`    | Adds an anti CSRF token with the given name, enabled by default |
| acsrf       | removeOptionToken| action | String`*`    | Removes the anti CSRF token with the given name |
| acsrf       | genForm| other  | hrefId`*`    | Generate a form for testing lack of anti CSRF tokens - typically invoked via ZAP |
| pscan       | recordsToScan| view   |              | The number of records the passive scanner still has to scan |
| pscan       | scanners| view   |              | Lists all passive scanners with its ID, name, enabled state and alert threshold. |
| pscan       | setEnabled| action | enabled`*`   | Sets whether or not the passive scanning is enabled |
| pscan       | enableAllScanners| action |              | Enables all passive scanners |
| pscan       | disableAllScanners| action |              | Disables all passive scanners |
| pscan       | enableScanners| action | ids`*`       | Enables all passive scanners with the given IDs (comma separated list of IDs) |
| pscan       | disableScanners| action | ids`*`       | Disables all passive scanners with the given IDs (comma separated list of IDs) |
| pscan       | setScannerAlertThreshold| action | id`*` alertThreshold`*`  | Sets the alert threshold of the passive scanner with the given ID, accepted values for alert threshold: OFF, DEFAULT, LOW, MEDIUM and HIGH |
| search      | urlsByUrlRegex| view   | regex`*` baseurl start count  |               |
| search      | urlsByRequestRegex| view   | regex`*` baseurl start count  |               |
| search      | urlsByResponseRegex| view   | regex`*` baseurl start count  |               |
| search      | urlsByHeaderRegex| view   | regex`*` baseurl start count  |               |
| search      | messagesByUrlRegex| view   | regex`*` baseurl start count  |               |
| search      | messagesByRequestRegex| view   | regex`*` baseurl start count  |               |
| search      | messagesByResponseRegex| view   | regex`*` baseurl start count  |               |
| search      | messagesByHeaderRegex| view   | regex`*` baseurl start count  |               |
| search      | harByUrlRegex| other  | regex`*` baseurl start count  |               |
| search      | harByRequestRegex| other  | regex`*` baseurl start count  |               |
| search      | harByResponseRegex| other  | regex`*` baseurl start count  |               |
| search      | harByHeaderRegex| other  | regex`*` baseurl start count  |               |
| autoupdate  | latestVersionNumber| view   |              |               |
| autoupdate  | isLatestVersion| view   |              |               |
| autoupdate  | optionCheckOnStart| view   |              |               |
| autoupdate  | optionDownloadNewRelease| view   |              |               |
| autoupdate  | optionCheckAddonUpdates| view   |              |               |
| autoupdate  | optionInstallAddonUpdates| view   |              |               |
| autoupdate  | optionInstallScannerRules| view   |              |               |
| autoupdate  | optionReportReleaseAddons| view   |              |               |
| autoupdate  | optionReportBetaAddons| view   |              |               |
| autoupdate  | optionReportAlphaAddons| view   |              |               |
| autoupdate  | downloadLatestRelease| action |              |               |
| autoupdate  | setOptionCheckOnStart| action | Boolean`*`   |               |
| autoupdate  | setOptionDownloadNewRelease| action | Boolean`*`   |               |
| autoupdate  | setOptionCheckAddonUpdates| action | Boolean`*`   |               |
| autoupdate  | setOptionInstallAddonUpdates| action | Boolean`*`   |               |
| autoupdate  | setOptionInstallScannerRules| action | Boolean`*`   |               |
| autoupdate  | setOptionReportReleaseAddons| action | Boolean`*`   |               |
| autoupdate  | setOptionReportBetaAddons| action | Boolean`*`   |               |
| autoupdate  | setOptionReportAlphaAddons| action | Boolean`*`   |               |
| spider      | status | view   | scanId       |               |
| spider      | results| view   | scanId       |               |
| spider      | fullResults| view   | scanId`*`    |               |
| spider      | scans  | view   |              |               |
| spider      | excludedFromScan| view   |              |               |
| spider      | optionMaxDepth| view   |              |               |
| spider      | optionScopeText| view   |              |               |
| spider      | optionScope| view   |              |               |
| spider      | optionThreadCount| view   |              |               |
| spider      | optionPostForm| view   |              |               |
| spider      | optionProcessForm| view   |              |               |
| spider      | optionSkipURLString| view   |              |               |
| spider      | optionRequestWaitTime| view   |              |               |
| spider      | optionUserAgent| view   |              |               |
| spider      | optionParseComments| view   |              |               |
| spider      | optionParseRobotsTxt| view   |              |               |
| spider      | optionParseSitemapXml| view   |              |               |
| spider      | optionParseSVNEntries| view   |              |               |
| spider      | optionParseGit| view   |              |               |
| spider      | optionHandleParameters| view   |              |               |
| spider      | optionHandleODataParametersVisited| view   |              |               |
| spider      | optionDomainsAlwaysInScope| view   |              |               |
| spider      | optionDomainsAlwaysInScopeEnabled| view   |              |               |
| spider      | optionMaxScansInUI| view   |              |               |
| spider      | optionShowAdvancedDialog| view   |              |               |
| spider      | optionSendRefererHeader| view   |              | Sets whether or not the 'Referer' header should be sent while spidering |
| spider      | scan   | action | url`*` maxChildren  |               |
| spider      | scanAsUser| action | url`*` contextId`*` userId`*` maxChildren`*`  |               |
| spider      | pause  | action | scanId`*`    |               |
| spider      | resume | action | scanId`*`    |               |
| spider      | stop   | action | scanId       |               |
| spider      | removeScan| action | scanId`*`    |               |
| spider      | pauseAllScans| action |              |               |
| spider      | resumeAllScans| action |              |               |
| spider      | stopAllScans| action |              |               |
| spider      | removeAllScans| action |              |               |
| spider      | clearExcludedFromScan| action |              |               |
| spider      | excludeFromScan| action | regex`*`     |               |
| spider      | setOptionScopeString| action | String`*`    |               |
| spider      | setOptionUserAgent| action | String`*`    |               |
| spider      | setOptionSkipURLString| action | String`*`    |               |
| spider      | setOptionHandleParameters| action | String`*`    |               |
| spider      | setOptionMaxDepth| action | Integer`*`   |               |
| spider      | setOptionThreadCount| action | Integer`*`   |               |
| spider      | setOptionPostForm| action | Boolean`*`   |               |
| spider      | setOptionProcessForm| action | Boolean`*`   |               |
| spider      | setOptionRequestWaitTime| action | Integer`*`   |               |
| spider      | setOptionParseComments| action | Boolean`*`   |               |
| spider      | setOptionParseRobotsTxt| action | Boolean`*`   |               |
| spider      | setOptionParseSitemapXml| action | Boolean`*`   |               |
| spider      | setOptionParseSVNEntries| action | Boolean`*`   |               |
| spider      | setOptionParseGit| action | Boolean`*`   |               |
| spider      | setOptionHandleODataParametersVisited| action | Boolean`*`   |               |
| spider      | setOptionMaxScansInUI| action | Integer`*`   |               |
| spider      | setOptionShowAdvancedDialog| action | Boolean`*`   |               |
| spider      | setOptionSendRefererHeader| action | Boolean`*`   |               |
| core        | alert  | view   | id`*`        | Gets the alert with the given ID, the corresponding HTTP message can be obtained with the 'messageId' field and 'message' API method |
| core        | alerts | view   | baseurl start count  | Gets the alerts raised by ZAP, optionally filtering by URL and paginating with 'start' position and 'count' of alerts |
| core        | numberOfAlerts| view   | baseurl      | Gets the number of alerts, optionally filtering by URL |
| core        | hosts  | view   |              | Gets the name of the hosts accessed through/by ZAP |
| core        | sites  | view   |              | Gets the sites accessed through/by ZAP (scheme and domain) |
| core        | urls   | view   |              | Gets the URLs accessed through/by ZAP |
| core        | message| view   | id`*`        | Gets the HTTP message with the given ID. Returns the ID, request/response headers and bodies, cookies and note. |
| core        | messages| view   | baseurl start count  | Gets the HTTP messages sent by ZAP, request and response in HAR format, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| core        | numberOfMessages| view   | baseurl      | Gets the number of messages, optionally filtering by URL |
| core        | version| view   |              | Gets ZAP version |
| core        | excludedFromProxy| view   |              | Gets the regular expressions, applied to URLs, to exclude from the Proxy |
| core        | homeDirectory| view   |              |               |
| core        | optionHttpStateEnabled| view   |              |               |
| core        | optionUseProxyChain| view   |              |               |
| core        | optionProxyChainName| view   |              |               |
| core        | optionProxyChainPort| view   |              |               |
| core        | optionProxyChainSkipName| view   |              |               |
| core        | optionUseProxyChainAuth| view   |              |               |
| core        | optionProxyChainUserName| view   |              |               |
| core        | optionProxyChainRealm| view   |              |               |
| core        | optionProxyChainPassword| view   |              |               |
| core        | optionProxyChainPrompt| view   |              |               |
| core        | optionHttpState| view   |              |               |
| core        | optionTimeoutInSecs| view   |              |               |
| core        | optionSingleCookieRequestHeader| view   |              |               |
| core        | optionProxyExcludedDomains| view   |              |               |
| core        | optionProxyExcludedDomainsEnabled| view   |              |               |
| core        | shutdown| action |              | Shuts down ZAP |
| core        | newSession| action | name overwrite  | Creates a new session, optionally overwriting existing files |
| core        | loadSession| action | name`*`      | Loads the session with the given name |
| core        | saveSession| action | name`*` overwrite  | Saves the session with the name supplied, optionally overwriting existing files |
| core        | snapshotSession| action |              |               |
| core        | clearExcludedFromProxy| action |              |               |
| core        | excludeFromProxy| action | regex`*`     |               |
| core        | setHomeDirectory| action | dir`*`       |               |
| core        | generateRootCA| action |              |               |
| core        | sendRequest| action | request`*` followRedirects  | Sends the HTTP request, optionally following redirections. Returns the request sent and response received and followed redirections, if any. |
| core        | deleteAllAlerts| action |              |               |
| core        | setOptionProxyChainName| action | String`*`    |               |
| core        | setOptionProxyChainRealm| action | String`*`    |               |
| core        | setOptionProxyChainUserName| action | String`*`    |               |
| core        | setOptionProxyChainPassword| action | String`*`    |               |
| core        | setOptionProxyChainSkipName| action | String`*`    |               |
| core        | setOptionHttpStateEnabled| action | Boolean`*`   |               |
| core        | setOptionProxyChainPort| action | Integer`*`   |               |
| core        | setOptionProxyChainPrompt| action | Boolean`*`   |               |
| core        | setOptionTimeoutInSecs| action | Integer`*`   |               |
| core        | setOptionUseProxyChain| action | Boolean`*`   |               |
| core        | setOptionUseProxyChainAuth| action | Boolean`*`   |               |
| core        | setOptionSingleCookieRequestHeader| action | Boolean`*`   |               |
| core        | proxy.pac| other  |              |               |
| core        | rootcert| other  |              |               |
| core        | setproxy| other  | proxy`*`     |               |
| core        | xmlreport| other  |              | Generates a report in XML format |
| core        | htmlreport| other  |              | Generates a report in HTML format |
| core        | messageHar| other  | id`*`        | Gets the message with the given ID in HAR format |
| core        | messagesHar| other  | baseurl start count  | Gets the HTTP messages sent through/by ZAP, in HAR format, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| core        | sendHarRequest| other  | request`*` followRedirects  | Sends the first HAR request entry, optionally following redirections. Returns, in HAR format, the request sent and response received and followed redirections, if any. |
| params      | params | view   | site         | Shows the parameters for the specified site, or for all sites if the site is not specified |
| ascan       | status | view   | scanId       |               |
| ascan       | scanProgress| view   | scanId       |               |
| ascan       | messagesIds| view   | scanId`*`    |               |
| ascan       | alertsIds| view   | scanId`*`    |               |
| ascan       | scans  | view   |              |               |
| ascan       | scanPolicyNames| view   |              |               |
| ascan       | excludedFromScan| view   |              |               |
| ascan       | scanners| view   | scanPolicyName policyId  |               |
| ascan       | policies| view   | scanPolicyName policyId  |               |
| ascan       | attackModeQueue| view   |              |               |
| ascan       | optionMaxScansInUI| view   |              |               |
| ascan       | optionShowAdvancedDialog| view   |              |               |
| ascan       | optionExcludedParamList| view   |              |               |
| ascan       | optionThreadPerHost| view   |              |               |
| ascan       | optionHostPerScan| view   |              |               |
| ascan       | optionMaxResultsToList| view   |              |               |
| ascan       | optionDelayInMs| view   |              |               |
| ascan       | optionInjectPluginIdInHeader| view   |              |               |
| ascan       | optionHandleAntiCSRFTokens| view   |              |               |
| ascan       | optionRescanInAttackMode| view   |              |               |
| ascan       | optionPromptInAttackMode| view   |              |               |
| ascan       | optionTargetParamsInjectable| view   |              |               |
| ascan       | optionTargetParamsEnabledRPC| view   |              |               |
| ascan       | optionPromptToClearFinishedScans| view   |              |               |
| ascan       | optionDefaultPolicy| view   |              |               |
| ascan       | optionAttackPolicy| view   |              |               |
| ascan       | optionAllowAttackOnStart| view   |              |               |
| ascan       | scan   | action | url`*` recurse inScopeOnly scanPolicyName method postData  |               |
| ascan       | scanAsUser| action | url`*` contextId`*` userId`*` recurse scanPolicyName method postData  | Active Scans from the perspective of an User, obtained using the given Context ID and User ID. See 'scan' action for more details. |
| ascan       | pause  | action | scanId`*`    |               |
| ascan       | resume | action | scanId`*`    |               |
| ascan       | stop   | action | scanId`*`    |               |
| ascan       | removeScan| action | scanId`*`    |               |
| ascan       | pauseAllScans| action |              |               |
| ascan       | resumeAllScans| action |              |               |
| ascan       | stopAllScans| action |              |               |
| ascan       | removeAllScans| action |              |               |
| ascan       | clearExcludedFromScan| action |              |               |
| ascan       | excludeFromScan| action | regex`*`     |               |
| ascan       | enableAllScanners| action | scanPolicyName  |               |
| ascan       | disableAllScanners| action | scanPolicyName  |               |
| ascan       | enableScanners| action | ids`*`       |               |
| ascan       | disableScanners| action | ids`*`       |               |
| ascan       | setEnabledPolicies| action | ids`*`       |               |
| ascan       | setPolicyAttackStrength| action | id`*` attackStrength`*` scanPolicyName  |               |
| ascan       | setPolicyAlertThreshold| action | id`*` alertThreshold`*` scanPolicyName  |               |
| ascan       | setScannerAttackStrength| action | id`*` attackStrength`*` scanPolicyName  |               |
| ascan       | setScannerAlertThreshold| action | id`*` alertThreshold`*` scanPolicyName  |               |
| ascan       | addScanPolicy| action | scanPolicyName`*`  |               |
| ascan       | removeScanPolicy| action | scanPolicyName`*`  |               |
| ascan       | setOptionDefaultPolicy| action | String`*`    |               |
| ascan       | setOptionAttackPolicy| action | String`*`    |               |
| ascan       | setOptionMaxScansInUI| action | Integer`*`   |               |
| ascan       | setOptionShowAdvancedDialog| action | Boolean`*`   |               |
| ascan       | setOptionThreadPerHost| action | Integer`*`   |               |
| ascan       | setOptionHostPerScan| action | Integer`*`   |               |
| ascan       | setOptionMaxResultsToList| action | Integer`*`   |               |
| ascan       | setOptionDelayInMs| action | Integer`*`   |               |
| ascan       | setOptionInjectPluginIdInHeader| action | Boolean`*`   |               |
| ascan       | setOptionHandleAntiCSRFTokens| action | Boolean`*`   |               |
| ascan       | setOptionRescanInAttackMode| action | Boolean`*`   |               |
| ascan       | setOptionPromptInAttackMode| action | Boolean`*`   |               |
| ascan       | setOptionTargetParamsInjectable| action | Integer`*`   |               |
| ascan       | setOptionTargetParamsEnabledRPC| action | Integer`*`   |               |
| ascan       | setOptionPromptToClearFinishedScans| action | Boolean`*`   |               |
| ascan       | setOptionAllowAttackOnStart| action | Boolean`*`   |               |
| context     | contextList| view   |              | List context names of current session |
| context     | excludeRegexs| view   | contextName`*`  | List excluded regexs for context |
| context     | includeRegexs| view   | contextName`*`  | List included regexs for context |
| context     | context| view   | contextName`*`  | List the information about the named context |
| context     | excludeFromContext| action | contextName`*` regex`*`  | Add exclude regex to context |
| context     | includeInContext| action | contextName`*` regex`*`  | Add include regex to context |
| context     | newContext| action | contextName  | Creates a new context in the current session |
| context     | exportContext| action | contextName`*` contextFile`*`  |               |
| context     | importContext| action | contextFile`*`  |               |
| context     | setContextInScope| action | contextName`*` booleanInScope`*`  | Sets a context to in scope (contexts are in scope by default) |
| httpSessions| sessions| view   | site`*` session  |               |
| httpSessions| activeSession| view   | site`*`      |               |
| httpSessions| sessionTokens| view   | site`*`      |               |
| httpSessions| createEmptySession| action | site`*` session  |               |
| httpSessions| removeSession| action | site`*` session`*`  |               |
| httpSessions| setActiveSession| action | site`*` session`*`  |               |
| httpSessions| unsetActiveSession| action | site`*`      |               |
| httpSessions| addSessionToken| action | site`*` sessionToken`*`  |               |
| httpSessions| removeSessionToken| action | site`*` sessionToken`*`  |               |
| httpSessions| setSessionTokenValue| action | site`*` session`*` sessionToken`*` tokenValue`*`  |               |
| httpSessions| renameSession| action | site`*` oldSessionName`*` newSessionName`*`  |               |
| break       | break  | action | type`*` scope`*` state`*`  |               |
| break       | addHttpBreakpoint| action | string`*` location`*` match`*` inverse`*` ignorecase`*`  |               |
| break       | removeHttpBreakpoint| action | string`*` location`*` match`*` inverse`*` ignorecase`*`  |               |
| authentication| getSupportedAuthenticationMethods| view   |              |               |
| authentication| getAuthenticationMethodConfigParams| view   | authMethodName`*`  |               |
| authentication| getAuthenticationMethod| view   | contextId`*`  |               |
| authentication| getLoggedInIndicator| view   | contextId`*`  |               |
| authentication| getLoggedOutIndicator| view   | contextId`*`  |               |
| authentication| setAuthenticationMethod| action | contextId`*` authMethodName`*` authMethodConfigParams  |               |
| authentication| setLoggedInIndicator| action | contextId`*` loggedInIndicatorRegex`*`  |               |
| authentication| setLoggedOutIndicator| action | contextId`*` loggedOutIndicatorRegex`*`  |               |
| sessionManagement| getSupportedSessionManagementMethods| view   |              |               |
| sessionManagement| getSessionManagementMethodConfigParams| view   | methodName`*`  |               |
| sessionManagement| getSessionManagementMethod| view   | contextId`*`  |               |
| sessionManagement| setSessionManagementMethod| action | contextId`*` methodName`*` methodConfigParams  |               |
| users       | usersList| view   | contextId    |               |
| users       | getUserById| view   | contextId userId  |               |
| users       | getAuthenticationCredentialsConfigParams| view   | contextId`*`  |               |
| users       | getAuthenticationCredentials| view   | contextId`*` userId`*`  |               |
| users       | newUser| action | contextId`*` name`*`  |               |
| users       | removeUser| action | contextId`*` userId`*`  |               |
| users       | setUserEnabled| action | contextId`*` userId`*` enabled`*`  |               |
| users       | setUserName| action | contextId`*` userId`*` name`*`  |               |
| users       | setAuthenticationCredentials| action | contextId`*` userId`*` authCredentialsConfigParams  |               |
| forcedUser  | isForcedUserModeEnabled| view   |              |               |
| forcedUser  | getForcedUser| view   | contextId`*`  |               |
| forcedUser  | setForcedUser| action | contextId`*` userId`*`  |               |
| forcedUser  | setForcedUserModeEnabled| action | boolean`*`   |               |
| script      | listEngines| view   |              |               |
| script      | listScripts| view   |              |               |
| script      | enable | action | scriptName`*`  |               |
| script      | disable| action | scriptName`*`  |               |
| script      | load   | action | scriptName`*` scriptType`*` scriptEngine`*` fileName`*` scriptDescription  |               |
| script      | remove | action | scriptName`*`  |               |
| script      | runStandAloneScript| action | scriptName`*`  |               |

Starred parameters are mandatory.

This component is optional and therefore the API will only work if it is installed.

Back to [index](ApiGen_Index)
