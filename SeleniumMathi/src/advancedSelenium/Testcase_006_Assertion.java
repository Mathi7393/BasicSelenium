package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase_006_Assertion /*extends BaseClass*/ {
@Test
public void jewels()
{
	
	int a=10;
	int b=15;
//	SoftAssert sa=new SoftAssert();
//	sa.assertEquals(a, b);
//	Assert.assertEquals(a, b);
//	SoftAssert assert1=new SoftAssert();
//	assert1.assertEquals(a, b);
	
	if (a==b) {
		System.out.println("Hai");
	}
//	else {
//		System.out.println("Bye");
//	}
//	driver.findElement(By.partialLinkText("Jewelry")).click();
//	Reporter.log("navigated to jewels page successfully",true);
//	System.out.println("Hai");
//	sa.assertAll();
//	assert1.assertAll();
	
}

@Test
public void m1() {
	Reporter.log("Hello from M1",true);
}


}
