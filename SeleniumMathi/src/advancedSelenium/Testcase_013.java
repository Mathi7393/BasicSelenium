package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_013 extends BaseClass{
@Test
public void subscribe()
{
	driver.findElement(By.id("newsletter-email")).sendKeys("kalai1234@gmail.com");
	driver.findElement(By.id("newsletter-subscribe-button")).click();
	String elements = driver.findElement(By.id("newsletter-result-block")).getText();
	Reporter.log(elements, true);
	Reporter.log("newsletter is subscribed successfully", true);
}
}
