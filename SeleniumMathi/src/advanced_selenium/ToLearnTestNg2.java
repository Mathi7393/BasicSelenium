package advanced_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg2 {
	WebDriver driver;

	@Test(priority = -3,enabled=false)
	public void cricguzz() {
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got Executed", true);
		driver.quit();
	}

	@Test(invocationCount = 3)
	public void baskinRobbins() {
		driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got Executed", true);
		driver.quit();
	}

	@Test
	public void amazon() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got Executed", true);
		driver.quit();
	}
}
