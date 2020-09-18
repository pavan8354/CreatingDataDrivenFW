Feature: Free CRM Create Contacts

Scenario: New Default Login

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
#Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser

