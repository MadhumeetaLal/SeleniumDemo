package com.guru99.TNGScripts;

import java.util.concurrent.TimeUnit;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.guru99.POMclasses.Guru99BankManagerHomePage;
import com.guru99.POMclasses.LoginPage;
//import com.guru99.POMclasses.LoginPage;

public class SuperTestNG {            //This class will have Before and after method implementation
    public WebDriver driver;
	LoginPage objLoginPage=new LoginPage(driver);
	Guru99BankManagerHomePage objGuru99BankManagerHomePage=new Guru99BankManagerHomePage(driver);
	
	@BeforeMethod
	public void precondition()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		//System.out.println("application is opened");
		
		
		Reporter.log("Application is loaded", true);
		objLoginPage.loginToGuru99("mngr14743", "12345");
		Reporter.log("Application is logged in", true);
		
	}
	@AfterMethod
	public void postcondition()
	{
		//driver.quit();
		//Reporter.log("Application is logged out", true);
	}

	/*public static void main(String[] args) {
		// NOT REQUIRED
	}*/

}
