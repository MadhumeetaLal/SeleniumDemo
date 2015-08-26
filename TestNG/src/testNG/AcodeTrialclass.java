package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class AcodeTrialclass {
	
	WebDriver driver = new FirefoxDriver();
	
	
	@Test
	public void Home_Page_Appear_Correct()
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/V4/");
	driver.findElement(By.name("uid")).sendKeys("mngr14743  ");//this id pwd will be active only for next 20 days dated from 3rdJuly2015
	driver.findElement(By.name("password")).sendKeys("12345");//this id pwd will be active only for next 20 days dated from 3rdJuly2015
	
	driver.findElement(By.name("btnLogin")).click();
	}
}
