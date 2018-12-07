package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
@FindBy(name="user_name")
private WebElement userNameTextBox;
 public void enterUsername(String username)
 {
	 userNameTextBox.sendKeys(username);
 }

@FindBy(name="user_password")
private WebElement passwordTextBox;
public void enterPassword(String password)
{
	passwordTextBox.sendKeys(password);
}
 
@FindBy(id="submitButton")
private WebElement loginButton;
public void clickOnLogin()
{
	loginButton.click();
}
	
}

