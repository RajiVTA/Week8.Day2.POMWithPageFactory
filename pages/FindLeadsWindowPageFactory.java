package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadsWindowPageFactory extends ProjectSpecificMethods {

	public FindLeadsWindowPageFactory(ChromeDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	WebElement eleFirstNameWindow;
	public FindLeadsWindowPageFactory enterFirstNameWindow() throws InterruptedException
	{
		eleFirstNameWindow.sendKeys("Anu");
		Thread.sleep(4000);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']")
	WebElement eleFindLeadsButtonWindow;
	public FindLeadsWindowPageFactory clickFindLeadsButtonWindow() throws InterruptedException
	{
		eleFindLeadsButtonWindow.click();
		Thread.sleep(4000);
		return this;
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleResultLeadWindow;
	public MergeLeadsPageFactory clickFirstResultLeadIDFromLeadWindow()
	{
		lead = eleResultLeadWindow.getText();
		eleResultLeadWindow.click();
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPageFactory(driver);
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleFResult;
	public MergeLeadsPageFactory clickFirstResultLeadIDToLeadWindow()
	{
		//lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		eleFResult.click();
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPageFactory(driver);
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	WebElement eleFNameWindow;
	public FindLeadsWindowPageFactory enterFirstName2Window() throws InterruptedException
	{
		eleFNameWindow.sendKeys("bond");
		Thread.sleep(4000);
		return this;
	}
	
	

}
