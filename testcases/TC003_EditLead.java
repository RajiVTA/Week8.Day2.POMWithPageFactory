package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC003_EditLead extends  ProjectSpecificMethods{
	
	@BeforeTest
	public void setData()
	{
		fileName="EditLead";
	}
	
	@Test(dataProvider="fetchData")
	public void runLogin(String Username, String Password, String PhoneNumber, String UpdateCompanyName) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUserName(Username)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads() 
		.clickPhoneTab()
		.enterPhoneNumber(PhoneNumber)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickEditButton()
		.updateCompanyname(UpdateCompanyName)
		.clickUpdateButton();
					
	}

}
