package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class HomePageFactory extends ProjectSpecificMethods {
	
	public HomePageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA")
	WebElement eleCRMSFALink;
	public MyHomePageFactory clickCRMSFA()
	{
		eleCRMSFALink.click();
		return new MyHomePageFactory(driver);
		
	}

}
