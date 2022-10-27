package com.testleaf.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class CreateLeadPageFactory extends ProjectSpecificMethods {
	
	
	public CreateLeadPageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement eleCompanyName;
	public CreateLeadPageFactory enterCompanyName(String CompanyName)
	{
		eleCompanyName.sendKeys(CompanyName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using = "createLeadForm_firstName")
	WebElement eleFirstName;
	public CreateLeadPageFactory enterFirstName(String FirstName)
	{
		eleFirstName.sendKeys(FirstName);
		return this;
		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	WebElement eleLastName;
	public CreateLeadPageFactory enterLastName(String LastName)
	{
		eleLastName.sendKeys(LastName);
		return this;
		
	}
	
	@FindBy(how=How.NAME, using="submitButton")
	WebElement eleClickLeadButton;

	public ViewLeadPageFactory clickLeadButton() 
	{
			eleClickLeadButton.click();
			return new ViewLeadPageFactory(driver);
		
	}
}



