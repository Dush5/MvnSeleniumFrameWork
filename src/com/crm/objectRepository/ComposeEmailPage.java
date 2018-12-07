package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposeEmailPage 
{
	@FindBy(xpath="html/body/form/table/tbody/tr[7]/td/input[4]")
	private WebElement cancelButton;
	public void clickOnCancel()
	{
		cancelButton.click();
	}
	@FindBy(xpath="//input[@id='my_file_element']")
	private WebElement browseButton;
	public void clickOnBrowse()
	{
		browseButton.click();
	}
	@FindBy(xpath="//input[@class='crmbutton small delete']")
	private WebElement deleteButton;
	public void clickOnDelete()
	{
		deleteButton.click();
	}
	
	
	

}
