package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class MyHomePageFactory  extends ProjectSpecificMethods{
	
	public MyHomePageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public LeadsPageFactory clickLeads()
	{
		driver.findElement(By.linkText(prop1.getProperty("Leads_link"))).click();
		return new LeadsPageFactory(driver);
	}
	

}
