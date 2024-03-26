package advancedSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_TestNG_Threadpoolsize {

	@Test(priority = 2, invocationCount = 5, threadPoolSize = 2)
	public void cricbuzz()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed", true);
		driver.quit();
	}
	
	@Test(priority = 1, invocationCount = 10, threadPoolSize = 3)
	public void baskinRobbins()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}
	
	@Test(priority = -1, invocationCount = 6, threadPoolSize = 5)
	public void amazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Reporter.log("amazon got executed", true);
		driver.quit();
	}
	
}
