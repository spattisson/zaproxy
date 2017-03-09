# Setting up ZAP to Test Damn Vulnerable Web App (DVWA)

Following the steps used to spider/scan DVWA v1.9 at `http://localhost/DVWA` using ZAP 2.4.3:

1) Create a new authentication JavaScript/ECMAScript script [1] and replace/set the script contents with the following:

``` JavaScript
function authenticate(helper, paramsValues, credentials) {
    var loginUrl = paramsValues.get("Login URL");
    var csrfTokenName = paramsValues.get("CSRF Field");
    var csrfTokenValue = extractInputFieldValue(getPageContent(helper, loginUrl), csrfTokenName);
    var postData = paramsValues.get("POST Data");

    postData = postData.replace('{%username%}', encodeURIComponent(credentials.getParam("Username")));
    postData = postData.replace('{%password%}', encodeURIComponent(credentials.getParam("Password")));
    postData = postData.replace('{%' + csrfTokenName + '%}', encodeURIComponent(csrfTokenValue));

    var msg = sendAndReceive(helper, loginUrl, postData);
    return msg;
}

function getRequiredParamsNames() {
    return [ "Login URL", "CSRF Field", "POST Data" ];
}

function getOptionalParamsNames() {
    return [];
}

function getCredentialsParamsNames() {
    return [ "Username", "Password" ];
}

function getPageContent(helper, url) {
    var msg = sendAndReceive(helper, url);
    return msg.getResponseBody().toString();
}

function sendAndReceive(helper, url, postData) {
    var msg = helper.prepareMessage();

    var method = "GET";
    if (postData) {
        method = "POST";
        msg.setRequestBody(postData);
    }

    var requestUri = new org.apache.commons.httpclient.URI(url, true);
    var requestHeader = new org.parosproxy.paros.network.HttpRequestHeader(method, requestUri, "HTTP/1.0");
    msg.setRequestHeader(requestHeader);

    helper.sendAndReceive(msg);

    return msg;
}

function extractInputFieldValue(page, fieldName) {
    // Rhino:
    var src = new net.htmlparser.jericho.Source(page);
    // Nashorn:
    // var Source = Java.type("net.htmlparser.jericho.Source");
    // var src = new Source(page);

    var it = src.getAllElements('input').iterator();

    while (it.hasNext()) {
        var element = it.next();
        if (element.getAttributeValue('name') == fieldName) {
            return element.getAttributeValue('value');
        }
    }
    return '';
}
```

2) Create "DVWA" context (or edit the "Default Context"):
2a) Context Name: `DVWAv1.9`
2b) In "Include in Context" panel add:
`\Qhttp://localhost/DVWA\E.*`
2c) In "Exclude form Context" panel add:
`\Qhttp://localhost/DVWA/login.php\E`
`\Qhttp://localhost/DVWA/logout.php\E`
`\Qhttp://localhost/DVWA/setup.php\E`
2d) In "Authentication" panel, choose "Script-Based Authentication" [3], select the "DVWA" authentication script, load it and fill the fields:
Login URL:
`http://localhost/DVWA/login.php`
CSRF Field:
`user_token`
POST Data:
`username={%username%}&password={%password%}&Login=Login&user_token={%user_token%}`
Logged in:
`\Q<a href="logout.php">Logout</a>\E`
Logged Out:
`(?:Location: [./]*login\.php)|(?:\Q<form action="login.php" method="post">\E)`
2e) In "Users" panel, add the user:
User Name:
`Administrator`
Username:
`admin`
Password:
`password`
2f) Close the dialogue.

3) Verify authentication is working, create seed for the spider and configure DVWA:
3a) Enable "Force User Mode" [4] and access the main page (e.g. "http://localhost/DVWA") while proxying through ZAP, cookies should be disabled in the browser; It should show the main page thus the authentication is working and the spider has a seed;
3b) Access "http://localhost/DVWA/security.php" and change the "Security Level" to "low";
3c) Disable the "Forced User Mode" (no longer needed).
3d) Exclude from the context the following URLs, to prevent the spider from changing the "Security Level" and the password:
`\Qhttp://localhost/DVWA/security.php\E`
`\Qhttp://localhost/DVWA/vulnerabilities/csrf\E.*`

With the context and authentication set up, it's possible to spider/scan as user.
4) Spider:
4a) Select "Spider" tab and click the button "New Scan";
4b) Click "Select...", choose the context (e.g. "DVWAv1.9") and click OK;
4c) Select the user "Administrator" and click "Start Scan";
4d) Spider should start and spider as user "Administrator".
Spider can be run a second time to ensure that all URLs are found.

5) Active Scan:
5a) Select "Active Scan" tab and click the button "New Scan";
5b) Click "Select...", choose the context (e.g. "DVWAv1.9") and click OK;
5c) Select the user "Administrator" and click "Start Scan";
5d) Active scanner should start and scan as user "Administrator".

Active scanner should find some issues:
- Cross Site Scripting (Persistent) (4)
- Cross Site Scripting (Reflected) (6)
- Path Traversal
- Remote OS Command Injection
- SQL Injection - MySQL
- SQL Injection (2)
- Directory Browsing (7)

[1] https://github.com/zaproxy/zap-core-help/wiki/HelpAddonsScriptsTree
[2] https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsSessionContexts
[3] https://github.com/zaproxy/zap-core-help/wiki/HelpUiDialogsSessionContext-auth#script-based-authentication
[4] https://github.com/zaproxy/zap-core-help/wiki/HelpUiTltoolbar#--force-user-mode-on--off

