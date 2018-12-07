package com.crm.contacts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon 
{
	public static WebDriver driver;
	@Test
	public void loginAmazon()
	{
		System.setProperty("Webdriver.gecko.driver","./Third_Party_drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone10",Keys.ENTER);
	}
		 
		 

}
