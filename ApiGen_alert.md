# ZAP 2.8.0 API
## Component: alert
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| alert| view | id*  | Gets the alert with the given ID, the corresponding HTTP message can be obtained with the 'messageId' field and 'message' API method |
| alerts| view | baseurl start count riskId  | Gets the alerts raised by ZAP, optionally filtering by URL or riskId, and paginating with 'start' position and 'count' of alerts |
| alertsSummary| view | baseurl  | Gets number of alerts grouped by each risk level, optionally filtering by URL |
| numberOfAlerts| view | baseurl riskId  | Gets the number of alerts, optionally filtering by URL or riskId |
| alertsByRisk| view | url recurse  | Gets a summary of the alerts, optionally filtered by a 'url'. If 'recurse' is true then all alerts that apply to urls that start with the specified 'url' will be returned, otherwise only those on exactly the same 'url' (ignoring url parameters) |
| alertCountsByRisk| view | url recurse  | Gets a count of the alerts, optionally filtered as per alertsPerRisk |
| deleteAllAlerts| action |  | Deletes all alerts of the current session. |
| deleteAlert| action | id*  | Deletes the alert with the given ID.  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

