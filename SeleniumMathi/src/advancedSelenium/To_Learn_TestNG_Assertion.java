package advancedSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class To_Learn_TestNG_Assertion {
@Test
public void validation() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.woodenstreet.com/");
	driver.findElement(By.id("loginclose1")).click();
	String actualtitle="Furniture Online: Buy Wooden Furniture Online for Home in India - WoodenStreet";
	String expectedtitle = driver.getTitle();
	System.out.println(expectedtitle);
	//	if (pagetitle.equals(title)) {
//		Reporter.log(pagetitle, true);
//	}
//	
//	else
//	{
//		Reporter.log("not matching" + title,true);
//	}
	Assert.assertEquals(actualtitle, expectedtitle,"title not matched");
	Reporter.log("successfully opened", true);
	Thread.sleep(5000);
	driver.quit();
}
}
