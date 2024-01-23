
Feature: New Order Functionality


  @positive
  Scenario: Verify the Status of the Product
    Given User logged in with Valid Credential
    And User Enter Valid PIN
    When User Select Product and Place order
    Then Verify the Ticket Status

    @positive
    Scenario: Validate GuestDetails on New Order
      Given User logged in with Valid Credential
      And User Enter Valid PIN
      When User Added GuestDetails
      Then Validate GuestDetails in Tickets Module
