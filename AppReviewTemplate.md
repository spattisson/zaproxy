# Template for vulnerable app scanning reviews

Please copy this template into a page named like `AppReview<AppName>-<id>` eg `AppReviewBodgeIt-1`

The id should start at 1 and be incremented with every new test.

# Application: <app name>
### App Version: <app version>
### ZAP Version: <ZAP version, or trunk/date>
### Date: <date tested>
### Testers: <your names>

## Successes
Vulnerabilities ZAP correctly reported.

| **Page** | **Vulnerability** | **ZAP Rule** | **Comments** |
|:---------|:------------------|:-------------|:-------------|
| /example/xss | Reflected XSS     | Cross Site Scripting (reflected) | The References section should also include www.example.com/full-xss-explanation |

## False Negatives
Vulnerabilities ZAP missed.

| **Page** | **Vulnerability** | **Difficulty** | **Comments** |
|:---------|:------------------|:---------------|:-------------|
| /example/fn | Reflected XSS     | Easy           | Its just a `<script>alert(1);</script>` in the 'test' field |

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
Section for any relevant notes about the test.