package com.testleaf.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadsPageFactory extends ProjectSpecificMethods {
	
	public FindLeadsPageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//span[text()='Phone']")
	WebElement elePhoneTab;
	public FindLeadsPageFactory clickPhoneTab()
	{
		elePhoneTab.click();
		return this;
	}
	
	@FindBy(how=How.XPATH, using = "//input[@name='phoneNumber']")
	WebElement elePhoneNumber;
	public FindLeadsPageFactory enterPhoneNumber(String PhoneNumber)
	{
		elePhoneNumber.sendKeys(PhoneNumber);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	WebElement eleFindLeadsButton;
	public FindLeadsPageFactory clickFindLeadsButton() throws InterruptedException
	{
		//driver.findElement(By.linkText(prop1.getProperty("FindLead_link"))).click();
		eleFindLeadsButton.click();
		Thread.sleep(4000);
		return this;

	}
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFirstResultLeadIDDeleteLead;
	public ViewLeadPageFactory clickFirstResultLeadIDDeleteLead() throws InterruptedException
	{
		Thread.sleep(4000);
		LeadID = eleFirstResultLeadIDDeleteLead.getText();
		System.out.println("LeadID get from method :"+LeadID);
		
		eleFirstResultLeadIDDeleteLead.click();
		Thread.sleep(4000);
		return new ViewLeadPageFactory(driver);
	}
	
//	public ViewLeadPage clickFirstResultLeadID(String leadID) throws InterruptedException
//	{
//		Thread.sleep(4000);
//		LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
//	
//		System.out.println("LeadID get from method :"+LeadID);
//		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//		Thread.sleep(4000);
//		return new ViewLeadPage(driver);
//	}
	
	@FindBy(how=How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement clickFirstResult;
	public ViewLeadPageFactory clickFirstResult() throws InterruptedException
	{
		Thread.sleep(4000);
		String firstResult = clickFirstResult.getText();
		System.out.println("LeadID get from method :"+firstResult);
		clickFirstResult.click();
		Thread.sleep(4000);
		return new ViewLeadPageFactory(driver);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='id']")
	WebElement eleLeadID;
	public FindLeadsPageFactory enterLeadID() throws InterruptedException
	{
		Thread.sleep(5000);
		eleLeadID.sendKeys(LeadID);
		System.out.println("Lead ID passing from another method"+LeadID);
		Thread.sleep(3000);
		return this;

	}
	
	@FindBy(how=How.CLASS_NAME, using="x-paging-info")
	WebElement eleText;
	public void verifyDeleteLead() throws InterruptedException
	{
		Thread.sleep(9000);
		String text = eleText.getText();
		
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='id']")
	WebElement eleLeadIDMerge;
	public FindLeadsPageFactory enterLeadIDMergedEarlier() throws InterruptedException
	{
		eleLeadIDMerge.sendKeys(lead);
		Thread.sleep(4000);
		return this;
		
	}
}