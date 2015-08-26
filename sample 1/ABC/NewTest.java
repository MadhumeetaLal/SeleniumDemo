package ABC;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class NewTest 
{
  @Test
  public void login()
  {
	  Reporter.log("Login", true);
  }
  public void create()
  {
	  Reporter.log("Create", true);
  }
  public void logout()
  {
	  Reporter.log("logout",true);
  }
  

}
