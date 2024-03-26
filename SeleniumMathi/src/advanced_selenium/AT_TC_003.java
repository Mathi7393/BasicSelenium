package advanced_selenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AT_TC_003 extends BaseClass {
	// Expected Data
			String expectedUsersListPageTitle = "actiTIME -  User List ";
		@Test
		public void TestCase001() {
			driver.findElement(By.linkText("Users")).click();
			String actualUsersListPageTitle = driver.getTitle();
			if (actualUsersListPageTitle.equals(expectedUsersListPageTitle)) {
				Reporter.log("UsersList page displayed Sucessfully");
			} else {
				Reporter.log("UsersList page is not displayed");
			}
		}
}
