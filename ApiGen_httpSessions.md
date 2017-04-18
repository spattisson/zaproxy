# ZAP 2.6.0 API
## Component: httpSessions
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| sites| view |  | Gets all of the sites that have sessions. |
| sessions| view | site* session  | Gets the sessions for the given site. Optionally returning just the session with the given name. |
| activeSession| view | site*  | Gets the name of the active session for the given site. |
| sessionTokens| view | site*  | Gets the names of the session tokens for the given site. |
| createEmptySession| action | site* session  | Creates an empty session for the given site. Optionally with the given name. |
| removeSession| action | site* session*  | Removes the session from the given site. |
| setActiveSession| action | site* session*  | Sets the given session as active for the given site. |
| unsetActiveSession| action | site*  | Unsets the active session of the given site. |
| addSessionToken| action | site* sessionToken*  | Adds the session token to the given site. |
| removeSessionToken| action | site* sessionToken*  | Removes the session token from the given site. |
| setSessionTokenValue| action | site* session* sessionToken* tokenValue*  | Sets the value of the session token of the given session for the given site. |
| renameSession| action | site* oldSessionName* newSessionName*  | Renames the session of the given site. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

