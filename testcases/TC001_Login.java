package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC001_Login extends  ProjectSpecificMethods {
	
	
	@BeforeTest
	public void setData()
	{
		fileName="Login";
	
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void runLogin(String Username, String Password)
	{
		new LoginPage(driver)
		.enterUserName(Username)
		.enterPassword(Password)
		.clickLogin();
//		.clickCRMSFA()
//		.clickLeads()
//		.clickCreateLead();
		
			
	}

}
