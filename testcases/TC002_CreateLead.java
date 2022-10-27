package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC002_CreateLead  extends  ProjectSpecificMethods{
	

	@BeforeTest
	public void setData()
	{
		fileName="CreateLead";
	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String Username, String Password, String FirstName, String LastName, String CompanyName)
	{
		new LoginPage(driver)
		.enterUserName(Username)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.clickLeadButton();
		
			
	}

}
