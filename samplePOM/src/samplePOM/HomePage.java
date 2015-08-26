package samplePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;

	public static WebElement lnk_MyAccount(WebDriver driver) {

		element = driver.findElement(By.xpath(".//*[@id='account']/a"));  //(".//*[@id='account']/a"));

		return element;
	}

	public static WebElement lnk_LogOut(WebDriver driver) {

		element = driver.findElement(By.id("account_logout"));

		return element;

	}

}
