package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_007 extends BaseClass{
@Test
public void gifts()
{
	driver.findElement(By.partialLinkText("Gift Cards")).click();
	Reporter.log("navigated to gifts page successfully", true);
}
}
