# ZAP 2.6.0 API
## Component: users
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| usersList| view | contextId  |  |
| getUserById| view | contextId userId  |  |
| getAuthenticationCredentialsConfigParams| view | contextId*  |  |
| getAuthenticationCredentials| view | contextId* userId*  |  |
| newUser| action | contextId* name*  |  |
| removeUser| action | contextId* userId*  |  |
| setUserEnabled| action | contextId* userId* enabled*  |  |
| setUserName| action | contextId* userId* name*  |  |
| setAuthenticationCredentials| action | contextId* userId* authCredentialsConfigParams  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

