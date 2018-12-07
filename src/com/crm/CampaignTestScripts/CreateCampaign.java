package com.crm.CampaignTestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.genericLib.BaseClass;
import com.crm.genericLib.CommonLibrary;
import com.crm.genericLib.FileLib;
import com.crm.objectRepository.CampaignsPage;
import com.crm.objectRepository.CreateNewCampaignPage;
import com.crm.objectRepository.HomePage;
import com.relevantcodes.extentreports.ExtentTest;

public class CreateCampaign  extends BaseClass
{
	
	@Test(enabled=false)
	public void createCampaignTC_04()
	{
		ExtentTest test=report.startTest("createCampaignTC_04");
 String campaignName=FileLib.readData("TC_04", 1, 0);
 String groupName=FileLib.readData("TC_04", 1, 1);
 String expRes=FileLib.readData("TC_04", 1, 2);
 
HomePage hp=PageFactory.initElements(driver, HomePage.class);
CampaignsPage cp=PageFactory.initElements(driver, CampaignsPage.class);
CreateNewCampaignPage cncp=PageFactory.initElements(driver, CreateNewCampaignPage.class);
CommonLibrary cl=PageFactory.initElements(driver, CommonLibrary.class);
 

 hp.placeCursorOnMore();
 hp.clickOnCampaigns();
 cp.clickOnCreateicon();
 cncp.enterCampaignName(campaignName);
 cncp.clickOnGroup();
 cncp.selectDropdown(groupName);
 
 cncp.clickOnSave();
 
 String actRes=driver.getTitle();
 
 Assert.assertEquals(actRes, expRes);
 
 report.endTest(test);
 
 }
	@Test(invocationCount=3)
	public void cancelCampaignTC_05()
	
	{
		ExtentTest test=report.startTest("createCampaignTC_05");
		String expRes=FileLib.readData("TC_05", 1, 0);
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		CampaignsPage cp=PageFactory.initElements(driver, CampaignsPage.class);
		CreateNewCampaignPage cncp=PageFactory.initElements(driver, CreateNewCampaignPage.class);
		CommonLibrary cl=PageFactory.initElements(driver, CommonLibrary.class);
		
		
		hp.placeCursorOnMore();
		 hp.clickOnCampaigns();
		 cp.clickOnCreateicon();
		 cncp.clickOnSave();
		  String actRes=cl.fetchAlertText();
		  cl.clickOnAlertOk();
		  
		  
		  Assert.assertEquals(actRes, expRes);
		  report.endTest(test);
		 
		 
		 
		 

		
	}
	@Test(enabled=false)
	public void modifyCampaignTC_06()
	{
		
		ExtentTest test=report.startTest("createCampaignTC_06");
		String campaignName=FileLib.readData("TC_06", 1, 0);
		String expRes=FileLib.readData("TC_06", 1, 1);
		
		
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		CampaignsPage cp=PageFactory.initElements(driver, CampaignsPage.class);
		CreateNewCampaignPage cncp=PageFactory.initElements(driver, CreateNewCampaignPage.class);
		CommonLibrary cl=PageFactory.initElements(driver,CommonLibrary.class );
		
		hp.placeCursorOnMore();
		 hp.clickOnCampaigns();
		 cp.clickOnCreateicon();
		 cncp.enterCampaignName(campaignName);
		 cncp.clickOnCancel();
		 
		 String actRes=cl.getCurrentPageTitle();
		  Assert.assertEquals(actRes, expRes);
		  report.endTest(test);
		 
		  
		
	}
	
}
