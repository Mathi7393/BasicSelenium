package advancedSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_TestNG_DependsOnMethods {

	@Test
	public void createAccount()
	{
		Reporter.log("account created successfully", true);
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void editAccount()
	{
		Reporter.log("account edited successfully", true);
	}
	
	@Test(dependsOnMethods = "editAccount")
	public void deleteAccount()
	{
		Reporter.log("account deleted successfully", true);
	}
}
