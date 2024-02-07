
Feature: Login scenarios

  Scenario Outline: Validate Login Functionality with Valid PIN
    When User enter username as "<username>"
    And User enter password as "<password>"
    And User Tap on Login Button
    And User enter valid Pin
    Then User should get successfully loggedin
    Examples:
      | username         | password      |
      | np3@eigital.com  | @Password123  |




  Scenario Outline: Validate Login Functionality
    When User enter "<condition>" Credentials
    Then User gets "<condition>" errorMsg
    Examples:
      |       condition     |
      |    InvalidUsername  |
      |    InvalidPassword  |
      |    EmptyUsername    |
      |    EmptyPassword    |

  @login
  Scenario Outline: Validate Login Functionality
    When User enter "<condition>" Credentials
    Then User gets "<condition>" errorMsg
    Examples:
      |       condition     |
      |    EmptyFields      |
      |    ValidCredentials |


