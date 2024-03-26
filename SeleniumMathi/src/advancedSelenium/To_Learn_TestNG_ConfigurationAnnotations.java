package advancedSelenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class To_Learn_TestNG_ConfigurationAnnotations {

	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("beforesuite got executed",true);
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("aftersuite got executed",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("beforetest got executed",true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("aftertest got executed",true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("beforeclass got executed",true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("afterclass got executed",true);
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("beforemethod got executed",true);
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("aftermethod got executed",true);
	}
	@Test
	public void testCase001()
	{
		Reporter.log("testcase got Executed",true);
	}
}
