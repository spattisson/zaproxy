# ZAP 2.6.0 API
## Component: autoupdate
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| latestVersionNumber| view |  | Returns the latest version number |
| isLatestVersion| view |  | Returns 'true' if ZAP is on the latest version |
| installedAddons| view |  | Return a list of all of the installed add-ons |
| newAddons| view |  | Return a list of any add-ons that have been added to the Marketplace since the last check for updates |
| updatedAddons| view |  | Return a list of any add-ons that have been changed in the Marketplace since the last check for updates |
| marketplaceAddons| view |  | Return a list of all of the add-ons on the ZAP Marketplace (this information is read once and then cached) |
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
| installAddon| action | id*  | Installs or updates the specified add-on, returning when complete (ie not asynchronously) |
| uninstallAddon| action | id*  | Uninstalls the specified add-on  |
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

