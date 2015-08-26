package com.guru99.testNGclasses;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import com.guru99.POMclasses.BaseClass;
import com.guru99.POMclasses.HomePage;


//this class consists of common test cases for all the pages
public class CommonFeaturesClass_TestCases {
    
	public WebDriver driver;
	public BaseClass objBaseClass;
	HomePage objHomePage; 
	
	
	//Constructor
	public CommonFeaturesClass_TestCases(WebDriver driver){
		this.driver = driver;
	}
	
	// Methods
	/*public void test_click_managerLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickManagerLink(driver);
		String HomePageTitle = driver.getTitle();
		Assert.assertTrue(HomePageTitle.toLowerCase().contains("Guru99 Bank Manager HomePage"));
		Reporter.log("User is navigated tohome Page successfully", true);
		driver.navigate().back();
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
*/	
	public void test_click_newCustomerLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickNewCustomerLink(driver);
		String NewCustomerPageTitle = driver.getTitle();
		Assert.assertTrue(NewCustomerPageTitle.contains("Guru99 Bank New Customer Entry Page"));
		Reporter.log("User is navigated to New Customer Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_editCustomerLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickEditcustomerLink(driver);
		String EditCustomerPageTitle = driver.getTitle();
		Assert.assertTrue(EditCustomerPageTitle.contains("Guru99 Bank Edit Customer Page"));
		Reporter.log("User is navigated to Edit Customer Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_deleteCustomerLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickDeleteCustomerLink(driver);
		String DeleteCustomerPageTitle = driver.getTitle();
		Assert.assertTrue(DeleteCustomerPageTitle.contains("Guru99 Bank Delete Customer Page"));
		Reporter.log("User is navigated to Delete Customer Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_newAccountLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickNewAccountLink(driver);
		String NewAccountPageTitle = driver.getTitle();
		Assert.assertTrue(NewAccountPageTitle.contains("Guru99 bank add new account"));
		Reporter.log("User is navigated to New Account Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_editAccountLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickEditAccountLink(driver);
		String EditAccountPageTitle = driver.getTitle();
		Assert.assertTrue(EditAccountPageTitle.contains("Guru99 Edit Account Page"));
		Reporter.log("User is navigated to Edit Account Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_deleteAccountLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickDeleteAccountLink(driver);
		String DeleteAccountPageTitle = driver.getTitle();
		Assert.assertTrue(DeleteAccountPageTitle.contains("Guru99 Bank Delete Account Page"));
		Reporter.log("User is navigated to Delete Account Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_depositLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickDepositLink(driver);
		String DepositPageTitle = driver.getTitle();
		Assert.assertTrue(DepositPageTitle.contains("Guru99 Bank Amount Deposit Page"));
		Reporter.log("User is navigated to Deposit Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_withdrawalLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickWithdrawalLink(driver);
		String WithdrawalPageTitle = driver.getTitle();
		Assert.assertTrue(WithdrawalPageTitle.contains("Guru99 Bank Amount Withdrawal Page"));
		Reporter.log("User is navigated to Withdrawal Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_fundTransferLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickFundTransferLink(driver);
		String FundTransferPageTitle = driver.getTitle();
		Assert.assertTrue(FundTransferPageTitle.contains("Guru99 Bank Fund Transfer Entry Page"));
		Reporter.log("User is navigated to Fund Transfer Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_changePassword(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickChangePassword(driver);
		String ChangePasswordPageTitle = driver.getTitle();
		Assert.assertTrue(ChangePasswordPageTitle.contains("Guru99 Bank New Customer Entry Page"));
		Reporter.log("User is navigated to Change password Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_balanceEnquiry(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickBalanceEnquiry(driver);
		String BalanceEnquiryPageTitle = driver.getTitle();
		Assert.assertTrue(BalanceEnquiryPageTitle.contains("Guru99 Bank Balance Enquiry Page"));
		Reporter.log("User is navigated Balance Enqiry Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_miniStatement(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickMiniStatement(driver);
		String MiniStatementPageTitle = driver.getTitle();
		Assert.assertTrue(MiniStatementPageTitle.contains("Guru99 Bank Mini Statement Page"));
		Reporter.log("User is navigated to Mini Statement Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_customisedStatement(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickCustomisedStatement(driver);
		String CustomisedStatementPageTitle = driver.getTitle();
		Assert.assertTrue(CustomisedStatementPageTitle.contains("Guru99 Bank Statement Page"));
		Reporter.log("User is navigated to Customised Statement Page successfully", true);
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	public void test_click_homeLink(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickHomeLink(driver);
		String HomePageTitle = driver.getTitle();
		Assert.assertTrue(HomePageTitle.contains("Guru99 Bank Manager HomePage"));
		Reporter.log("User is navigated to Manager HomePage successfully", true);
		
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test
	
	
	public void test_click_Logout(){
		objBaseClass = new BaseClass(driver);
		objBaseClass.clickLogout(driver);
		String LoginpageTitle = driver.getTitle();
		Assert.assertTrue(LoginpageTitle.contains("Guru99 Bank HomePage"));
		Reporter.log("User is navigated to Manager Login successfully", true);
		
		//String HomePageTitle = objHomePage.getLoginTitle();
	} // end of test

}
