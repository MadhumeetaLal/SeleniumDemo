package com.guru99.testNGclasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_LoginPage extends SupertestNG {
	
	@Test (priority = 0)
	public void test_LoginPage_VerifyLogin(){
		System.out.println("1st test case");
		String LoginPageTitle = objLoginPage.getLoginTitle();
		Assert.assertTrue(LoginPageTitle.toLowerCase().contains("guru99 bank"));
		Reporter.log("Title of login page is:"+LoginPageTitle.toLowerCase(), true);
		Reporter.log("User is logged in successfully and the login page is also verified", true);
	} // end of test
	
}// end of class
