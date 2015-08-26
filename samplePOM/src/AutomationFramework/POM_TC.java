package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import samplePOM.HomePage;
import samplePOM.LoginPage;

public class POM_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

		// Use page Object library now

		HomePage.lnk_MyAccount(driver).click();

		
		LoginPage.txtbx_UserName(driver).sendKeys("madhu1");
		LoginPage.txtbx_Password(driver).sendKeys("FNmkUnMjz1OE");
		LoginPage.btn_LogIn(driver).click();
		/*
		String a = driver.getTitle();
		
		System.out.println(a);*/
		
		//VERIFY TITLE OF THE PAGE and hence verify successful login
		
		if (driver.getTitle().equals("Your Account | ONLINE STORE")) { 
			System.out.println("Login Successfully, now it is the time to Log Off buddy."); 
			} else { 
			System.out.println("Tests failed"); 
			} 
			
			

		HomePage.lnk_LogOut(driver).click();
		


		//driver.quit();

	}
}
