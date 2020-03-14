@Func1
Feature: validation of facebook details
@Smoke
Scenario: payment with net banking
Given user is on netbanking page
When user enter details

@Sanity @Reg
Scenario: payment with debit card
Given user is on debit card page
When user enter details


@Retest
Scenario: payment with credit card
Given user is on credit card page
When user enter details

Scenario: payment with debit card using VISA
Given user is on debit card VISA page
When user enter details

Scenario: payment with debit card using MASTER
Given user is on debit card MASTER page
When user enter details