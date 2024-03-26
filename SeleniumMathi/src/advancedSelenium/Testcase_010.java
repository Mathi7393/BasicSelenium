package advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_010 extends BaseClass {
@Test
public void categories()
{
	List<WebElement> category = driver.findElements(By.xpath("//ul[@class='top-menu']"));
for(WebElement ele:category)
{
	Reporter.log(ele.getText(), true);
	Reporter.log("categories are entered successfully", true);
}
}
}
