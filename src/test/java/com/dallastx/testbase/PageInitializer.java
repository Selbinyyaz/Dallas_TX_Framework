package com.dallastx.testbase;


import com.dallastx.pages.AddMembership;
import com.dallastx.pages.LoginPageElements;
import com.dallastx.pages.QualificationsPage;

public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	
	public static QualificationsPage qualification;
	
	public static AddMembership addMembership;
	
	public static void initialize() {
		
		login = new LoginPageElements();
	
		qualification=new QualificationsPage();
		
		addMembership=new AddMembership();
	}
}
