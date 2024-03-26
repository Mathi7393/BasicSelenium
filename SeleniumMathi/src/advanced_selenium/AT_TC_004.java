package advanced_selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AT_TC_004 extends BaseClass {
	// Expected Data
				String expectedTimeTrackPageTitle = "actiTIME -  Enter Time-Track";
			@Test
			public void TestCase001() {
				driver.findElement(By.linkText("Time-Track")).click();
				String actualTimeTrackPageTitle = driver.getTitle();
				if (actualTimeTrackPageTitle.equals(expectedTimeTrackPageTitle)) {
					Reporter.log("TimeTrack page displayed Sucessfully");
				} else {
					Reporter.log("TimeTrack page is not displayed");
				}
			}
}
