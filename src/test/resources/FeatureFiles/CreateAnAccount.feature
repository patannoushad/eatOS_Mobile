Feature: Create An Account Functionality


  Scenario Outline: Create An Account With Negative Scenario
    Given User opens the Applications
    And Tap on Create an Account
    When User enter <condition> in Create An Account screen
    Then User should get a warning message <condition>
    Examples:
      | condition    |
      | emptyFirstName|
      | emptyLastName |