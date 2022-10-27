package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC005_DeleteLead extends  ProjectSpecificMethods{
	
			
			@BeforeTest
			public void setData()
			{
				fileName="DeleteLead";
			}
			
			@Test(dataProvider="fetchData")
			public void runLogin(String Username, String Password, String PhoneNumber) throws InterruptedException
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
				.clickFirstResultLeadIDDeleteLead()
				.clickDeleteButton()
				.clickFindLeads()
				.enterLeadID()
				.clickFindLeadsButton()
				.verifyDeleteLead();
				
				
			}

}
