
Feature: Menu Management

  Scenario : Validate Categories Functionality
    Given User logged in with Valid Credential
    And User Enter Valid PIN
    When User Enter empty category in field
    Then User get erroMsg on Screen

  Scenario: Add a New Category with Valid Details
    Given User is on Menu management Screen
    When User adds new Category details
    Then User created Category successfully


    @menuCategory
  Scenario Outline: Add a New Category with Invalid Details
    Given User is on Menu management Screen
    When User adds <condition> Category details
    Then User gets errorMsg for <condition> Category
    Examples:
      |       condition       |
      |      ValidDetails     |
     # |    EmptyCategoryName  |
     # |   InvalidCategoryName |



