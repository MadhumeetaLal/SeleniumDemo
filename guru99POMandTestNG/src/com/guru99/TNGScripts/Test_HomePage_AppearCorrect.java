package com.guru99.TNGScripts;



import org.testng.annotations.Test;


/*import com.guru99.POMclasses.Guru99BankManagerHomePage;
import com.guru99.POMclasses.LoginPage;*/

public class Test_HomePage_AppearCorrect extends SuperTestNG {
	//Create objects for login page and home page
		
		
	@Test
	public void test_HomePage_LoginLogout(){
	
		objLoginPage.loginToGuru99("mngr14743", "12345");
		/*//objLoginPage.loginToGuru99("mngr14743", "12345");
		String LoginPageTitle = objLoginPage.getLoginTitle();
		Assert.assertTrue(LoginPageTitle.toLowerCase().contains("guru99 bank"));
		Reporter.log("Title of login page is:"+LoginPageTitle.toLowerCase(), true);
		Reporter.log("User is logged in successfully and the login page is also verified", true);*/
		
	}
	/*@Test
	public void test_HomePage_Verify_text_display()
	{
		String Welcometxt = objGuru99BankManagerHomePage.getHomePageDashboardWelcomeText();
		String Expectedtxt = "Welcome To Manager's Page of Guru99 Bank";
		boolean value = Welcometxt.equals(Expectedtxt);
		value= true;
	}*/
	}

	/*
	
	//Verify login page title
	 
	 
	 
	 
	  Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
 
    //login to application
 
    objLoginPage.loginToGuru99("mngr14743", "12345");
 
    // go the next page
 
    objGuru99BankManagerHomePage = new Guru99BankManagerHomePage(driver);
 
    //Verify home page
 
    Assert.assertTrue(objGuru99BankManagerHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
 
    }*/

