#@smoke
Feature: Home page

  Scenario: User should be able to see home page
    Given user has navigated to the home page
    When user views the home feed
    Then user should be able to view articles on the home feed

  Scenario: User should be able to click on tags from the home page
    Given user has navigated to the home page
    When user clicks on a tag on home feed page
    Then user should see articles related to the tag

  Scenario: User should be able to navigate to different pages
    Given user has navigated to the home page
    When user clicks a different page number
    Then user should be navigated to that page number


