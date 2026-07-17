Feature: Checking loging Practice test Automation

Scenario:
Given User should open Chrome Browser
When User should Enter URL in browser
Then Type username student into Username in Edit field
Then Type password Password123 into Password Text field
Then User should click on Push Submit button
Then User should Verify new page URL contains https://practicetestautomation.com/logged-in-successfully/
Then should Verify new page contains expected text ('Congratulations student. You successfully logged in!' or 'Logged In Successfully')
Then User should Verify button Log out is displayed on the new page