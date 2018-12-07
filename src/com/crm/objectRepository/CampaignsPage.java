package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignsPage 
{
  @FindBy(xpath="//img[@title='Create Campaign...']")
  private WebElement createIcon;
  public void clickOnCreateicon() 
  {
	  createIcon.click();
  }
  
  
}
