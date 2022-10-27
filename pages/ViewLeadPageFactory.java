package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class ViewLeadPageFactory  extends ProjectSpecificMethods{

	public ViewLeadPageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Edit")
	WebElement eleEditButton;
	public EditLeadPageFactory clickEditButton()
	{

		eleEditButton.click();
		return new EditLeadPageFactory(driver);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Duplicate Lead")
	WebElement eleDuplicateLeadButton;
	public DuplicateLeadPageFactory clickDuplicateLeadButton()
	{

		eleDuplicateLeadButton.click();
		return new DuplicateLeadPageFactory(driver);
	}
	
	@FindBy(how=How.XPATH, using="//a[@class='subMenuButtonDangerous']")
	WebElement eleDeleteButton;
	public LeadsPageFactory clickDeleteButton() throws InterruptedException
	{
		eleDeleteButton.click();
		Thread.sleep(9000);
		return new LeadsPageFactory(driver);
	}
	

}
