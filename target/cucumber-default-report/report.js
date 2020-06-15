$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddMembershipAnyEmployee.feature");
formatter.feature({
  "name": "Add membership to any employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to EmployeeListPage",
  "keyword": "And "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.user_navigates_to_EmployeeListPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user enters valid employee id \"14098\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.user_enters_valid_employee_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see employee information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.user_see_employee_information_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on id button",
  "keyword": "And "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.user_click_on_id_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to MembershipPage and click on add button",
  "keyword": "And "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.user_navigates_to_MembershipPage_and_click_on_add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select membership details and click on save then employee is added",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.dallastx.steps.AddMembershipAnyEmployeeSteps.user_select_membership_details_and_click_on_save_then_employee_is_added(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Search employee by id");
formatter.after({
  "status": "passed"
});
});