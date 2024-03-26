package advancedSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_TestNG_Enabled {

	@Test
	public void cricbuzz()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed", true);
		driver.quit();
	}
	
	//if we give false it skip the particular testcase
	//if we give true it wont skip the particular testcase
	@Test(enabled = false)
	public void baskinRobbins()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed", true);
		driver.quit();
	}
	
	@Test
	public void amazon()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Reporter.log("amazon got executed", true);
		driver.quit();
	}
	
}
