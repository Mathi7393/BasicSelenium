package advanced_selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AT_TC_005 extends BaseClass {
	// Expected Data
	String expectedViewTimeTrackPageTitle = "actiTIME -  View Time-Track";

	@Test
	public void TestCase001() {
		driver.findElement(By.linkText("View Time-Track")).click();
		String actualViewTimeTrackPageTitle = driver.getTitle();
		if (actualViewTimeTrackPageTitle.equals(expectedViewTimeTrackPageTitle)) {
			Reporter.log("View TimeTrack page displayed Sucessfully");
		} else {
			Reporter.log("View TimeTrack page is not displayed");
		}
	}
}
