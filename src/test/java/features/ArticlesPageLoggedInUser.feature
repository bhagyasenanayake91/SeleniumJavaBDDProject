#@smoke
Feature: Logged In user functionality

  Background: User is logged in
    Given user has navigated to the log in page
    When user enters valid credentials
    Then user should get successfully logged in

  Scenario: User should be able to favourite an article from the home page
    Given user has navigated to Global feed page
    When user clicks on favourite button
    Then user should be able to view the article as favourite

  Scenario: User should be able to favourite an article on article page
    Given user clicks on an article
    When user clicks on favourite button
    Then user should be able to view the article as favourite

  Scenario: User should be able to add a comment
    Given user clicks on an article
    When user clicks add comment
    Then user should be able to view the added comment
    Then user should be able to view the added comment