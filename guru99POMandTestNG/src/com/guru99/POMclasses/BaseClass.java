package com.guru99.POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	WebDriver driver;
	//declaration of attributes or elements
	
	By titleText =By.className("barone");
	By managerLink=By.xpath("//a[@href='Managerhomepage.php']");
	By newCustomerLink=By.xpath("//a[@href='addcustomerpage.php']");
	By editCustomerLink=By.xpath("//a[@href='EditCustomer.php']");
	By deleteCustomerLink=By.xpath("//a[@href='DeleteCustomerInput.php']");
	By newAccountLink=By.xpath("//a[@href='addAccount.php']");
	By editAccountLink=By.xpath("//a[@href='editAccount.php']");
	By deleteAccountLink=By.xpath("//a[@href='deleteAccountInput.php']");
	By depositLink=By.xpath("//a[@href='DepositInput.php']");
	By withdrawalLink=By.xpath("//a[@href='WithdrawalInput.php']");
	By fundTransferLink=By.xpath("//a[@href='FundTransInput.php']");
	By changePassword=By.xpath("//a[@href='PasswordInput.php']");
	By balanceEnquiry=By.xpath("//a[@href='BalEnqInput.php']");
	By miniStatement=By.xpath("//a[@href='MiniStatementInput.php']");
	By customisedStatement=By.xpath("//a[@href='CustomisedStatementInput.php']");
	By logout=By.xpath("//a[@href='Logout.php']");
	By homeLink=By.xpath("//a[text()='Home']");
	
	
	//Constructor
	public BaseClass(WebDriver driver){
		this.driver = driver;
	}
	
	
	//Methods
	
	public void clickManagerLink(WebDriver driver){
		driver.findElement(managerLink).click();
	}

	public void clickNewCustomerLink(WebDriver driver){
		driver.findElement(newCustomerLink).click();
	}
	
	public void clickEditcustomerLink(WebDriver driver){
		driver.findElement(editCustomerLink).click();
	}
	
	public void clickNewAccountLink(WebDriver driver){
		driver.findElement(newAccountLink).click();
	}

	public void clickEditAccountLink(WebDriver driver){
		driver.findElement(editAccountLink).click();
	}

	public void clickDeleteAccountLink(WebDriver driver){
		driver.findElement(deleteAccountLink).click();
     }

	public void clickDepositLink(WebDriver driver){
		driver.findElement(depositLink).click();
	}
	
	public void clickWithdrawalLink(WebDriver driver){
		driver.findElement(withdrawalLink).click();
	}

	public void clickFundTransferLink(WebDriver driver){
		driver.findElement(fundTransferLink).click();
	}

	public void clickChangePassword(WebDriver driver){
		driver.findElement(changePassword).click();
	}
	
	public void clickBalanceEnquiry(WebDriver driver){
		driver.findElement(balanceEnquiry).click();
	}
	public void clickMiniStatement(WebDriver driver){
		driver.findElement(miniStatement).click();
	}
	public void clickCustomisedStatement(WebDriver driver){
		driver.findElement(customisedStatement).click();
	}
	public void clickLogout(WebDriver driver){
		driver.findElement(logout).click();
	}
	public void clickHomeLink(WebDriver driver){
		driver.findElement(homeLink).click();
	}

} //end of class
