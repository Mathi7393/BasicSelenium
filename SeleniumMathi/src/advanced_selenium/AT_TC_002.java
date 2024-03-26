package advanced_selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AT_TC_002 extends BaseClass{
	// Expected Data
			String expectedReportsPageTitle = "actiTIME -  Reports Dashboard";
	@Test
	public void TestCase001() {
		driver.findElement(By.linkText("Reports")).click();
		String actualreportsPageTitle = driver.getTitle();
		if (actualreportsPageTitle.equals(expectedReportsPageTitle)) {
			Reporter.log("Reports page displayed Sucessfully");
		} else {
			Reporter.log("reports page is not displayed");
		}
	}
}
