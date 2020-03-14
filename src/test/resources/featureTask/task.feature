Feature: verifying makemytrip details

  Scenario Outline: verify flight booking detail with valid credential
    Given I verify makemytrip page
    When I am entering the details "<From>","<To>","<Departure>","<Return>","<Adult>","<Infant>","<Children>","<travellClass>"
    Then I should verify the messages

    Examples: 
      | From                                            | To            | Departure | Return    | Adult | Infant | Children | travellClass |
      | MAA, Madras,Chennai International Airport India | Mumbai, India | 20 Mar 20 | 22 Mar 20 |     3 |      3 |        3 | Business     |
