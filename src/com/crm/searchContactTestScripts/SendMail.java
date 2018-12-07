package com.crm.searchContactTestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericLib.BaseClass;
import com.crm.genericLib.CommonLibrary;
import com.crm.genericLib.FileLib;
import com.crm.objectRepository.ComposeEmailPage;
import com.crm.objectRepository.ContactsPage;
import com.crm.objectRepository.HomePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SendMail extends BaseClass

{
	@Test
	public void sendMailTC_33()
	{
		ExtentTest test=report.startTest("sendMailTC_33");
		
		
		String expRes=FileLib.readData("TC_33", 1, 0);
		
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		ContactsPage cp=PageFactory.initElements(driver, ContactsPage.class);
		ComposeEmailPage cep=PageFactory.initElements(driver, ComposeEmailPage.class);
		CommonLibrary cl=PageFactory.initElements(driver, CommonLibrary.class);
		
		
		hp.clickOnContacts();
		cp.clickOnCheckbox();
		cp.clickOnSendmail();
		cp.clickOnSelect();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> i1=set.iterator();
		String parentWindow=i1.next();
		String  childWindow=i1.next();
		driver.switchTo().window(childWindow);
		String actRes=cl.getCurrentPageTitle();
		 driver.close();
		 driver.switchTo().window(parentWindow);
		 
		   
		 
		 Assert.assertEquals(actRes, expRes);
		 test.log(LogStatus.PASS, "verify");
		 report.endTest(test);
	}
	
	@Test
	public void sendMailTC_47() throws Exception
	{
		ExtentTest test=report.startTest("sendMailTC_47");
String expRes=FileLib.readData("TC_47", 1, 0);
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		ContactsPage cp=PageFactory.initElements(driver, ContactsPage.class);
		ComposeEmailPage cep=PageFactory.initElements(driver, ComposeEmailPage.class);
		CommonLibrary cl=PageFactory.initElements(driver, CommonLibrary.class);
		
		hp.clickOnContacts();
		cp.clickOnCheckbox();
		cp.clickOnSendmail();
		cp.clickOnSelect();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> i1=set.iterator();
		String parentWindow=i1.next();
		String  childWindow=i1.next();
		driver.switchTo().window(childWindow);
		
		cep.clickOnBrowse();
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\kkk.exe");
		cep.clickOnDelete();
		driver.close();
		 driver.switchTo().window(parentWindow);
		String actRes= cl.getCurrentPageTitle();
		Assert.assertEquals(actRes, expRes);
		test.log(LogStatus.PASS, "verify");
		 report.endTest(test);
		 
		
		
		
		
	}

}
