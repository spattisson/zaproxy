# ZAP 2.8.0 API
## Component: localProxies
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| additionalProxies| view |  | Gets all of the additional proxies that have been configured. |
| addAdditionalProxy| action | address* port* behindNat alwaysDecodeZip removeUnsupportedEncodings  | Adds an new proxy using the details supplied. |
| removeAdditionalProxy| action | address* port*  | Removes the additional proxy with the specified address and port. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

