package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class LeadsPageFactory extends ProjectSpecificMethods {
	
	public LeadsPageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public CreateLeadPageFactory clickCreateLead()
	{
		driver.findElement(By.linkText(prop1.getProperty("CreateLead_link"))).click();
		return new CreateLeadPageFactory(driver);
		
	}
	
	//@FindBy(how=How.LINK_TEXT, using="Find Leads")
	//WebElement eleFindLeads;
	public FindLeadsPageFactory clickFindLeads() throws InterruptedException
	{
		Thread.sleep(8000);
		
		
		driver.findElement(By.linkText(prop1.getProperty("FindLead_link"))).click();
		//eleFindLeads.click();
		return new FindLeadsPageFactory(driver);
		
	}
	
	@FindBy(how=How.LINK_TEXT, using="Merge Leads")
	WebElement eleMergeLeads;
	public MergeLeadsPageFactory clickMergeLeadsLink()
	{
		eleMergeLeads.click();
		return new MergeLeadsPageFactory(driver);
		
	}
}