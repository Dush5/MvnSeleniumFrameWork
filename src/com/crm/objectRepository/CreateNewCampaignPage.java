package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.genericLib.BaseClass;
import com.crm.genericLib.CommonLibrary;

public class CreateNewCampaignPage 
{
   @FindBy(xpath="//input[@name='campaignname']")
   private WebElement campaignTextBox;
   public void enterCampaignName(String campaignName)
   {
	   campaignTextBox.sendKeys(campaignName);
   }
   
   @FindBy(xpath="//input[@value='T']")
   private WebElement assignRadioButton;
   public void clickOnGroup()
   {
	 
	   assignRadioButton.click();
   }
   
 
  @FindBy(name="assigned_group_id")
  private WebElement assignDropdown;
  CommonLibrary cl=PageFactory.initElements(BaseClass.driver, CommonLibrary.class);
  public void selectDropdown(String groupName)
  {
	  cl.selectOptionFromDropdownByVisibleText(assignDropdown,groupName );
  }
  
  
  @FindBy(xpath="//input[@class='crmbutton small save']")
  private WebElement saveButton;
  public void clickOnSave()
  {
	  saveButton.click();
	  
  }
  @FindBy(xpath="//input[@class='crmbutton small cancel']")
  private WebElement cancelButton;
  public void clickOnCancel()
  {
	  cancelButton.click();
  }
  
  




}
