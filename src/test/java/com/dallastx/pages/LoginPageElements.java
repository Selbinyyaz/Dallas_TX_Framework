package com.dallastx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dallastx.testbase.BaseClass;
import com.dallastx.utils.CommonMethods;


public class LoginPageElements extends CommonMethods {
	
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(name = "txtPassword")
	public WebElement password;

	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;
	
	

	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

	public void login(String uid, String pwd) {
		sendText(username, uid);
		sendText(password, pwd);
		click(loginBtn);
	}
}
