# ZAP 2.6.0 API
## Component: acsrf
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| optionTokensNames| view |  | Lists the names of all anti-CSRF tokens |
| addOptionToken| action | String*  | Adds an anti-CSRF token with the given name, enabled by default |
| removeOptionToken| action | String*  | Removes the anti-CSRF token with the given name |
| genForm| other | hrefId*  | Generate a form for testing lack of anti-CSRF tokens - typically invoked via ZAP |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

