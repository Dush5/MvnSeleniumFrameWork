package com.crm.genericLib;

import java.io.File;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
@Listeners(com.crm.genericLib.Listener.class)
public class BaseClass 
{
	public static WebDriver driver;
	public ExtentReports report;
	
	
	@BeforeSuite
	public void configBS()
	{
		String currentDate=new Date().toString().replace(" ","_").replace(":","_");
		report=new ExtentReports("./advanceReport/"+currentDate+"_extent.html");
		report.loadConfig(new File("./extent-config.xml"));
		
				
		  
	}
	
	
	
	@BeforeClass
	public void preConfig() throws Throwable
	{
		
		FileLib file=new FileLib();
		Properties pobj=file.getPropertyFile();
     	String browser= pobj.getProperty("browser");
		String url=pobj.getProperty("url"); 
		
		if(browser.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver","./Third_Party_drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else 
		{

			System.setProperty("webdriver.chrome.driver","./Third_Party_drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void preTest() throws Throwable
	{
		FileLib file=new FileLib();
		Properties pobj=file.getPropertyFile();
		String userName=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.enterUsername(userName);
		lp.enterPassword(password);
		lp.clickOnLogin();
		
		
	}
	@AfterMethod
	public void postTest() 
	{
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.movecursorOnsignout();
		hp.clickOnSignout();
	}
	@AfterClass
	public void postConfig()
	{
		driver.close();
	}
	@AfterSuite
	public void configAS()
	{
		report.flush();
		report.close();
	}
	
	
	

}
