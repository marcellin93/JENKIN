Feature: verifying adactin hotel details

  Scenario: verify login detail with valid credential
    Given user is on hotel page
    When user enter details
      | userName      | passWord      | location | hotel       | roomType | noOfRoom | checkInDate | checkoutDate | adultPerRoom | childrenPerRoom | firstName | lastName | address     | cardNo           | cardType    | expireYear | expiremonth | ccvNo |
      | marcellin1993 | marcellin1993 | Paris    | Hotel Creek | Double   | 1-Two    | 27/05/2020  | 28/02/2020   | 2-Two        | 2-Two           | marcellin | franklin | pondicherry | 1234123412341234 | Master Card |       2022 | February    |  123 |
    Then user should verify the messages
