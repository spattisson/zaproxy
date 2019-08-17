# ZAP 2.8.0 API
## Component: pscan
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| scanOnlyInScope| view |  | Tells whether or not the passive scan should be performed only on messages that are in scope. |
| recordsToScan| view |  | The number of records the passive scanner still has to scan |
| scanners| view |  | Lists all passive scanners with its ID, name, enabled state and alert threshold. |
| currentRule| view |  | Show information about the passive scan rule currently being run (if any). |
| maxAlertsPerRule| view |  | Gets the maximum number of alerts a passive scan rule should raise. |
| setEnabled| action | enabled*  | Sets whether or not the passive scanning is enabled (Note: the enabled state is not persisted). |
| setScanOnlyInScope| action | onlyInScope*  | Sets whether or not the passive scan should be performed only on messages that are in scope. |
| enableAllScanners| action |  | Enables all passive scanners |
| disableAllScanners| action |  | Disables all passive scanners |
| enableScanners| action | ids*  | Enables all passive scanners with the given IDs (comma separated list of IDs) |
| disableScanners| action | ids*  | Disables all passive scanners with the given IDs (comma separated list of IDs) |
| setScannerAlertThreshold| action | id* alertThreshold*  | Sets the alert threshold of the passive scanner with the given ID, accepted values for alert threshold: OFF, DEFAULT, LOW, MEDIUM and HIGH |
| setMaxAlertsPerRule| action | maxAlerts*  | Sets the maximum number of alerts a passive scan rule should raise. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

