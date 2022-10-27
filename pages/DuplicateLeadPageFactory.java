package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class DuplicateLeadPageFactory  extends ProjectSpecificMethods {
	
	public DuplicateLeadPageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(how=How.NAME, using ="submitButton")
	WebElement eleCreateLeadButton;
	public ViewLeadPageFactory clickCreateLeadButton()
	{
		eleCreateLeadButton.click();
		return new ViewLeadPageFactory(driver);
		
	}


}
