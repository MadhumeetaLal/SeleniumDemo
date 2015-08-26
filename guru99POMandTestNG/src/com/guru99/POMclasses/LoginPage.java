package com.guru99.POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
	WebDriver driver;
	 //declaration of attributes or elements
	
    By loginName = By.name("uid");
    By loginPassword = By.name("password");
    By titleText =By.className("barone");
    By loginbtn = By.name("btnLogin");
 
    public LoginPage(WebDriver driver){
   
        this.driver = driver;
 
    }
 
    //Set user name in textbox
 
    public void setUserName(String strUserName){
 
    	driver.findElement(loginName).sendKeys(strUserName);
 
    }
 
    //Set password in password textbox
 
    public void setPassword(String strPassword){
 
    	driver.findElement(loginPassword).sendKeys(strPassword);
 
    }
 
    //Click on login button
 
    public void clickLogin(){
 
    	driver.findElement(loginbtn).click();
 
    }
 
    //Get the title of Login Page
 
    public String getLoginTitle(){
 
     return    driver.findElement(titleText).getText();
 
    }
 
    /**
 
     * This POM method will be exposed in test case to login in the application
 
     * @param strUserName
 
     * @param strPasword
 
     * @return
 
     */
 
    public void loginToGuru99(String strUserName,String strPasword){
 
        //Fill user name
 
        this.setUserName(strUserName);
 
        //Fill password
 
        this.setPassword(strPasword);
 
        //Click Login button
 
        this.clickLogin();        
 
         
 
    }

}
