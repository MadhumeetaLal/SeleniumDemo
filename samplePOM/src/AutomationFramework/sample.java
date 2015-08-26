package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class sample {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		driver.findElement(By.id("log")).sendKeys("madhu1");
		
		driver.findElement(By.id("pwd")).sendKeys("FNmkUnMjz1OE");
		driver.findElement(By.id("login")).click();
		System.out.println("IN");
		driver.findElement(By.xpath(".//*[@id='meta']/ul/li[2]/a")).click();
		System.out.println("OUT");
		// TODO Auto-generated method stub

	}

}