@Sales
  Feature: Sales flow
  description Class

  Scenario: Normal login
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on landing page
    #And User sort product list by "Price (high to low)"
    And User sort product list by "Name (Z to A)"
    And User choice two product from the list product from the list
    And User click cart
    And  User click remove