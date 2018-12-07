package com.actitime.customer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.genericLib.FileLib;

public class Customer 
{
	@Test
	public void createCustomer()
	{
		System.setProperty("Webdriver.gecko.driver","./Third_Party_drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://lenovo-pc/login.do");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 WebElement we=driver.findElement(By.xpath("//select[@name='customerProject.shownCustomer']"));
		 we.click();
		 
//		 driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
//		 String customerName=FileLib.readData("Sheet1", 1, 0);
//		 driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
//		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys(customerName);
//		 driver.findElement(By.name("createCustomerSubmit")).click();
//		 driver.findElement(By.xpath("//img[@src='/img/default/top_nav/logout.gif']")).click();
//		 driver.close();
	
		 
	}

}
