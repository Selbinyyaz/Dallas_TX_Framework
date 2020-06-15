package com.dallastx.steps;

import java.util.List;
import java.util.Map;

import com.dallastx.utils.CommonMethods;
import com.dallastx.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMembershipAnyEmployeeSteps extends CommonMethods {

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {

		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("user navigates to EmployeeListPage")
	public void user_navigates_to_EmployeeListPage() {

		qualification.navigateToEmployeeList();

	}

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String id) {

		qualification.searchId(id);
	}

	@When("click on search button")
	public void click_on_search_button() {

		click(qualification.searchbtn);
	}

	@Then("user click on id button")
	public void user_click_on_id_button() {
		wait(2);
		qualification.data.get(0).click();

	}

	@Then("user navigates to MembershipPage and click on add button")
	public void user_navigates_to_MembershipPage_and_click_on_add_button() {

		qualification.MembershipButton.click();

		click(addMembership.addMember);
	}

	@When("user select membership details and click on save then employee is added")
	public void user_select_membership_details_and_click_on_save_then_employee_is_added(DataTable dataTable) {

		List<Map<String, String>> addMembershipList = dataTable.asMaps();

		for (Map<String, String> map : addMembershipList) {
			String member = map.get("Membership");
			String paid = map.get("Subscription Paid By");
			String amount = map.get("Subscription Amount");
			String currency = map.get("Currency");
			String commence = map.get("Subscription Commence Date");
			String renewel = map.get("Subscription Renewal Date");

			selectDdValue(addMembership.membership, member);
			selectDdValue(addMembership.PaidBy, paid);
			sendText(addMembership.Amount, amount);
			selectDdValue(addMembership.currency, currency);
			sendText(addMembership.CommenceDate, commence);
			sendText(addMembership.RenewalDate, renewel);
			click(addMembership.SavebtnMembership);
//			addMembership.CommenceDate("June","15","2020");
//			addMembership.CommenceDate("May", "10", year);

		}
	}

}
