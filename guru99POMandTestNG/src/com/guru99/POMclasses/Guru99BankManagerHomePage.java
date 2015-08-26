package com.guru99.POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99BankManagerHomePage extends BaseClass {
	//Elements:-
	WebDriver driver;	 
    By homePageWelcomeText = By.xpath("//marquee");
 
    //Methods and constructor:-
    
    //Parameterized constructor initializing the driver
    public Guru99BankManagerHomePage(WebDriver driver){
    	super(driver);
 
        this.driver = driver;
 
    }
 
    //Get the User name from Home Page
 
		public String getHomePageDashboardWelcomeText() {
			
			String msg = driver.findElement(homePageWelcomeText).getText();
			System.out.println(msg);
		
			return msg;
		}
        
     //clicking on the sidebar links

}
