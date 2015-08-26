package com.guru99.POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	 
	//declaration of attributes or elements
   By loginName = By.name("uid");
   By loginPassword = By.name("password");
   By titleText =By.className("barone");
   By loginbtn = By.name("btnLogin");
   
   //constructor
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
   
   //login method
   public void loginToGuru99(String strUserName,String strPasword){
	   
       this.setUserName(strUserName); //Fill user name
       this.setPassword(strPasword); //Fill password
       this.clickLogin(); //Click Login button
   }

}
