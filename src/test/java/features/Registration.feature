Feature: Registration page

  Scenario: User should be able to register as a new user
    Given user has navigated to the registration page
    When user enters the registration details
    Then user should be able to successfully register