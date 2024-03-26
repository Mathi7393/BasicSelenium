package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ToLaunchPorsche {
	@Test(groups = "system")
	public void launchPorsche()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.porsche.com/middle-east/_india_/");
	}
}
