Feature: Articles page

  Scenario: User should be able to navigate to an article
    Given user has navigated to the home page
    When user clicks on an article
    Then user should be able to view the article

  Scenario: User should be able to favourite an article on article page
    Given user is logged in
    And user clicks on an article
    When user clicks on favourite button
    Then user should be able to view the article as favourited

  Scenario: User should be prompted to log in to favourite an article
    Given user is not logged in
    And user clicks on an article
    When user clicks on favourite button
    Then user should be prompted to log in

  Scenario: User should be able to click on tags on article
#    Given user is logged in
    Given user clicks on an article
    When user clicks on a tag on the article page
    Then user should view articles related to the tag

  Scenario: User should be able to add a comment
    Given user is logged in
    And user clicks on an article
    When user clicks add comment
    Then user should be able to view the added comment

  Scenario: User should be prompted to log in to add a comment
    Given user is not logged in
    And user clicks on an article
    When user clicks add comment
    Then user should be prompted to log in