package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_001 extends BaseClass { 
@Test
public void books()
{
	driver.findElement(By.partialLinkText("Books")).click();
	Reporter.log("Books got opened successfully", true);
}
}
