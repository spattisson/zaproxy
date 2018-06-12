# Setting up ZAP to Test OWASP Pixi

**Note**: This FAQ is a work in progress as of 2018-June-11.<br>

The following the steps are based on spider/scan of Pixi at `http://localhost:8000/` using ZAP 2.7.0.<br>
**Note**: These instructions assume you've created a user: `test@example.com` with password: `testExample` (via http://localhost:8000/register).

1) Access Pixi (http://localhost:8000/) while proxying through ZAP.
2) Register a user (then logout if you're automatically logged in). Login with that user. Logout.
3) Create "pixi" context (or edit the "Default Context"): <br>
3a) "Include in Context": `http://localhost:8000.*` <br>
3b) "Exclude from Context":  `http://localhost:8000/logout` <br>
3c) "Flag as Context" > "pixi: Form-based Auth Login Request" `POST:login(pass,user)`.<br>
3d) Set "Username Parameter" as `user` and "Password Parameter" as `pass`.<br>
4) Navigate to http://localhost:8000/about (while proxying through ZAP).<br>
4a) Find `GET:about` in the Sites tree, in the response find "My Profile". While "My Profile" is highlighted right click and "Flag as Context" > "pixi : Authentication Logged-in Indicator".
5) Open the "pixi" context and goto the "Users" panel.<br>
5a) Click "Add..."<br>
5b) Create a user as follows:
    * User Name: `test`
    * Username: `test@example.com`
    * Password: `testExample`
6) Back in the Sites tree, right click "http://localhost:8000" select "Attack" then "Spider...".<br>
6a) In the Spider dialog select `test` from the "User" dropdown menu.
6b) Click "Start Scan".
7) In your browser access "My Profile" and note the URL. (It should be something like `http://localhost:8000/profile/45`.) Find the URL in the Sites tree (ex: `GET:45` in the "profile" folder) right click and exclude it from the Context (or just the Scanner). [This is done to prevent the scanner from changing the password of the user account being used to scan.]
8) Optionally run the Ajax spider (using the context and configured user).
9) 