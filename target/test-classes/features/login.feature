Feature: User Login

  Scenario: User logs in using previously registered credentials
    When user navigates to login page
    And user enters valid login credentials and submits
    Then user should be logged in successfully