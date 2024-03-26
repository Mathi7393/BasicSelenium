package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_012 extends BaseClass{
@Test
public void myaccount()
{
	driver.findElement(By.xpath("//a[@class='account']")).click();
	Reporter.log("it is navigated to myaccount page successfully", true);
}
}
