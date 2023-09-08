Feature: Author page

  Scenario: User should be able to follow an author
    Given user is logged in
    And user clicks on an article
    When user clicks follow author
    Then user should be able to view the author as followed

  Scenario: User should be prompted to log in to follow an author
    Given user is not logged in
    And user clicks on an article
    When user clicks follow author
    Then user should be prompted to log in

  Scenario: User should be able to navigate to authors profile
    Given user clicks on an article
    When user clicks on author name
    Then user should be navigated to the authors profile

  Scenario: User should be able to view an authors favourite articles
    Given user clicks on an article
    And user clicks on author name
    When user clicks on Favourites Articles tab
    Then user should be navigated to the authors favourite articles page