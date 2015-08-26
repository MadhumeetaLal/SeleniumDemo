package ABC;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 
{
  @Test(priority=1)
 /* public void f() 
  {
	  Reporter.log("Display", true);
  }*/
  public void login()
  {
	  Reporter.log("Login", true);
  }
  @Test(priority=2)
  public void create()
  {
	  Reporter.log("Create", true);
  }
  @Test(priority=3)
  public void logout()
  {
	  Reporter.log("logout",true);
  }
}
