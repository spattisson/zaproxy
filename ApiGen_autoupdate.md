# ZAP 2.5.0 API
## Component: autoupdate
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| latestVersionNumber| view |  | Returns the latest version number |
| isLatestVersion| view |  | Returns 'true' if ZAP is on the latest version |
| optionAddonDirectories| view |  |  |
| optionDayLastChecked| view |  |  |
| optionDayLastInstallWarned| view |  |  |
| optionDayLastUpdateWarned| view |  |  |
| optionDownloadDirectory| view |  |  |
| optionCheckAddonUpdates| view |  |  |
| optionCheckOnStart| view |  |  |
| optionDownloadNewRelease| view |  |  |
| optionInstallAddonUpdates| view |  |  |
| optionInstallScannerRules| view |  |  |
| optionReportAlphaAddons| view |  |  |
| optionReportBetaAddons| view |  |  |
| optionReportReleaseAddons| view |  |  |
| downloadLatestRelease| action |  | Downloads the latest release, if any  |
| setOptionCheckAddonUpdates| action | Boolean*  |  |
| setOptionCheckOnStart| action | Boolean*  |  |
| setOptionDownloadNewRelease| action | Boolean*  |  |
| setOptionInstallAddonUpdates| action | Boolean*  |  |
| setOptionInstallScannerRules| action | Boolean*  |  |
| setOptionReportAlphaAddons| action | Boolean*  |  |
| setOptionReportBetaAddons| action | Boolean*  |  |
| setOptionReportReleaseAddons| action | Boolean*  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

