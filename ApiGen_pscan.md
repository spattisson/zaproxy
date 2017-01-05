# ZAP 2.5.0 API
## Component: pscan
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| recordsToScan| view |  | The number of records the passive scanner still has to scan |
| scanners| view |  | Lists all passive scanners with its ID, name, enabled state and alert threshold. |
| setEnabled| action | enabled*  | Sets whether or not the passive scanning is enabled |
| enableAllScanners| action |  | Enables all passive scanners |
| disableAllScanners| action |  | Disables all passive scanners |
| enableScanners| action | ids*  | Enables all passive scanners with the given IDs (comma separated list of IDs) |
| disableScanners| action | ids*  | Disables all passive scanners with the given IDs (comma separated list of IDs) |
| setScannerAlertThreshold| action | id* alertThreshold*  | Sets the alert threshold of the passive scanner with the given ID, accepted values for alert threshold: OFF, DEFAULT, LOW, MEDIUM and HIGH |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

