# ZAP 2.8.0 API
## Component: search
| _Name_ | _Type_ | _Parameters_ | _Description_ |
|:-------|:-------|:-------------|:--------------|
| urlsByUrlRegex| view | regex* baseurl start count  | Returns the URLs of the HTTP messages that match the given regular expression in the URL optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| urlsByRequestRegex| view | regex* baseurl start count  | Returns the URLs of the HTTP messages that match the given regular expression in the request optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| urlsByResponseRegex| view | regex* baseurl start count  | Returns the URLs of the HTTP messages that match the given regular expression in the response optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| urlsByHeaderRegex| view | regex* baseurl start count  | Returns the URLs of the HTTP messages that match the given regular expression in the header(s) optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| messagesByUrlRegex| view | regex* baseurl start count  | Returns the HTTP messages that match the given regular expression in the URL optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| messagesByRequestRegex| view | regex* baseurl start count  | Returns the HTTP messages that match the given regular expression in the request optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| messagesByResponseRegex| view | regex* baseurl start count  | Returns the HTTP messages that match the given regular expression in the response optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| messagesByHeaderRegex| view | regex* baseurl start count  | Returns the HTTP messages that match the given regular expression in the header(s) optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| harByUrlRegex| other | regex* baseurl start count  | Returns the HTTP messages, in HAR format, that match the given regular expression in the URL optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| harByRequestRegex| other | regex* baseurl start count  | Returns the HTTP messages, in HAR format, that match the given regular expression in the request optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| harByResponseRegex| other | regex* baseurl start count  | Returns the HTTP messages, in HAR format, that match the given regular expression in the response optionally filtered by URL and paginated with 'start' position and 'count' of messages. |
| harByHeaderRegex| other | regex* baseurl start count  | Returns the HTTP messages, in HAR format, that match the given regular expression in the header(s) optionally filtered by URL and paginated with 'start' position and 'count' of messages. |

Starred parameters are mandatory

Back to [index](ApiGen_Index)

