package com.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.testleaf.base.ProjectSpecificMethods;

public class MergeLeadsPageFactory  extends ProjectSpecificMethods {
	
	public MergeLeadsPageFactory(ChromeDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.XPATH, using="//img[@alt='Lookup']")
	WebElement eleLookupFrom;
	public FindLeadsWindowPageFactory lookupFromLead()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsWindowPageFactory(driver);
		
	}

	@FindBy(how=How.XPATH, using="(//img[@alt='Lookup'])[2]")
	WebElement eleLookupTo;
	public FindLeadsWindowPageFactory lookupToLead()
	{
		eleLookupTo.click();

		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		
		driver.switchTo().window(allhandles2.get(1));
		return new FindLeadsWindowPageFactory(driver);

	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Merge']")
	WebElement eleMerge;
	public LeadsPageFactory clickMergeButtonAndConfirm() throws InterruptedException
	{
				eleMerge.click();
				driver.switchTo().alert().accept();
				Thread.sleep(9000);
				return new LeadsPageFactory(driver);
	}
	
	

}
