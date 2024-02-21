@payments @All
Feature: Payments

  @tax
  Scenario Outline: Validate Tax Details  <condition>
    Given User is on Payments Screen
    When User adds "<condition>" Tax details
    Then User gets errorMsg for "<condition>" Tax Details
    Examples:
      |       condition      |
    # |    ValidTaxDetails   |
      |    EmptyTaxName      |
      |    EmptyTaxAmount    |
      |    EmptyAllFields    |

  @discount
  Scenario Outline: Validate Discount Details  <condition>
    Given User is on Payments Screen
    When User adds "<condition>" Discount details
    Then User gets errorMsg for "<condition>" Discount Details
    Examples:
      |       condition          |
    # |    ValidDiscountDetails  |
      |    EmptyDiscountName     |
      |    EmptyDiscountAmount   |
      |    EmptyAllFields        |

  @serviceCharge
  Scenario Outline: Validate Service Charge Details  <condition>
    Given User is on Payments Screen
    When User adds "<condition>" Service Charge details
    Then User gets errorMsg for "<condition>" Service Charge Details
    Examples:
      |          condition            |
    # |    ValidServiceChargeDetails  |
      |    EmptyServiceChargeName     |
      |    EmptyServiceChargeAmount   |
      |    EmptyAllFields             |