@Func2 @Info1
Feature: validation of facebook details
@Reg
Scenario: login validation invalid
Given user is on facebook
When user enter credential
And user click the login
Then user verify the success message

@Reg @E2E
Scenario: login validation invalid
Given user is on facebook
When user enter credential
And user click the login
Then user verify the success message
