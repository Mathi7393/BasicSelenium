package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_003 extends BaseClass {

	@Test
	public void electronics()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		Reporter.log("navigated to electronics page successfully",true);
	}
}
