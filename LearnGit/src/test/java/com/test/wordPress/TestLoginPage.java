package com.test.wordPress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordPress.Page.LoginPage;

public class TestLoginPage 
{
	WebDriver objDriver;
	
	@Test
	public void TestLoginPage()
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		objDriver = new ChromeDriver();
		objDriver.get("http://demosite.center/wordpress/wp-login.php");
		objDriver.manage().window().maximize();
		objDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		LoginPage objLoginPage = new LoginPage(objDriver);
		
		objLoginPage.enterUserName();
		objLoginPage.enterPassword();
		objLoginPage.clickSubmit();
	}
	
}
