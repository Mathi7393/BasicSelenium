package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_011 extends BaseClass{
@Test
public void addtocart()
{
	driver.findElement(By.partialLinkText("Books")).click();
	driver.findElement(By.linkText("Fiction")).click();
	driver.findElement(By.id("add-to-cart-button-45")).click();
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	driver.findElement(By.name("removefromcart")).click();
	driver.findElement(By.name("updatecart")).click();
	String textcopy = driver.findElement(By.className("order-summary-content")).getText();
	Reporter.log(textcopy, true);
	Reporter.log("addtocart is successfull", true);
}
}
