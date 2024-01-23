@login
Feature: Login scenarios

  @positive
  Scenario Outline: Validate Login Functionality with Valid PIN
    When User enter username as "<username>"
    And User enter password as "<password>"
    And User Tap on Login Button
    And User enter valid Pin
    Then User should get successfully loggedin
    Examples:
      | username         | password      |
      | np3@eigital.com  | @Password123  |

  @negative
  Scenario Outline: Login with invalid user name and password
    When User enter username as "<username>"
    And User enter password as "<password>"
    And User Tap on Login Button
    Then login should fail with an error "<errMsg>"
    Examples:
      | username       | password     |                 errMsg             |
      | InvalidUser    | InvalidPswd  | Email and Password cannot be empty.|


  @negative
  Scenario Outline: Login with Invalid PIN
    When User enter username as "<username>"
    And User enter password as "<password>"
    And User Tap on Login Button
    Then User enter Pin Invalid PIN "<P1>""<P2>""<P3>""<P4>"
    Then login should fail with an error "<errMsg>"
    Examples:
      | username       | password     |  P1 |  P2 |  P3 |  P4 |        errMsg        |
      | InvalidUser    | InvalidPswd  |  1  |   1  | 1  |   1 |   Invalid Password   |