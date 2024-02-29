@Cart
Feature: Cart flow
  description Class

  Scenario: Success Cart
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    And User sort product list by "Price (high to low)"
    And User choice 2 product from the list
    And User click cart
    #
    Then User already on cart page
    And User click continue shopping
    Then User already on landing page
    And User choice 1 product from the list
    And User click cart
    Then User already on cart page
    And User click checkout

