package com.crm.contacts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MakeMyTrip 
{
	public static WebDriver driver;
	@Test
	public void loginMakeMyTrip()
	{
		System.setProperty("webdriver.gecko.driver","./Third_Party_drivers.geckodriver.exe");
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement from=driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']"));
		//from.clear();
		from.sendKeys("banglore",Keys.ENTER);
		WebElement to=driver.findElement(By.xpath("//input[@id='hp-widget__sTo']"));
//		to.clear();
		to.sendKeys("goa",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		int monthCount1=0;
		while(monthCount1<=12)
		{
			try
			{
				driver.findElement(By.xpath("//td[@data-month='12'and @data-year='2018'/a[text()='25']")).click();
				break;
			}
			catch(Throwable t)
			{
				driver.findElement(By.xpath("//span[text()='Next'][1]")).click();
				monthCount1++;
			}
		}
		driver.findElement(By.xpath("//input[@id='hp-widget__return']")).click();
		int monthCount2=0;
		while(monthCount2<=12)
		{
			try
			{
				driver.findElement(By.xpath("//td[@data-month='1'and @data-year='2019'/a[text()='25']")).click();
				break;
			}
			catch(Throwable t)
			{
				driver.findElement(By.xpath("//span[text()='Next'][1]")).click();
				monthCount2++;
			}
		}
		
		
		
		
		
	}

}
