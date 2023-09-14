
Feature: Articles page

  Scenario: User should be able to navigate to an article
    Given user has navigated to the home page
    When user clicks on an article
    Then user should be able to view the article

  Scenario: User should be prompted to log in to favourite an article
    Given user is not logged in
    And user clicks on an article
    When user clicks on favourite button on article
    Then user should be prompted to log in