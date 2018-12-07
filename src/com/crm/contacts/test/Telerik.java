package com.crm.contacts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Telerik 
{
	public static WebDriver driver;
	@Test
	public void loginTelerik()
	{
		System.setProperty("Webdriver.gecko.driver","./Third_Party_drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demos.telerik.com/kendo-ui/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		
	}

}
