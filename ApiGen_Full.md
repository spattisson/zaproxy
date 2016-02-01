# ZAP 2.4.3 API
## Full List
| _Component_ | _Name_ | _Type_ | _Parameters_ | _Description_ |
|:------------|:-------|:-------|:-------------|:--------------|
| acsrf| optionTokensNames| view |  | Lists the names of all anti CSRF tokens |
| acsrf| addOptionToken| action | String`*`  | Adds an anti CSRF token with the given name, enabled by default |
| acsrf| removeOptionToken| action | String`*`  | Removes the anti CSRF token with the given name |
| acsrf| genForm| other | hrefId`*`  | Generate a form for testing lack of anti CSRF tokens - typically invoked via ZAP |
| pscan| recordsToScan| view |  | The number of records the passive scanner still has to scan |
| pscan| scanners| view |  | Lists all passive scanners with its ID, name, enabled state and alert threshold. |
| pscan| setEnabled| action | enabled`*`  | Sets whether or not the passive scanning is enabled |
| pscan| enableAllScanners| action |  | Enables all passive scanners |
| pscan| disableAllScanners| action |  | Disables all passive scanners |
| pscan| enableScanners| action | ids`*`  | Enables all passive scanners with the given IDs (comma separated list of IDs) |
| pscan| disableScanners| action | ids`*`  | Disables all passive scanners with the given IDs (comma separated list of IDs) |
| pscan| setScannerAlertThreshold| action | id`*` alertThreshold`*`  | Sets the alert threshold of the passive scanner with the given ID, accepted values for alert threshold: OFF, DEFAULT, LOW, MEDIUM and HIGH |
| search| urlsByUrlRegex| view | regex`*` baseurl start count  |  |
| search| urlsByRequestRegex| view | regex`*` baseurl start count  |  |
| search| urlsByResponseRegex| view | regex`*` baseurl start count  |  |
| search| urlsByHeaderRegex| view | regex`*` baseurl start count  |  |
| search| messagesByUrlRegex| view | regex`*` baseurl start count  |  |
| search| messagesByRequestRegex| view | regex`*` baseurl start count  |  |
| search| messagesByResponseRegex| view | regex`*` baseurl start count  |  |
| search| messagesByHeaderRegex| view | regex`*` baseurl start count  |  |
| search| harByUrlRegex| other | regex`*` baseurl start count  |  |
| search| harByRequestRegex| other | regex`*` baseurl start count  |  |
| search| harByResponseRegex| other | regex`*` baseurl start count  |  |
| search| harByHeaderRegex| other | regex`*` baseurl start count  |  |
| autoupdate| latestVersionNumber| view |  | Returns the latest version number |
| autoupdate| isLatestVersion| view |  | Returns 'true' if ZAP is on the latest version |
| autoupdate| optionAddonDirectories| view |  |  |
| autoupdate| optionDayLastChecked| view |  |  |
| autoupdate| optionDayLastInstallWarned| view |  |  |
| autoupdate| optionDayLastUpdateWarned| view |  |  |
| autoupdate| optionDownloadDirectory| view |  |  |
| autoupdate| optionCheckAddonUpdates| view |  |  |
| autoupdate| optionCheckOnStart| view |  |  |
| autoupdate| optionDownloadNewRelease| view |  |  |
| autoupdate| optionInstallAddonUpdates| view |  |  |
| autoupdate| optionInstallScannerRules| view |  |  |
| autoupdate| optionReportAlphaAddons| view |  |  |
| autoupdate| optionReportBetaAddons| view |  |  |
| autoupdate| optionReportReleaseAddons| view |  |  |
| autoupdate| downloadLatestRelease| action |  | Downloads the latest release, if any  |
| autoupdate| setOptionCheckAddonUpdates| action | Boolean`*`  |  |
| autoupdate| setOptionCheckOnStart| action | Boolean`*`  |  |
| autoupdate| setOptionDownloadNewRelease| action | Boolean`*`  |  |
| autoupdate| setOptionInstallAddonUpdates| action | Boolean`*`  |  |
| autoupdate| setOptionInstallScannerRules| action | Boolean`*`  |  |
| autoupdate| setOptionReportAlphaAddons| action | Boolean`*`  |  |
| autoupdate| setOptionReportBetaAddons| action | Boolean`*`  |  |
| autoupdate| setOptionReportReleaseAddons| action | Boolean`*`  |  |
| spider| status| view | scanId  |  |
| spider| results| view | scanId  |  |
| spider| fullResults| view | scanId`*`  |  |
| spider| scans| view |  |  |
| spider| excludedFromScan| view |  |  |
| spider| optionDomainsAlwaysInScope| view |  |  |
| spider| optionDomainsAlwaysInScopeEnabled| view |  |  |
| spider| optionHandleParameters| view |  |  |
| spider| optionMaxDepth| view |  |  |
| spider| optionMaxScansInUI| view |  |  |
| spider| optionRequestWaitTime| view |  |  |
| spider| optionScope| view |  |  |
| spider| optionScopeText| view |  |  |
| spider| optionSkipURLString| view |  |  |
| spider| optionThreadCount| view |  |  |
| spider| optionUserAgent| view |  |  |
| spider| optionHandleODataParametersVisited| view |  |  |
| spider| optionParseComments| view |  |  |
| spider| optionParseGit| view |  |  |
| spider| optionParseRobotsTxt| view |  |  |
| spider| optionParseSVNEntries| view |  |  |
| spider| optionParseSitemapXml| view |  |  |
| spider| optionPostForm| view |  |  |
| spider| optionProcessForm| view |  |  |
| spider| optionSendRefererHeader| view |  | Sets whether or not the 'Referer' header should be sent while spidering |
| spider| optionShowAdvancedDialog| view |  |  |
| spider| scan| action | url`*` maxChildren recurse contextName  | Runs the spider against the given URL. Optionally, the 'maxChildren' parameter can be set to limit the number of children scanned, the 'recurse' parameter can be used to prevent the spider from seeding recursively and the parameter 'contextName' can be used to constrain the scan to a Context. |
| spider| scanAsUser| action | url`*` contextId`*` userId`*` maxChildren recurse  | Runs the spider from the perspective of a User, obtained using the given Context ID and User ID. See 'scan' action for more details. |
| spider| pause| action | scanId`*`  |  |
| spider| resume| action | scanId`*`  |  |
| spider| stop| action | scanId  |  |
| spider| removeScan| action | scanId`*`  |  |
| spider| pauseAllScans| action |  |  |
| spider| resumeAllScans| action |  |  |
| spider| stopAllScans| action |  |  |
| spider| removeAllScans| action |  |  |
| spider| clearExcludedFromScan| action |  |  |
| spider| excludeFromScan| action | regex`*`  |  |
| spider| setOptionHandleParameters| action | String`*`  |  |
| spider| setOptionScopeString| action | String`*`  |  |
| spider| setOptionSkipURLString| action | String`*`  |  |
| spider| setOptionUserAgent| action | String`*`  |  |
| spider| setOptionHandleODataParametersVisited| action | Boolean`*`  |  |
| spider| setOptionMaxDepth| action | Integer`*`  |  |
| spider| setOptionMaxScansInUI| action | Integer`*`  |  |
| spider| setOptionParseComments| action | Boolean`*`  |  |
| spider| setOptionParseGit| action | Boolean`*`  |  |
| spider| setOptionParseRobotsTxt| action | Boolean`*`  |  |
| spider| setOptionParseSVNEntries| action | Boolean`*`  |  |
| spider| setOptionParseSitemapXml| action | Boolean`*`  |  |
| spider| setOptionPostForm| action | Boolean`*`  |  |
| spider| setOptionProcessForm| action | Boolean`*`  |  |
| spider| setOptionRequestWaitTime| action | Integer`*`  |  |
| spider| setOptionSendRefererHeader| action | Boolean`*`  |  |
| spider| setOptionShowAdvancedDialog| action | Boolean`*`  |  |
| spider| setOptionThreadCount| action | Integer`*`  |  |
| core| alert| view | id`*`  | Gets the alert with the given ID, the corresponding HTTP message can be obtained with the 'messageId' field and 'message' API method |
| core| alerts| view | baseurl start count  | Gets the alerts raised by ZAP, optionally filtering by URL and paginating with 'start' position and 'count' of alerts |
| core| numberOfAlerts| view | baseurl  | Gets the number of alerts, optionally filtering by URL |
| core| hosts| view |  | Gets the name of the hosts accessed through/by ZAP |
| core| sites| view |  | Gets the sites accessed through/by ZAP (scheme and domain) |
| core| urls| view |  | Gets the URLs accessed through/by ZAP |
| core| message| view | id`*`  | Gets the HTTP message with the given ID. Returns the ID, request/response headers and bodies, cookies and note. |
| core| messages| view | baseurl start count  | Gets the HTTP messages sent by ZAP, request and response, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| core| numberOfMessages| view | baseurl  | Gets the number of messages, optionally filtering by URL |
| core| version| view |  | Gets ZAP version |
| core| excludedFromProxy| view |  | Gets the regular expressions, applied to URLs, to exclude from the Proxy |
| core| homeDirectory| view |  |  |
| core| stats| view | keyPrefix  |  |
| core| optionDefaultUserAgent| view |  |  |
| core| optionHttpState| view |  |  |
| core| optionProxyChainName| view |  |  |
| core| optionProxyChainPassword| view |  |  |
| core| optionProxyChainPort| view |  |  |
| core| optionProxyChainRealm| view |  |  |
| core| optionProxyChainSkipName| view |  |  |
| core| optionProxyChainUserName| view |  |  |
| core| optionProxyExcludedDomains| view |  |  |
| core| optionProxyExcludedDomainsEnabled| view |  |  |
| core| optionTimeoutInSecs| view |  |  |
| core| optionHttpStateEnabled| view |  |  |
| core| optionProxyChainPrompt| view |  |  |
| core| optionSingleCookieRequestHeader| view |  |  |
| core| optionUseProxyChain| view |  |  |
| core| optionUseProxyChainAuth| view |  |  |
| core| shutdown| action |  | Shuts down ZAP |
| core| newSession| action | name overwrite  | Creates a new session, optionally overwriting existing files. If a relative path is specified it will be resolved against the "session" directory in ZAP "home" dir. |
| core| loadSession| action | name`*`  | Loads the session with the given name. If a relative path is specified it will be resolved against the "session" directory in ZAP "home" dir. |
| core| saveSession| action | name`*` overwrite  | Saves the session with the name supplied, optionally overwriting existing files. If a relative path is specified it will be resolved against the "session" directory in ZAP "home" dir. |
| core| snapshotSession| action |  |  |
| core| clearExcludedFromProxy| action |  |  |
| core| excludeFromProxy| action | regex`*`  |  |
| core| setHomeDirectory| action | dir`*`  |  |
| core| generateRootCA| action |  |  |
| core| sendRequest| action | request`*` followRedirects  | Sends the HTTP request, optionally following redirections. Returns the request sent and response received and followed redirections, if any. |
| core| deleteAllAlerts| action |  |  |
| core| runGarbageCollection| action |  |  |
| core| clearStats| action | keyPrefix`*`  |  |
| core| setOptionDefaultUserAgent| action | String`*`  |  |
| core| setOptionProxyChainName| action | String`*`  |  |
| core| setOptionProxyChainPassword| action | String`*`  |  |
| core| setOptionProxyChainRealm| action | String`*`  |  |
| core| setOptionProxyChainSkipName| action | String`*`  |  |
| core| setOptionProxyChainUserName| action | String`*`  |  |
| core| setOptionHttpStateEnabled| action | Boolean`*`  |  |
| core| setOptionProxyChainPort| action | Integer`*`  |  |
| core| setOptionProxyChainPrompt| action | Boolean`*`  |  |
| core| setOptionSingleCookieRequestHeader| action | Boolean`*`  |  |
| core| setOptionTimeoutInSecs| action | Integer`*`  |  |
| core| setOptionUseProxyChain| action | Boolean`*`  |  |
| core| setOptionUseProxyChainAuth| action | Boolean`*`  |  |
| core| proxy.pac| other |  |  |
| core| rootcert| other |  |  |
| core| setproxy| other | proxy`*`  |  |
| core| xmlreport| other |  | Generates a report in XML format |
| core| htmlreport| other |  | Generates a report in HTML format |
| core| messageHar| other | id`*`  | Gets the message with the given ID in HAR format |
| core| messagesHar| other | baseurl start count  | Gets the HTTP messages sent through/by ZAP, in HAR format, optionally filtered by URL and paginated with 'start' position and 'count' of messages |
| core| sendHarRequest| other | request`*` followRedirects  | Sends the first HAR request entry, optionally following redirections. Returns, in HAR format, the request sent and response received and followed redirections, if any. |
| params| params| view | site  | Shows the parameters for the specified site, or for all sites if the site is not specified |
| ascan| status| view | scanId  |  |
| ascan| scanProgress| view | scanId  |  |
| ascan| messagesIds| view | scanId`*`  |  |
| ascan| alertsIds| view | scanId`*`  |  |
| ascan| scans| view |  |  |
| ascan| scanPolicyNames| view |  |  |
| ascan| excludedFromScan| view |  |  |
| ascan| scanners| view | scanPolicyName policyId  |  |
| ascan| policies| view | scanPolicyName policyId  |  |
| ascan| attackModeQueue| view |  |  |
| ascan| optionAttackPolicy| view |  |  |
| ascan| optionDefaultPolicy| view |  |  |
| ascan| optionDelayInMs| view |  |  |
| ascan| optionExcludedParamList| view |  |  |
| ascan| optionHandleAntiCSRFTokens| view |  |  |
| ascan| optionHostPerScan| view |  |  |
| ascan| optionMaxChartTimeInMins| view |  |  |
| ascan| optionMaxResultsToList| view |  |  |
| ascan| optionMaxScansInUI| view |  |  |
| ascan| optionTargetParamsEnabledRPC| view |  |  |
| ascan| optionTargetParamsInjectable| view |  |  |
| ascan| optionThreadPerHost| view |  |  |
| ascan| optionAllowAttackOnStart| view |  |  |
| ascan| optionInjectPluginIdInHeader| view |  |  |
| ascan| optionPromptInAttackMode| view |  |  |
| ascan| optionPromptToClearFinishedScans| view |  |  |
| ascan| optionRescanInAttackMode| view |  |  |
| ascan| optionShowAdvancedDialog| view |  |  |
| ascan| scan| action | url`*` recurse inScopeOnly scanPolicyName method postData  |  |
| ascan| scanAsUser| action | url`*` contextId`*` userId`*` recurse scanPolicyName method postData  | Active Scans from the perspective of a User, obtained using the given Context ID and User ID. See 'scan' action for more details. |
| ascan| pause| action | scanId`*`  |  |
| ascan| resume| action | scanId`*`  |  |
| ascan| stop| action | scanId`*`  |  |
| ascan| removeScan| action | scanId`*`  |  |
| ascan| pauseAllScans| action |  |  |
| ascan| resumeAllScans| action |  |  |
| ascan| stopAllScans| action |  |  |
| ascan| removeAllScans| action |  |  |
| ascan| clearExcludedFromScan| action |  |  |
| ascan| excludeFromScan| action | regex`*`  |  |
| ascan| enableAllScanners| action | scanPolicyName  |  |
| ascan| disableAllScanners| action | scanPolicyName  |  |
| ascan| enableScanners| action | ids`*`  |  |
| ascan| disableScanners| action | ids`*`  |  |
| ascan| setEnabledPolicies| action | ids`*`  |  |
| ascan| setPolicyAttackStrength| action | id`*` attackStrength`*` scanPolicyName  |  |
| ascan| setPolicyAlertThreshold| action | id`*` alertThreshold`*` scanPolicyName  |  |
| ascan| setScannerAttackStrength| action | id`*` attackStrength`*` scanPolicyName  |  |
| ascan| setScannerAlertThreshold| action | id`*` alertThreshold`*` scanPolicyName  |  |
| ascan| addScanPolicy| action | scanPolicyName`*`  |  |
| ascan| removeScanPolicy| action | scanPolicyName`*`  |  |
| ascan| setOptionAttackPolicy| action | String`*`  |  |
| ascan| setOptionDefaultPolicy| action | String`*`  |  |
| ascan| setOptionAllowAttackOnStart| action | Boolean`*`  |  |
| ascan| setOptionDelayInMs| action | Integer`*`  |  |
| ascan| setOptionHandleAntiCSRFTokens| action | Boolean`*`  |  |
| ascan| setOptionHostPerScan| action | Integer`*`  |  |
| ascan| setOptionInjectPluginIdInHeader| action | Boolean`*`  |  |
| ascan| setOptionMaxChartTimeInMins| action | Integer`*`  |  |
| ascan| setOptionMaxResultsToList| action | Integer`*`  |  |
| ascan| setOptionMaxScansInUI| action | Integer`*`  |  |
| ascan| setOptionPromptInAttackMode| action | Boolean`*`  |  |
| ascan| setOptionPromptToClearFinishedScans| action | Boolean`*`  |  |
| ascan| setOptionRescanInAttackMode| action | Boolean`*`  |  |
| ascan| setOptionShowAdvancedDialog| action | Boolean`*`  |  |
| ascan| setOptionTargetParamsEnabledRPC| action | Integer`*`  |  |
| ascan| setOptionTargetParamsInjectable| action | Integer`*`  |  |
| ascan| setOptionThreadPerHost| action | Integer`*`  |  |
| context| contextList| view |  | List context names of current session |
| context| excludeRegexs| view | contextName`*`  | List excluded regexs for context |
| context| includeRegexs| view | contextName`*`  | List included regexs for context |
| context| context| view | contextName`*`  | List the information about the named context |
| context| technologyList| view |  | Lists the names of all built in technologies |
| context| includedTechnologyList| view | contextName`*`  | Lists the names of all technologies included in a context |
| context| excludedTechnologyList| view | contextName`*`  | Lists the names of all technologies excluded from a context |
| context| excludeFromContext| action | contextName`*` regex`*`  | Add exclude regex to context |
| context| includeInContext| action | contextName`*` regex`*`  | Add include regex to context |
| context| newContext| action | contextName`*`  | Creates a new context with the given name in the current session |
| context| removeContext| action | contextName`*`  | Removes a context in the current session |
| context| exportContext| action | contextName`*` contextFile`*`  | Exports the context with the given name to a file. If a relative file path is specified it will be resolved against the "contexts" directory in ZAP "home" dir. |
| context| importContext| action | contextFile`*`  | Imports a context from a file. If a relative file path is specified it will be resolved against the "contexts" directory in ZAP "home" dir. |
| context| includeContextTechnologies| action | contextName`*` technologyNames`*`  | Includes technologies with the given names, separated by a comma, to a context |
| context| includeAllContextTechnologies| action | contextName`*`  | Includes all built in technologies in to a context |
| context| excludeContextTechnologies| action | contextName`*` technologyNames`*`  | Excludes technologies with the given names, separated by a comma, from a context |
| context| excludeAllContextTechnologies| action | contextName`*`  | Excludes all built in technologies from a context |
| context| setContextInScope| action | contextName`*` booleanInScope`*`  | Sets a context to in scope (contexts are in scope by default) |
| httpSessions| sessions| view | site`*` session  | Gets the sessions of the given site. Optionally returning just the session with the given name. |
| httpSessions| activeSession| view | site`*`  | Gets the name of the active session for the given site. |
| httpSessions| sessionTokens| view | site`*`  | Gets the names of the session tokens for the given site. |
| httpSessions| createEmptySession| action | site`*` session  | Creates an empty session for the given site. Optionally with the given name. |
| httpSessions| removeSession| action | site`*` session`*`  | Removes the session from the given site. |
| httpSessions| setActiveSession| action | site`*` session`*`  | Sets the given session as active for the given site. |
| httpSessions| unsetActiveSession| action | site`*`  | Unsets the active session of the given site. |
| httpSessions| addSessionToken| action | site`*` sessionToken`*`  | Adds the session token to the given site. |
| httpSessions| removeSessionToken| action | site`*` sessionToken`*`  | Removes the session token from the given site. |
| httpSessions| setSessionTokenValue| action | site`*` session`*` sessionToken`*` tokenValue`*`  | Sets the value of the session token of the given session for the given site. |
| httpSessions| renameSession| action | site`*` oldSessionName`*` newSessionName`*`  | Renames the session of the given site. |
| break| break| action | type`*` scope`*` state`*`  |  |
| break| addHttpBreakpoint| action | string`*` location`*` match`*` inverse`*` ignorecase`*`  |  |
| break| removeHttpBreakpoint| action | string`*` location`*` match`*` inverse`*` ignorecase`*`  |  |
| authentication| getSupportedAuthenticationMethods| view |  |  |
| authentication| getAuthenticationMethodConfigParams| view | authMethodName`*`  |  |
| authentication| getAuthenticationMethod| view | contextId`*`  |  |
| authentication| getLoggedInIndicator| view | contextId`*`  |  |
| authentication| getLoggedOutIndicator| view | contextId`*`  |  |
| authentication| setAuthenticationMethod| action | contextId`*` authMethodName`*` authMethodConfigParams  |  |
| authentication| setLoggedInIndicator| action | contextId`*` loggedInIndicatorRegex`*`  |  |
| authentication| setLoggedOutIndicator| action | contextId`*` loggedOutIndicatorRegex`*`  |  |
| sessionManagement| getSupportedSessionManagementMethods| view |  |  |
| sessionManagement| getSessionManagementMethodConfigParams| view | methodName`*`  |  |
| sessionManagement| getSessionManagementMethod| view | contextId`*`  |  |
| sessionManagement| setSessionManagementMethod| action | contextId`*` methodName`*` methodConfigParams  |  |
| users| usersList| view | contextId  |  |
| users| getUserById| view | contextId userId  |  |
| users| getAuthenticationCredentialsConfigParams| view | contextId`*`  |  |
| users| getAuthenticationCredentials| view | contextId`*` userId`*`  |  |
| users| newUser| action | contextId`*` name`*`  |  |
| users| removeUser| action | contextId`*` userId`*`  |  |
| users| setUserEnabled| action | contextId`*` userId`*` enabled`*`  |  |
| users| setUserName| action | contextId`*` userId`*` name`*`  |  |
| users| setAuthenticationCredentials| action | contextId`*` userId`*` authCredentialsConfigParams  |  |
| forcedUser| isForcedUserModeEnabled| view |  | Returns 'true' if 'forced user' mode is enabled, 'false' otherwise |
| forcedUser| getForcedUser| view | contextId`*`  | Gets the user (ID) set as 'forced user' for the given context (ID) |
| forcedUser| setForcedUser| action | contextId`*` userId`*`  | Sets the user (ID) that should be used in 'forced user' mode for the given context (ID) |
| forcedUser| setForcedUserModeEnabled| action | boolean`*`  | Sets if 'forced user' mode should be enabled or not |
| script| listEngines| view |  | Lists the script engines available |
| script| listScripts| view |  | Lists the scripts available, with its engine, name, description, type and error state. |
| script| enable| action | scriptName`*`  | Enables the script with the given name |
| script| disable| action | scriptName`*`  | Disables the script with the given name |
| script| load| action | scriptName`*` scriptType`*` scriptEngine`*` fileName`*` scriptDescription  | Loads a script into ZAP from the given local file, with the given name, type and engine, optionally with a description |
| script| remove| action | scriptName`*`  | Removes the script with the given name |
| script| runStandAloneScript| action | scriptName`*`  | Runs the stand alone script with the give name |

Starred parameters are mandatory.

This component is optional and therefore the API will only work if it is installed.

Back to [index](ApiGen_Index)

