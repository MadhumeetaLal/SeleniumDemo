package com.guru99.POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass {
	//Elements:-
		WebDriver driver;	 
	    By homePageWelcomeText = By.xpath("//marquee");
	    By homePageManagerIDText = By.xpath("//table//table/tbody/tr[3]/td");
	 
	    //Methods and constructor:-
	    
	    //Parameterized constructor initializing the driver
	    public HomePage(WebDriver driver){
	    	super(driver);
	        this.driver = driver;
	    }
	 
	    //Get the User name from Home Page
			public String getHomePageDashboardWelcomeText() {			
				String msg = driver.findElement(homePageWelcomeText).getText();
				System.out.println(msg);
				return msg;
			}
			
		
			//Get the User name from Home Page
			public String getManagerIDText() {			
				String mngrIDtxt = driver.findElement(homePageManagerIDText).getText();
				System.out.println(mngrIDtxt);
				return mngrIDtxt;
			}
	        
	     //clicking on the sidebar links

}

