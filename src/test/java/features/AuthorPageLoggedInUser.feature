Feature: Functionality of Author Page when user is logged in

  Scenario: User should be able to follow an author
    Given user is logged in
    And user has navigated to Global feed page
    When user clicks on an author name on article
    And user clicks follow author
    Then user should be able to view the author as followed