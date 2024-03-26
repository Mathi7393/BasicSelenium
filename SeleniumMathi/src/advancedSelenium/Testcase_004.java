package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_004 extends BaseClass {
@Test
public void appreals()
{
	driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
	Reporter.log("navigated to apparels page successfully", true);
}
}
