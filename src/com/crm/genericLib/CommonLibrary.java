package com.crm.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonLibrary 
{
	public  String  getCurrentPageTitle()
	{
		 return BaseClass.driver.getTitle();
	}
	
	public String fetchAlertText()

	{
		String text=BaseClass.driver.switchTo().alert().getText();
		return text;
	}
	public void clickOnAlertOk()
	{
		BaseClass.driver.switchTo().alert().accept();
		
	}
	public void clickOnAlertCancel()
	{
		BaseClass.driver.switchTo().alert().dismiss();
	}
	public void selectOptionFromDropdownByIndex(WebElement dropDown,int index)
	{
		Select sdd=new Select(dropDown);
		sdd.selectByIndex(index);
	}
	public void selectOptionFromDropdownByValue(WebElement dropDown,String value)
	{
		Select sdd=new Select(dropDown);
		sdd.selectByValue(value);
	}
	public void selectOptionFromDropdownByVisibleText(WebElement dropDown,String visibleText)
	{
		Select sdd=new Select(dropDown);
		sdd.selectByVisibleText(visibleText);
	}

}
