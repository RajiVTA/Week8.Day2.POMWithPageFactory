package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class EditLeadPageFactory extends ProjectSpecificMethods {
	
	public EditLeadPageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(how=How.ID, using = "updateLeadForm_companyName")
	WebElement eleUpdateCompanyName;
	public EditLeadPageFactory updateCompanyname(String UpdateCompanyName) throws InterruptedException
	{
		eleUpdateCompanyName.clear();
		eleUpdateCompanyName.sendKeys(UpdateCompanyName);
		Thread.sleep(2000);
		return this;
	}

	@FindBy(how=How.NAME, using = "submitButton")
	WebElement eleUpdateButton;
	public EditLeadPageFactory clickUpdateButton()
	{
		eleUpdateButton.click();
		return new EditLeadPageFactory(driver);
	}
	

}
