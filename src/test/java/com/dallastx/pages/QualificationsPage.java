package com.dallastx.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dallastx.testbase.BaseClass;
import com.dallastx.utils.CommonMethods;

public class QualificationsPage extends CommonMethods{

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement Admin;

	@FindBy(id = "menu_admin_Qualifications")
	public WebElement qual;

	@FindBy(id = "menu_admin_membership")
	public WebElement membership;

	@FindBy(id = "btnAdd")
	public WebElement add;

	@FindBy(xpath = "//input[@id='membership_name']")
	public WebElement memName;

	@FindBy(id = "btnSave")
	public WebElement save;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement Pim;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement emplist;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchbtn;

	@FindBy(xpath = "//table[@id='resultTable']//td/a")
	public List<WebElement> data;// 14098

	@FindBy(id = "sidenav")
	public List<WebElement> list;

	@FindBy(linkText = "Memberships")
	public WebElement MembershipButton;

	public QualificationsPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void searchId(String id) {

		click(emplist);
		wait(2);
		sendText(empID, id);
		click(searchbtn);

	}

	public void navigateToEmployeeList() {
		click(Pim);
		wait(2);
		click(emplist);
	}

}
