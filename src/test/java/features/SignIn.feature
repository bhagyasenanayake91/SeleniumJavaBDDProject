#@smoke
Feature: Sign in page functionality

  Scenario:User should be able to log in with valid credentials
    Given user has navigated to the log in page
    When user enters valid credentials
    Then user should get successfully logged in

  Scenario:User should not be able to log in with invalid credentials
    Given user has navigated to the log in page
    When user enters invalid credentials
    Then user should not be able log in