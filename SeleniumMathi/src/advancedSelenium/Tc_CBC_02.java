package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_CBC_02 extends BaseClass_crossCheckBrowser {
	@Test
	public void computers()
	{
		driver.findElement(By.partialLinkText("Computers")).click();
		Reporter.log("navigated to computers page successfully", true);
	}
}
