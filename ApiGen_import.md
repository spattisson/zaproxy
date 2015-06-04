# ZAP 2.0.0 API
## Component: import
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| ImportZAPLogFromFile| view   | FilePath`*`  |               |
| ImportModSecurityLogFromFile| view   | FilePath`*`  |               |
| ImportZAPHttpRequestResponsePair| view   | HTTPRequest`*` HTTPResponse`*`  |               |
| PostModSecurityAuditEvent| action | AuditEventString  |               |
| OtherPostModSecurityAuditEvent| other  | AuditEventString`*`  |               |

Starred parameters are mandatory

Back to [index](ApiGen_Index)
