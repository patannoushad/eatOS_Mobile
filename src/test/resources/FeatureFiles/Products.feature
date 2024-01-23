
Feature: Menu Management scenarios


  Scenario Outline: Validate Products on Menu Management
    Given User logged in with Valid Credential
    And User Enter Valid PIN
    When User add menu on Menu Management
    Then the product is listed with title "<title>" and price "<price>"
    Examples:
      | title                   | price |


  Scenario Outline: Validate products info on PMenu Management
    Given User logged in with Valid Credential
    When I click product title "<title>"
    Then I should be on product details page with title "<title>", price "<price>" and description "<description>"
    Examples:
      | title                   | price  | description |
