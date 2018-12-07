package com.crm.contacts.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.crm.genericLib.BaseClass;
import com.crm.genericLib.FileLib;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


/**
 * 
 * @author kala
 *
 */
@Listeners(com.crm.genericLib.Listener.class)
public class CampaignTestTC_04 extends BaseClass
{
	/**
	 * create campaign
	 */

	@Test
	public void createCampaignTC_04()
	
	{
		ExtentTest test= report.startTest("createCampaignTC_04");
		test.log(LogStatus.INFO,"create Campaign");
		
		String campaignName=FileLib.readData("TC_04",1,0);
		String groupName=FileLib.readData("TC_04", 1, 1);
		Actions a1= new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"))).perform();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("campaignname")).sendKeys(campaignName);
		driver.findElement(By.xpath("//input[@value='T']")).click();
		WebElement dropDown=driver.findElement(By.name("assigned_group_id"));
		Select dd=new Select(dropDown);
		dd.selectByVisibleText(groupName);
		
//		driver.findElement(By.id("jscal_trigger_closingdate")).click();
//		while(true){
//			try {
//				String str=driver.findElement(By.xpath("//td[text()='June, 2018']")).getText();
//				if(str.contains("June"))
//					driver.findElement(By.xpath("//td[text()='22']")).click();
//			}
//			catch(Throwable t) {
				//driver.findElement(By.xpath("html/body/div[23]/table/thead/tr[2]/td[2]")).click();
//			}
		//}
				
		driver.findElement(By.name("button")).click();
		 String actRes=driver.getTitle();
		 String expRes=FileLib.readData("TC_04", 1, 2);
		 Assert.assertEquals(actRes, expRes);
		
		 report.endTest(test);
		 
		 
		 
		 
		
		
	}
	@Test
	public void createCampaignTC_05()
	{
	/**
	 * 
	 * create campaign without entering mandatory fields
	 */
	Actions a1=new Actions(driver);
	a1.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"))).perform();
	
	driver.findElement(By.linkText("Campaigns")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.name("button")).click();
	String expRes=driver.switchTo().alert().getText();
	String actRes=FileLib.readData("TC_05", 1, 0);
	driver.switchTo().alert().accept();
	Assert.assertEquals(actRes, expRes);
	
	
	
	
	}
	@Test
	public void createCampaignTC_06()
	{
		/**
		 * create campaign and cancel
		 */
		String campaignName=FileLib.readData("TC_06",1,0);
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']"))).perform();
		
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("campaignname")).sendKeys(campaignName);
		driver.findElement(By.xpath("//input[@class='crmbutton small cancel']")).click();
		String actRes=driver.getTitle();
		String expRes=FileLib.readData("TC_06", 1, 1);
		Assert.assertEquals(actRes, expRes);
	}
	//@Test
	public void searchContactTC_18()
	{
		String dropDown1=FileLib.readData("TC_18",1,0);
		String dropDown2=FileLib.readData("TC_18",1,1);
		String name=FileLib.readData("TC_18",1,2);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Go to Advanced Search")).click();
		WebElement searchDropDown=driver.findElement(By.name("fcol0"));
		Select d1=new Select(searchDropDown);
		d1.selectByVisibleText(dropDown1);
		WebElement compareDropDown=driver.findElement(By.name("fop0"));
		Select d2=new Select(compareDropDown);
		d2.selectByVisibleText(dropDown2);
		driver.findElement(By.name("fval0")).sendKeys(name);
		driver.findElement(By.xpath("//input[contains(@onclick,'Advanced')]")).click();
		
		
	}
	//@Test
	public void searchContactTC() throws Throwable
	{
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.id("3")).click();
		driver.findElement(By.xpath("//table[@class='small']/tbody/tr/td/input[@value='Send Mail']")).click();
		
		driver.findElement(By.xpath("//input[@name='Select']")).click();
		Set<String> set= driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String parentwinSessionId=it.next();
		String childwinSessionId=it.next();
		driver.switchTo().window(childwinSessionId);
		
		String windowdropdown=FileLib.readData("TC",1,0);
		WebElement windowDropDown=driver.findElement(By.xpath("//select[@name='parent_type']"));
		Select d3=new Select(windowDropDown);
		d3.selectByVisibleText(windowdropdown);
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		
		Set<String> set1= driver.getWindowHandles();
		Iterator<String> it1=set1.iterator();
		String parentwinSessionId1=it1.next();
		String childwinSessionId1=it1.next();
		String childwinSessionId2=it1.next();
		driver.switchTo().window(childwinSessionId2);
		driver.findElement(By.id("1")).click();
		
		driver.switchTo().window(childwinSessionId1);
		String sub=FileLib.readData("TC", 1, 1);
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys(sub);
		
		driver.findElement(By.xpath("//input[@id='my_file_element']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\kk.exe");
		
		 
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[contains(@title,'Save')]")).click();
		
		
		
	}

  @Test
  public void searchContactTC_33() 
  {
	  /**
	   * 
	   * select the contact and send mail
	   */
	  

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.id("3")).click();
		driver.findElement(By.xpath("//table[@class='small']/tbody/tr/td/input[@value='Send Mail']")).click();
		
		driver.findElement(By.xpath("//input[@name='Select']")).click();
		Set<String> set= driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String parentwinSessionId=it.next();
		String childwinSessionId=it.next();
		driver.switchTo().window(childwinSessionId);
		String actRes=driver.getTitle();
		String expRes=FileLib.readData("TC_33", 1, 0);
		
		driver.close();
		driver.switchTo().window(parentwinSessionId);
		Assert.assertEquals(actRes, expRes);
		
		
		
		
	  
  }
  @Test
  public void searchContactTC_47() throws Throwable
  {
	  /**
	   * 
	   * sending mail with attachment
	   */
	  driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.id("3")).click();
		driver.findElement(By.xpath("//table[@class='small']/tbody/tr/td/input[@value='Send Mail']")).click();
		
		driver.findElement(By.xpath("//input[@name='Select']")).click();
		Set<String> set= driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		String parentwinSessionId=it.next();
		String childwinSessionId=it.next();
		driver.switchTo().window(childwinSessionId);
		
		driver.findElement(By.xpath("//input[@id='my_file_element']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\kk.exe");
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		/*driver.findElement(By.xpath("//input[@id='my_fil_element']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\kk.exe");
		driver.findElement(By.xpath("//input[@value='Delete']")).click();*/
		
		String actRes=driver.getTitle();
		String expRes=FileLib.readData("TC_47", 1, 0);
		Assert.assertEquals(actRes, expRes);
		driver.close();
		driver.switchTo().window(parentwinSessionId);
		
  }
  
}
