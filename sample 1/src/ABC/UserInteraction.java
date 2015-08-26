package ABC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class UserInteraction {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
	/*1	// TEXTBOX INTERACTION
		
	      // Puts a Implicit wait, Will wait for 10 seconds before throwing exception
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Launch website
		driver.navigate().to("http://www.calculator.net/percent-calculator.html");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Enter value 10 in the first number of the percent Calculator and 200 in the second number
		driver.findElement(By.id("cpar1")).sendKeys("10");
		//driver.findElement(By.id("cpar2")).sendKeys("200");
		
		//enter value in the 3rd textbox
		driver.findElement(By.id("cpar3")).sendKeys("20");
		
		//click on the calculate button
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
		
	1*/	
		
	/*2	//RADIO BUTTON INTERACTION
		
		//Launch website
		
		driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
		driver.manage().window().maximize();
		
		// Click on Radio Button
		driver.findElement(By.id("cpayoff1")).click();
		
		//Click on calculate button
		driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	2*/
		
	/*3	//CHECKBOX INTERACTION

		//Launch website
		driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
		driver.manage().window().maximize();
		
		//Click on check Box
		driver.findElement(By.id("caddoptional")).click();
		
		System.out.println(""+ driver.findElement(By.id("caddoptional")).isSelected());
		System.out.println(""+ driver.findElement(By.id("caddoptional")).isEnabled());
		System.out.println(""+ driver.findElement(By.id("caddoptional")).isDisplayed());
	3*/
		
		//DROP DOWN ITEM SELECTION
		
	/*4	//Launch website
		driver.navigate().to("http://www.calculator.net/interest-calculator.html");
		driver.manage().window().maximize();
		
		WebElement ddl;
		//Selecting an item from Drop Down list Box
		Select dropdownlist = new Select(ddl=driver.findElement(By.id("ccompound")));
		dropdownlist.selectByVisibleText("monthly");
		
		System.out.println(""+ddl.isSelected());
		System.out.println(""+ddl.isEnabled());
		System.out.println(""+ddl.isDisplayed());
		driver.quit();

	4*/
		
		//SYNCRONIZATION
		
		/*Thread.sleep		 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Will wait for 1 second.
		
		*/
		
		
		/* explicit wait
		driver.navigate().to("http://www.cnn.com");
		WebElement DynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("DynamicElement")));
		*/
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	/*5	//DRAG AND DROP
		
		 // Launch website
		driver.navigate().to("http://www.keenthemes.com/preview/metronic/theme/templates/admin/ui_tree.html");
		driver.manage().window().maximize();
		
		//creating web element objects of source and destination items
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='j3_7']/a"));
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));
		
		//Creating object for Actions class
		Actions objactions = new Actions(driver);
		
		//Creating draganddrop object
		Action DragandDrop = objactions.clickAndHold(element1).moveToElement(element2).release(element2).build();
		
		DragandDrop.perform();
	5*/	
		
	/*6	//HANDLING MULTISELECT COMBOBOX
		driver.navigate().to("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ContentHolder_lbSelectionMode_B-1Img")).click();
		driver.findElement(By.id("ContentHolder_lbSelectionMode_DDD_L_LBI1T0")).click();
		
		// Perform Multiple Select
		Actions Objactions1 = new Actions(driver);
		WebElement elementMultiselect = driver.findElement(By.xpath(".//*[@id='ContentHolder_lbFeatures']"));
		List<WebElement> ListOptions = elementMultiselect.findElements(By.tagName("td"));
		
		System.out.println("No of options:"+ ListOptions.size());
		
		Action doMultiSelect=Objactions1.keyDown(Keys.CONTROL).click(ListOptions.get(2)).click(ListOptions.get(3)).click(ListOptions.get(5)).build();
		doMultiSelect.perform();
	6*/	
		
	
	   
	

	}//

}//
