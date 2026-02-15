Feature: User Signup

  Scenario: User signs up with dynamic data
    Given user launches the Leetcode site
    When user navigates to signup page
    And user enters dynamic user data and submits
    Then user account should be created successfully