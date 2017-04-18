# ZAP 2.6.0 API
## Component: stats
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| stats| view | keyPrefix  | Statistics |
| allSitesStats| view | keyPrefix  | Gets all of the site based statistics, optionally filtered by a key prefix |
| siteStats| view | site* keyPrefix  | Gets all of the global statistics, optionally filtered by a key prefix |
| optionStatsdHost| view |  | Gets the Statsd service hostname |
| optionStatsdPort| view |  | Gets the Statsd service port |
| optionStatsdPrefix| view |  | Gets the prefix to be applied to all stats sent to the configured Statsd service |
| optionInMemoryEnabled| view |  | Returns 'true' if in memory statistics are enabled, otherwise returns 'false' |
| optionStatsdEnabled| view |  | Returns 'true' if a Statsd server has been correctly configured, otherwise returns 'false' |
| clearStats| action | keyPrefix  | Clears all of the statistics |
| setOptionStatsdHost| action | String*  | Sets the Statsd service hostname, supply an empty string to stop using a Statsd service |
| setOptionStatsdPrefix| action | String*  | Sets the prefix to be applied to all stats sent to the configured Statsd service |
| setOptionInMemoryEnabled| action | Boolean*  | Sets whether in memory statistics are enabled |
| setOptionStatsdPort| action | Integer*  | Sets the Statsd service port |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

