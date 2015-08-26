package ABC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NoPOMTest99GuruLogin 
{
	@Test
	public void Home_Page_Appear_Correct()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr14743  ");//this id pwd will be active only for next 20 days dated from 3rdJuly2015
		driver.findElement(By.name("password")).sendKeys("12345");//this id pwd will be active only for next 20 days dated from 3rdJuly2015
		
		driver.findElement(By.name("btnLogin")).click();
		
		String hometxt = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		System.out.println(hometxt);
		String titletxt = driver.getTitle();
		System.out.println("titletxt= "+titletxt);
		Assert.assertTrue(hometxt.toLowerCase().contains("guru99 bank"));
		driver.findElement(By.xpath("//a[@href='Managerhomepage.php']")).click();
		System.out.println("manager is clicked");
		driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
		String ename =driver.findElement(By.name("emailid")).getText();
		System.out.println(ename);
		String pwd =driver.findElement(By.name("password")).getText();
		System.out.println(pwd);
		
	}
}
