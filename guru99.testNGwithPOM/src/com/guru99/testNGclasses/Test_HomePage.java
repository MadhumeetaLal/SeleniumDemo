package com.guru99.testNGclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.guru99.testNGclasses.CommonFeaturesClass_TestCases;
import com.guru99.POMclasses.HomePage;
import com.guru99.POMclasses.LoginPage;

public class Test_HomePage extends SupertestNG {
	CommonFeaturesClass_TestCases objCommon;
	
	@Test (priority = 1)
	public void test_HomePage_VerifyWelcomeText(){
		objHomePage= new HomePage(driver);
		System.out.println("2nd test case");
		String HomePagetxt = objHomePage.getHomePageDashboardWelcomeText();
		Assert.assertTrue(HomePagetxt.contains("Welcome To Manager's Page of Guru99 Bank"));
		Reporter.log("Welcome text is:"+HomePagetxt, true);
		
	}
	
	@Test (priority = 2)
	public void test_HomePage_VerifyManagersID(){
		objHomePage= new HomePage(driver);
		System.out.println("3rd test case");
		String ManagerIDtxt = objHomePage.getManagerIDText();
		Assert.assertTrue(ManagerIDtxt.contains("Manger Id : mngr16258"));
		Reporter.log("Manager's ID is:"+ManagerIDtxt, true);
	}
	
	@Test (priority = 3)
	public void test_ClickingsidebarMenu(){
		System.out.println("4th test case");
		objCommon =new CommonFeaturesClass_TestCases(driver);
		objLoginPage=new LoginPage(driver);
		
		objCommon.test_click_newCustomerLink();
		driver.navigate().back();
		System.out.println("test_click_newCustomerLink is successful");
		objCommon.test_click_editCustomerLink();
		driver.navigate().back();
		System.out.println("test_click_editCustomerLink is successful");
		objCommon.test_click_deleteCustomerLink();
		driver.navigate().back();
		System.out.println("test_click_deleteCustomerLink is successful");
		objCommon.test_click_newAccountLink();
		driver.navigate().back();
		System.out.println("test_click_newAccountLink is successful");
		objCommon.test_click_editAccountLink();
		driver.navigate().back();
		System.out.println("test_click_editAccountLink is successful");
		objCommon.test_click_deleteAccountLink();
		driver.navigate().back();
		System.out.println("test_click_deleteAccountLink is successful");
		objCommon.test_click_depositLink();
		driver.navigate().back();
		System.out.println("test_click_depositLink is successful");
		objCommon.test_click_withdrawalLink();
		driver.navigate().back();
		System.out.println("test_click_withdrawalLink is successful");
		objCommon.test_click_fundTransferLink();
		driver.navigate().back();
		System.out.println("test_click_fundTransferLink is successful");
		objCommon.test_click_changePassword();
		driver.navigate().back();
		System.out.println("test_click_changePasswordLink is successful");
		objCommon.test_click_balanceEnquiry();
		driver.navigate().back();
		System.out.println("test_click_balanceEnquiryLink is successful");
		objCommon.test_click_miniStatement();
		driver.navigate().back();
		System.out.println("test_click_miniStatementLink is successful");
		objCommon.test_click_customisedStatement();
		driver.navigate().back();
		System.out.println("test_click_customisedStatementLink is successful");
		objCommon.test_click_Logout();
		System.out.println("test_click_LogoutLink is successful");
		String ManagerIDtxt = objHomePage.getManagerIDText();
		Assert.assertTrue(ManagerIDtxt.contains("Manger Id : mngr16258"));
		Reporter.log("Manager's ID is:"+ManagerIDtxt, true);
		objLoginPage.loginToGuru99("mngr16258","12345");
		
		
	}
	
	
	
}
