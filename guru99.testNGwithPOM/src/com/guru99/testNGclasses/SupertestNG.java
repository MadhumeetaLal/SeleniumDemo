package com.guru99.testNGclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.guru99.POMclasses.HomePage;
import com.guru99.POMclasses.LoginPage;


public class SupertestNG {
	
	public WebDriver driver;
	public LoginPage objLoginPage;
	public HomePage objHomePage;
	
	@BeforeMethod
	public void precondition()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		objLoginPage=new LoginPage(driver);
		Reporter.log("Application is loaded", true);
		objLoginPage.loginToGuru99("mngr16258","12345");
		
		Reporter.log("User is logged in successfully", true);
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
		Reporter.log("Application is logged out", true);
	}
	
	public void abc(){
		
	}
}
