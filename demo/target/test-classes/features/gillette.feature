Feature: Verification of Feedback Functionality

  Scenario: User submits feedback and receives admin reply
    Given the user navigates to JavaTpoint.com
    When the user clicks on Feedback, then the Feedback page opens
    Then feedback should be received on the admin page
    And admin can reply to the user
