package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage 
{
   @FindBy(xpath="//input[@id='3']")
   private WebElement contactsCheckBox;
   public void clickOnCheckbox()
   {
	   contactsCheckBox.click();
   }
   @FindBy(xpath="//table[@class='small']/tbody/tr/td/input[@value='Send Mail']")
   private WebElement sendmailButton;
   public void clickOnSendmail()
   {
	   sendmailButton.click();
   }
   @FindBy(xpath="//input[@name='Select']")
   private WebElement selectButton;
   public void clickOnSelect()
   {
	   selectButton.click();
   }
   
   
   
}
