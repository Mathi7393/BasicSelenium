package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_002 extends BaseClass {

	@Test
	public void computers()
	{
		driver.findElement(By.partialLinkText("Computers")).click();
		Reporter.log("navigated to computers page successfully", true);
	}
}
