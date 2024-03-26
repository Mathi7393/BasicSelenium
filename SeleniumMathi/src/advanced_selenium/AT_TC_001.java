package advanced_selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AT_TC_001 extends BaseClass {
	// Expected Data
		String expectedTaskPageTitle = "actiTIME -  Task List";
	@Test
	public void TestCase001() {
		driver.findElement(By.linkText("Tasks")).click();
		String actualTaskPageTitle = driver.getTitle();
		if (actualTaskPageTitle.equals(expectedTaskPageTitle)) {
			Reporter.log("Taskpage displayed Sucessfully");
		} else {
			Reporter.log("Taskpage is not displayed");
		}
	}
}
