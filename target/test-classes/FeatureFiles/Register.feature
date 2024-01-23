
Feature:  Create An Account functionality

  Scenario Outline: Create An Account with Negative scenario
    Given User opens the Applications
    When User enter <condition> in field
    Then User should get a warning message about credential mismatch <condition>
    Examples:
      |    condition	 |
      |      TC001       |
    #abc test
  Scenario Outline: Create An Account with Negative scenario
    Given User opens the Applications
    When User enter <condition> in field
    Then User should get a warning message about credential mismatch <condition>
    Examples:
      |    condition	 |
      |      TC001       |


