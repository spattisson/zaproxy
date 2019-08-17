# ZAP 2.8.0 API
## Component: users
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| usersList| view | contextId  | Gets a list of users that belong to the context with the given ID, or all users if none provided. |
| getUserById| view | contextId* userId*  | Gets the data of the user with the given ID that belongs to the context with the given ID. |
| getAuthenticationCredentialsConfigParams| view | contextId*  | Gets the configuration parameters for the credentials of the context with the given ID. |
| getAuthenticationCredentials| view | contextId* userId*  | Gets the authentication credentials of the user with given ID that belongs to the context with the given ID. |
| newUser| action | contextId* name*  | Creates a new user with the given name for the context with the given ID. |
| removeUser| action | contextId* userId*  | Removes the user with the given ID that belongs to the context with the given ID. |
| setUserEnabled| action | contextId* userId* enabled*  | Sets whether or not the user, with the given ID that belongs to the context with the given ID, should be enabled. |
| setUserName| action | contextId* userId* name*  | Renames the user with the given ID that belongs to the context with the given ID. |
| setAuthenticationCredentials| action | contextId* userId* authCredentialsConfigParams  | Sets the authentication credentials for the user with the given ID that belongs to the context with the given ID. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

