package com.crm.contacts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GMail 

{
	public static WebDriver driver;
	@Test
	public void loginGmail()
	{
		System.setProperty("webdriver.gecko.driver","./Third_Party_drivers.geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("jdkfjeoi",Keys.ENTER);
		/*Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Next']"))).perform();
		a.sendKeys(Keys.ENTER).perform();
		WebElement we=driver.findElement(By.xpath("//input[@name='password']"));
		 we.sendKeys("C@lajothi11");*/
		WebElement we=driver.findElement(By.xpath("//div[text()=\"Couldn't find your Google Account\"]"));
		String msg=we.getText();
		String actcolour=we.getCssValue("color");
		System.out.println(actcolour);
		
		 
		
	
		
//		String actRes=driver.getTitle();
//		System.out.println(expRes);
//		System.out.println(actRes);
//		Assert.assertEquals(actRes, expRes);
		
		
	}

}
