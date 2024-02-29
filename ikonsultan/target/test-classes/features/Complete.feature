@Complete
Feature: Complete
  As a user I want to login website sauce demo

  Scenario: Normal checkout
    # Proses Buka Web dan Login
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    # Proses halaman product dan pilih product
    Then User already on landing page
    And User sort product list by "Name (Z to A)"
    And User choice two product from the list
    And User click cart
    And User click remove
    # Proses halaman cart
    Then User already on cart page
    #And User click continue shopping
    # Proses kembali ke halaman produk
    #Then User already on landing page
    #And User choice 1 product from the list
    #And User click cart
    #Then User already on cart page
    And User click checkout
    # Proses halaman checkout
    Then User already on checkout page
    When User input "alia" as firstName and input "ulfah" as lastName and input "04" as postalCode
    # Proses halaman overview
    Then User already on overview page
    Then Total must be match between expect and actual
    And User click finish
    Then User already on complete page

#  Scenario Outline: Invalid Checkout
#    # Proses Buka Web dan Login
#    Given User open the website sauce demo
#    When User input "standard_user" as userName and input "secret_sauce" as password
#    # Proses halaman product dan pilih product
#    Then User already on landing page
#    And User sort product list by "Price (high to low)"
#    And User choice 2 product from the list
#    And User click cart
#    # Proses halaman cart
#    Then User already on cart page
#    And User click checkout
#    # Proses halaman checkout
#    Then User already on checkout page
#    When User input "<firstName>" as firstName and input "<lastName>" as lastName and input "<postalCode>" as postalCode
#    Then User see error "<errorText>" on checkout page
#    Examples:
#      | firstName | lastName | postalCode | errorText                     |
#      | alia      |          | 04         | Error: Last Name is required  |
#      |           | ulfah    | 04         | Error: First Name is required |
#      |           |          |            | Error: First Name is required |