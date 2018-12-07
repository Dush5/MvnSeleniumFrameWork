package com.crm.contacts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FaceBook
{
public static WebDriver driver;
@Test
public void loginFaceBook()

{
	System.setProperty("webdriver.gecko.driver","./Third_Party_drivers.geckodriver.exe");
	driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 WebElement we=driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yc/r/GwFs3_KxNjS.png']"));
	 System.out.println(we.isDisplayed());
	 Dimension dem=we.getSize();
	 System.out.println(dem.getHeight());
	 System.out.println(dem.getWidth());
	 Point p=we.getLocation();
	 System.out.println(p.getX());
	 System.out.println(p.getY());
	 System.out.println(driver.findElement(By.name("firstname")).getAttribute("aria-label"));
	 
	 System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isSelected());
	 
	 
	
	

}
}
