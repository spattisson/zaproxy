# ZAP 2.6.0 API
## Component: break
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| isBreakAll| view |  | Returns True if ZAP will break on both requests and responses |
| isBreakRequest| view |  | Returns True if ZAP will break on requests |
| isBreakResponse| view |  | Returns True if ZAP will break on responses |
| httpMessage| view |  | Returns the HTTP message currently intercepted (if any) |
| break| action | type* state* scope  | Controls the global break functionality. The type may be one of: http-all, http-request or http-response. The state may be true (for turning break on for the specified type) or false (for turning break off). Scope is not currently used. |
| setHttpMessage| action | httpHeader* httpBody  | Overwrites the currently intercepted message with the data provided |
| continue| action |  | Submits the currently intercepted message and unsets the global request/response break points |
| step| action |  | Submits the currently intercepted message, the next request or response will automatically be intercepted |
| drop| action |  | Drops the currently intercepted message |
| addHttpBreakpoint| action | string* location* match* inverse* ignorecase*  | Adds a custom HTTP breakpont. The string is the string to match. Location may be one of: url, request_header, request_body, response_header or response_body. Match may be: contains or regex. Inverse (match) may be true or false. Lastly, ignorecase (when matching the string) may be true or false.   |
| removeHttpBreakpoint| action | string* location* match* inverse* ignorecase*  | Removes the specified break point |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

