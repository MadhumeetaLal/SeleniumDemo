package ABC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//DRAG AND DROP
		
		/* // Launch website
		driver.navigate().to("http://www.keenthemes.com/preview/metronic/theme/templates/admin/ui_tree.html");
		driver.manage().window().maximize();
		
		
		//creating web element objects of source and destination items
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='j3_7']/a"));  // locate the element "Disabled node"
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='j3_1']/a"));  // locate the element "Parent node"
		
		//Creating object for Actions class
		Actions objactions = new Actions(driver);
		
		//Creating draganddrop object
		Action DragandDrop = objactions.clickAndHold(element1).moveToElement(element2).release(element2).build();  // action defined
		
		DragandDrop.perform();  //perform the action
*/	
		
		//DRAG AND DROP WITHIN A FRAME
		driver.get("http://jqueryui.com/droppable/#default&rdquo");
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		 WebElement Element1 = driver.findElement(By.id("draggable"));
		 WebElement Element2 = driver.findElement(By.id("droppable"));
		 
		
		Actions objActions=new Actions(driver);
		
		Action dragAndDrop  = objActions.clickAndHold(Element1).moveToElement(Element2).release(Element2).build();//.build();
		dragAndDrop.perform();
		
	}

}
