Feature: setting details in flipkart
Scenario: validation of the change password
Given user is on the flipkart setting page
When user click the change password
And user enter the old password,new password and confirm password and click the change password
Then user verify the success message of the password changed

