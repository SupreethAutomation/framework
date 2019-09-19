package com.wordPress.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver objWebDriver;
	
	public LoginPage(WebDriver objWebDriver) 
	{
		this.objWebDriver = objWebDriver;
	}
	By loginUserNameTextBox = By.id("user_login");
	By loginPasswordTextBox = By.id("user_pass");
	By loginSubmit = By.id("wp-submit");
	
	
	public void enterUserName()
	{
		objWebDriver.findElement(loginUserNameTextBox).sendKeys("pavitra");
	}
	
	public void enterPassword()
	{
		objWebDriver.findElement(loginPasswordTextBox).sendKeys("pavitra123");
	}
	
	public void clickSubmit()
	{
		objWebDriver.findElement(loginSubmit).click();
	}
}
