Feature: Add Membership

  Scenario: valid admin login
    When user enter valid admin username and password
    And user click on login button
    And user navigates to MembershipPages
    When user enter name membership
    And user click on save button
