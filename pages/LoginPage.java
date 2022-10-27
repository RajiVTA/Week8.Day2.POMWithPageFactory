package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.ID,using="username")
	
//	@FindBys(
//			{@FindBy(how=How.CLASS_NAME, using="inputLogin"),
//			@FindBy(how=How.XPATH, using="//input[@id='username']")
//			
//			}
//			)
	
	WebElement eleUsername;
	//List<WebElement> eleUserName
	
	public LoginPage enterUserName(String Username)
	{
		//driver.findElement(By.id("username")).sendKeys(Username);
		eleUsername.sendKeys(Username);
	
		return this;
		
	}
	
	
	@FindBy(how=How.ID,using="password")
	WebElement elePassword;
	public LoginPage enterPassword(String Password)
	{
		//driver.findElement(By.id("password")).sendKeys(Password);
		elePassword.sendKeys(Password);
		return this;
		
	}
	
	public HomePageFactory clickLogin()
	{
		
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePageFactory(driver);
	}

}
