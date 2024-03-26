package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_008 extends BaseClass {
@Test
public void contact()
{
	driver.findElement(By.linkText("Contact us")).click();
	Reporter.log("navigated to contactus page successfully", true);
}
}
