# API Client Generation

The ZAP API clients are created via code generation - this makes them much easier to maintain.

The current generators are:
  * [WikiAPIGenerator.java](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/extension/api/WikiAPIGenerator.java) Which generates the wiki at: ApiGen\_Index
  * [JavaAPIGenerator.java](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/extension/api/JavaAPIGenerator.java) Java client
  * [PythonAPIGenerator.java](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/extension/api/PythonAPIGenerator.java) Python client
  * [NodeJSAPIGenerator.java](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/extension/api/NodeJSAPIGenerator.java) NodeJS client

Adding new generators is not _too_ hard - the main task is creating a working template for one of the API calls and then ripping off one of the existing generators.

Please get in touch via the [dev group](https://groups.google.com/group/zaproxy-develop) if you'd like to work on a new one.