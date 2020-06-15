@regression
Feature: Add membership to any employee

  Background: 
    Given user is logged with valid admin credentials
    And user navigates to EmployeeListPage

  Scenario: Search employee by id
    When user enters valid employee id "14098"
    And click on search button
    And user click on id button
    And user navigates to MembershipPage and click on add button
    When user select membership details and click on save then employee is added
      | Membership | Subscription Paid By | Subscription Amount | Currency             | Subscription Commence Date | Subscription Renewal Date |
      | MemberLeap | Individual           |                 100 | United States Dollar | 2020-Jun-15                | 2021-May-20               |
