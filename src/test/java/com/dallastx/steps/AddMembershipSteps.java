package com.dallastx.steps;

import com.dallastx.utils.CommonMethods;
import com.dallastx.utils.ConfigsReader;

import io.cucumber.java.en.When;

public class AddMembershipSteps extends CommonMethods{

	@When("user enter valid admin username and password")
	public void user_enter_valid_admin_username_and_password() {
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));

	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		
		click(login.loginBtn);
		
	}

	@When("user navigates to MembershipPages")
	public void user_navigates_to_MembershipPages() {
		click(qualification.Admin);
		wait(2);
		click(qualification.qual);
		wait(2);
		click(qualification.membership);
		
	}

	@When("user enter name membership")
	public void user_enter_name_membership() {
		click(qualification.add);
		wait(2);
		sendText(qualification.memName, "MemberLeap");
	}

	@When("user click on save button")
	public void user_click_on_save_button() {
		click(qualification.save);
		wait(2);
	}

}
