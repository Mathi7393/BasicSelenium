package advancedSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_TestNG_InvocationCount {

	//invocation count checks how many times we give, that much times it run..eg(invocationCount=3)..it run 3 times
	@Test(invocationCount = 2,priority = 2)
	public void cricbuzz()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed", true);
	}
	
	@Test(invocationCount = 3,priority = 1)
	public void baskinRobbins()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
	}
	
	@Test(invocationCount = 4,priority = 3)
	public void amazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Reporter.log("amazon got executed", true);
	}
}
