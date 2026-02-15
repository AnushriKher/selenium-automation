Feature: Forgot Password

  Scenario: User resets password using registered email
    Given user launches the Leetcode site
    When user navigates to forgot password page
    And user enters registered email and submits reset
    Then user should receive password reset instructions