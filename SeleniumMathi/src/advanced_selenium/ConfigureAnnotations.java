package advanced_selenium;

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

public class ConfigureAnnotations {
	@BeforeSuite
	public void BeforeSuite(){
	Reporter.log("Before Suite got executed", true);
	}
	@AfterSuite
	public void AfterSuite(){
		Reporter.log("@After Suite got executed", true);
	}
	@BeforeTest
	public void BeforeTest(){
	Reporter.log("Before Test got executed", true);
	}
	@AfterTest
	public void AfterTest(){
		Reporter.log("After test got executed", true);
	}
	@BeforeClass
	public void BeforeClass(){
	Reporter.log("Before Class got executed", true);
	}
	@AfterClass
	public void AfterClass(){
		Reporter.log("After Class got executed", true);
	}
	@BeforeMethod
	public void BeforeMethod(){
	Reporter.log("Before Method got executed", true);
	}
	@AfterMethod
	public void AfterMethod(){
		Reporter.log("After Method got executed", true);
	}
	@Test
	public void TestMethod(){
		Reporter.log("TestMethod got executed", true);
	}
	
}
