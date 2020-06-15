package com.dallastx.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dallastx.testbase.BaseClass;
import com.dallastx.utils.CommonMethods;

public class AddMembership extends CommonMethods{
	
	@FindBy(id = "btnAddMembershipDetail")
	public WebElement addMember;

	@FindBy(xpath = "//select[@id='membership_membership']")
	public WebElement membership;

	@FindBy(xpath = "//select[@id='membership_subscriptionPaidBy']")
	public WebElement PaidBy;

	@FindBy(xpath = "//input[@id='membership_subscriptionAmount']")
	public WebElement Amount;

	@FindBy(xpath = "//select[@id='membership_currency']")
	public WebElement currency;

	@FindBy(xpath = "//input[@id='membership_subscriptionCommenceDate']")
	public WebElement CommenceDate;

	@FindBy(xpath = "//input[@id='membership_subscriptionRenewalDate']")
	public WebElement RenewalDate;

	@FindBy(id = "btnSaveMembership")
	public WebElement SavebtnMembership;

	@FindBy(id = "ui-datepicker-div")
	public WebElement calendar;

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	public WebElement mDD;

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement yDD;

	public AddMembership() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void CommenceDate(String month, String day, String year) {

		calendar.click();
		selectDdValue(mDD, month);
		wait(2);
		selectDdValue(yDD, year);

		List<WebElement> datenumber = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));// calendar

		for (WebElement date : datenumber) {
			wait(2);
			if (date.getText().equals(day)) {
				date.click();
				break;
			}
		}

	}
}
