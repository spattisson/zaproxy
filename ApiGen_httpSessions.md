# ZAP 2.6.0 API
## Component: httpSessions
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| activeSession| view | site*  | Gets the name of the active session for the given site. |
| sessionTokens| view | site*  | Gets the names of the session tokens for the given site. |
| sessions| view | site* session  | Gets the sessions for the given site. Optionally returning just the session with the given name. |
| sites| view |  | Gets all of the sites that have sessions. |
| activeSession| other | site*  |  |
| sessionTokens| other | site*  |  |
| sessions| other | site* session  |  |
| sites| other |  |  |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

