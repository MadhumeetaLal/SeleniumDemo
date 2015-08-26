package com.guru99.POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Bank_NewCustomerEntryPage extends BaseClass {
	//Elements:-
	WebDriver driver;
	By customername = By.name("name");
	By genderMale = By.xpath("//input[@value='m']");
	By genderFemale = By.xpath("//input[@value='n']");
	By dateofbirth = By.id("dob");
	By address = By.name("addr");
	By city = By.name("city");
	By state = By.name("state");
	By pin = By.name("pinno");
	By mobileno = By.name("telephoneno");
	By email = By.name("emailid");
	By password = By.name("password");
	By submitbtn = By.xpath("//input[@value='Submit']");
	By resetbtn = By.xpath("//input[@value='Reset']");
	
	//cunstructor
	public Guru99Bank_NewCustomerEntryPage(WebDriver driver){
		super(driver);
        this.driver = driver;
 
    }

	//methods
	public void submitNewCustomer(){
		// fill the form for the new customer
		driver.findElement(customername).sendKeys("Annand");
		driver.findElement(genderMale).click();
		driver.findElement(dateofbirth).sendKeys("11/09/1986");
		driver.findElement(address).sendKeys("house no qwe, abc layout,xyz road , nth cross");
		driver.findElement(city).sendKeys("Chennai");
		driver.findElement(state).sendKeys("Tamilnadu");
		driver.findElement(pin).sendKeys("680008");
		driver.findElement(mobileno).sendKeys("1234567890");
		driver.findElement(email).sendKeys("mngr14743");
		driver.findElement(password).sendKeys("12345");
		driver.findElement(submitbtn).click();
		driver.findElement(resetbtn).click();
		
	}
	
}
