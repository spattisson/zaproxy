# ZAP 2.6.0 API
## Component: forcedUser
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| isForcedUserModeEnabled| view |  | Returns 'true' if 'forced user' mode is enabled, 'false' otherwise |
| getForcedUser| view | contextId*  | Gets the user (ID) set as 'forced user' for the given context (ID) |
| setForcedUser| action | contextId* userId*  | Sets the user (ID) that should be used in 'forced user' mode for the given context (ID) |
| setForcedUserModeEnabled| action | boolean*  | Sets if 'forced user' mode should be enabled or not |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

