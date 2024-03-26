package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_005 extends BaseClass {
@Test
public void downloads()
{
	driver.findElement(By.partialLinkText("Digital downloads")).click();
	Reporter.log("navigated to digital page successfully", true);
}
}
