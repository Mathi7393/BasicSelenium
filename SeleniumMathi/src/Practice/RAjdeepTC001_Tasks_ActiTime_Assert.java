package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RAjdeepTC001_Tasks_ActiTime_Assert extends RajdeepAssert_ActiTime_BaseClass {
	@Test
	public void validate_Tasks() {
		WebElement TaskButton = driver.findElement(By.linkText("Tasks"));
		TaskButton.click();
		
		ActualTaskList = driver.getTitle();
		Assert.assertEquals(ActualTaskList, ExpectedTaskList, "TaskList Displaying Failed");
	}

}