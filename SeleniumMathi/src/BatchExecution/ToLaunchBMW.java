package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ToLaunchBMW {
	@Test(groups = "smoke")
	public void launchBMW()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bmw.in/en/index.html");
	driver.quit();
	}
}
