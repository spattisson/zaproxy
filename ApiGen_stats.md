# ZAP 2.6.0 API
## Component: stats
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| allSitesStats| view | keyPrefix  | Gets all of the site based statistics, optionally filtered by a key prefix |
| optionInMemoryEnabled| view |  | Returns 'true' if in memory statistics are enabled, otherwise returns 'false' |
| optionStatsdEnabled| view |  | Returns 'true' if a Statsd server has been correctly configured, otherwise returns 'false' |
| optionStatsdHost| view |  | Gets the Statsd service hostname |
| optionStatsdPort| view |  | Gets the Statsd service port |
| optionStatsdPrefix| view |  | Gets the prefix to be applied to all stats sent to the configured Statsd service |
| siteStats| view | site* keyPrefix  | Gets all of the global statistics, optionally filtered by a key prefix |
| stats| view | keyPrefix  | Statistics |
| allSitesStats| other | keyPrefix  |  |
| optionInMemoryEnabled| other |  |  |
| optionStatsdEnabled| other |  |  |
| optionStatsdHost| other |  |  |
| optionStatsdPort| other |  |  |
| optionStatsdPrefix| other |  |  |
| siteStats| other | site* keyPrefix  |  |
| stats| other | keyPrefix  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

