package ABC;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class2 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
/*//-------------------------------
							//	BASICS
							//-------------------------------
							
		//driver.navigate().to("http://www.yahoo.com");
		//driver.navigate().back();
		
		//Locate the google textbox
		WebElement textbox = driver.findElement(By.xpath("//div[@id='gs_lc0']/input[1]"));
		textbox.sendKeys("selenium");
		//textbox.submit();
		
		//Locate the search button
		WebElement button = driver.findElement(By.xpath("//div/button[@class='lsb']"));
		button.click();
		WebElement searchlink = driver.findElement(By.xpath(".//*[@id='uid_0']/div[1]/ol/li[2]/div/div/h3/a"));
		searchlink.click();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.toolsqa.com/automation-practice-form/");
		
		// Find how many textboxes are present in the page
		String xp = "//input[@type='text']";
		List<WebElement> a = driver.findElements(By.xpath(xp));
		int count=a.size();
		System.out.println("No of Textboxes present in the page:"+count);*/
		
		/*
		---------------------------------------------
							POP UPS
		---------------------------------------------
		*/
/*// HIDDEN DIVISION POP UP
		
		driver.navigate().to("http://www.yatra.com/");
		
		driver.findElement(By.xpath("//input[@id ='BE_flight_origin_city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id ='BE_flight_arrival_city']")).sendKeys("Ranchi");
		driver.findElement(By.xpath("//input[@id ='BE_flight_depart_date']")).click();
		driver.findElement(By.xpath(".//*[@id='td_2015_7_1']")).click();*/
		
		/*//FILE UPLOAD POP UP
		
		driver.navigate().to("http://www.2shared.com/");
		driver.findElement(By.id("upField")).sendKeys("/Users/madhumeetalal/Desktop/testing/iOS and Android.odt");
		driver.findElement(By.xpath("//input[@title='Upload file']")).click();
		//If it is not logged in 
		driver.findElement(By.xpath("//button[@type='submit']")).click();//click on the sig up button
		driver.findElement(By.id("login")).sendKeys("testacc23515@gmail.com");//enter email
		driver.findElement(By.id("password")).sendKeys("12345");//enter password
		driver.findElement(By.id("password2")).sendKeys("12345");//re enter password
		driver.findElement(By.xpath("//button[@type='submit']")).click();//submit
		
		driver.findElement(By.xpath("//button[@value='Close']")).click();//close the dialog
		
		//If user has already signed Up
		driver.findElement(By.xpath("//input[@src='/images/butUploadIt.gif']")).click();//click on upload button
        driver.findElement(By.xpath("//a[text()='I already have account']")).click(); // click on i already hav a account link
        driver.findElement(By.id("login")).sendKeys("testacc22515@gmail.com"); //enter emailid
        driver.findElement(By.id("password")).sendKeys("12345");  //enter password
        driver.findElement(By.xpath("//button[@type='submit']")).click(); //enter submit button
*/		
		
		
		
		
		
		
/*//ALERT POP UP
		
		driver.navigate().to("https://www.services.irctc.co.in/");
		driver.findElement(By.id("button")).click();
		try
		{
			Alert a1= driver.switchTo().alert();  //switiching to alert
			//System.out.println("Alert is present");
			String msg=a1.getText(); // getting the text from the alert
			System.out.println(msg); // prints the message from the alert
			a1.accept();  // final tag to execute the alert statement
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("Alert is not present");
		}
		
		driver.navigate().to("http://www.actimind.com/");
		driver.findElement(By.xpath("//a[@href='contact.php']")).click();
		driver.findElement(By.xpath("//input[@value='Submit Request']")).click();
		try
		{
			Alert a1=driver.switchTo().alert();
			String msg1=a1.getText();
			System.out.println(msg1);
			a1.accept();
					
		}
		catch(Exception e)
		{
			System.out.println("Probably Alert is not present");
		}*/
		
		
		
		//FILE DOWNLOAD POP UP
		
		//use autoit
		
		
		//CHILD BROWSER POP UP
		
		driver.navigate().to("http://www.rediff.com");
		Set<String> a = driver.getWindowHandles();
		System.out.println("Browser count:"+a.size());
		Iterator<String> b = a.iterator();
		//Printing allthe window
		while(b.hasNext())
		{
			String w=b.next();
			System.out.println(w);
			 
		}
		//closing all the windows
		Iterator<String> b1 = a.iterator();
		while(b1.hasNext())
		{
			String w=b1.next();
			driver.switchTo().window(w);
			System.out.println(w);
			driver.close();
			 
		}
		

}//End of main method

	

}//End of class2


