# Application: Juice Shop
### App Version: 1.13.0
### ZAP Version: trunk/4.20.2015
### Date: 4.28.2015
### Testers: Paul Pollack

## Successes
Vulnerabilities ZAP correctly reported.

| **Page** | **Vulnerability** | **ZAP Rule** | **Comments** |
|:---------|:------------------|:-------------|:-------------|
| /rest/user/login | SQL Injection     | SQL Injection | Detected as long as a POST request has previously been generated on login page |
| /ftp     | Failure to Restrict Unauthorized Access | AJAX Spider  | The spider downloads a legal notice from the About page and reveals the ftp directory in the Site tree, which may then be manually navigated to to discover other more sensitive documents. |
| /api/BasketItems/&lt;item-id&gt; | Unprotected API Access | Resend Request | May resubmit a PUT request changing quantity of a basket item to a negative quantity through JSON property |
| /api/Feedbacks | Unprotected API Access? | Resend Request | May submit JSON data with modified UserId field to post feedback as another user. |

## False Negatives
Vulnerabilities ZAP missed.

| **Page** | **Vulnerability** | **Difficulty** | **Comments** |
|:---------|:------------------|:---------------|:-------------|
| Any      | Cookie Tampering  | Easy           | Changing the value of window.sessionStorage.bid allows a logged-in user to access others' baskets. |
| /rest/basket/&lt;basket-id&gt;/coupon | Weak Encryption   | Hard           | Coupons are simple Z85 encoded strings that may be forged with an appropriate library. |
| /#/administration | Failure to Restrict Unauthorized Access | Easy           | Logged in non-administrative users may view a list of all registered email addresses and delete feedback |
| /api/Challenges | Failure to Restrict Unauthorized Access | Easy           | Both logged in and anonymous users may navigate to this hidden page |
| /rest/products/search | Unprotected API Access / Persistent XSS | Medium         | A logged in user may craft a JSON representation of a product and add it to the database via PUT request. |
| /rest/api/Products/&lt;product-id&gt; | Unprotected API Access / Persistent XSS | Medium         | Any user may modify an existing product by submitting JSON data in a PUT request |
| /api/Users | Unprotected API Access / Persistent XSS | Medium         | A user may perform a persistent XSS attack by submitting values for the email and password fields as JSON data through a POST request, bypassing client-side validation. |
| /rest/user/change-password | CSRF              | Medium         | A user may submit values for the new password and repeat password fields and omit current password and successfully change a user's password. E.g. /rest/user/change-password?new=hacked&repeat=hacked will successfully change the password to hacked. |
| /api/Feedbacks | Persistent XSS    | Easy           | Rudimentary santization may be fooled with an attack string with creatively nested angle brackets i.e.: ```<<script></script>script>alert("xss")<</script>/script>``` |

The 'Difficulty' column is the testers estimate of how hard it should be for ZAP to automatically detect this vulnerability:
  * Easy: Should be detectable via minor changes
  * Medium: Ditto but with a medium amount of work required
  * Hard: Could be really tricky to detect but is theoretically possible
  * Impossible: Cant think of how to detect this without a full AI ;)

## False Positives
Vulnerabilities ZAP incorrectly reported.

| **Page** | **Vulnerability** | **ZAP Rule** | **Comments** |
|:---------|:------------------|:-------------|:-------------|
| /example/fp | Reflected XSS     | Cross Site Scripting (reflected) | The attack is correctly escaped - the field is not vulnerable |

## Notes