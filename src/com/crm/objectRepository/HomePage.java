package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.crm.genericLib.BaseClass;

public class HomePage 
{
	@FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']")
	private WebElement moreTab;
	
	public void placeCursorOnMore()
	{
		Actions a1=new Actions(BaseClass.driver);
		a1.moveToElement(moreTab).perform();
	}
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignsLink;
	
	 public void clickOnCampaigns()
	 {
		 campaignsLink.click();
	 }
	 @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	 private WebElement signoutIcon;
	 public void movecursorOnsignout()
	 {
		 Actions a1=new Actions(BaseClass.driver);
		 a1.moveToElement(signoutIcon).perform();
	 }
	@FindBy(linkText="Sign Out")
	private WebElement signoutLink;
	public void clickOnSignout()
	{
		signoutLink.click();
	}
	@FindBy(linkText="Contacts")
	private WebElement contactsTab;
	public void  clickOnContacts()
	{
		contactsTab.click();
	}

}
