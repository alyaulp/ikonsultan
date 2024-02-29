@Login
Feature: Login
  As a user I want to login website sauce demo

  @Login
  Scenario: Normal login
    Given User open the website cura healthcare service
    When User copy username and password to column and click login button
    Then User already on landing page