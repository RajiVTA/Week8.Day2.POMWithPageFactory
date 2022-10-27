package com.testleaf.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.testleaf.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	
	public ChromeDriver driver;
	public String fileName;
	public static String LeadID, lead;
	//public static String LeadIdentifier=LeadID;
	public static Set<String> allWindows, allWindows2; 
	public static List<String> allhandles, allhandles2;
	public static Properties prop1;
	
	@BeforeMethod
	public void preCondition() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Properties prop = new Properties(); // Create Object for properties
		
		FileInputStream fis=new FileInputStream(new File("src/main/resources/config.properties"));
		prop.load(fis); //Load the Properties files
		
		String uName = prop.getProperty("username");
		System.out.println("UserName:"+uName);
		System.out.println(prop.getProperty("lang"));
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("password"));
		
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String lang = prop.getProperty("lang");
		
		prop1=new Properties();
		FileInputStream fis1=new FileInputStream(new File("src/main/resources/"+ lang +".properties"));
		prop1.load(fis1);
		
		
	}

	
	@AfterMethod
	public void postCondition() throws InterruptedException
	{
		//Thread.sleep(10000);
		//driver.close();
	}
	
	@DataProvider(name="fetchData",indices=0)
	public String[][] fetchData() throws IOException
	{
		return ReadExcelData.readSheetData(fileName);
	}
}
