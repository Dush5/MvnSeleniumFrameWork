package com.crm.contacts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlipKart 
{

	@Test
	public  void openFlipKart()
	{
		
		System.setProperty("Webdriver.gecko.driver","./Third_Party_drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
			 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone10",Keys.ENTER);
//			 String result=driver.findElement(By.xpath("//span[@class='_2yAnYN']")).getText();
//			 System.out.println(result);
		 
			 
		
		
		
				
		

	}

}
