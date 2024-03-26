package Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebShopDropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement positionDropDown = driver.findElement(By.id("products-orderby"));
		Select positionDD = new Select(positionDropDown);
		positionDD.selectByVisibleText("Price: Low to High");
		WebElement pagesDropDown = driver.findElement(By.id("products-pagesize"));
		Select pageDD = new Select(pagesDropDown);
		pageDD.selectByIndex(2);
		WebElement viewDropDown = driver.findElement(By.id("products-viewmode"));
		Select viewDD=new Select(viewDropDown);
		viewDD.selectByVisibleText("List");
	}

}
//StaleElementReferenceException
//StaleElementReferenceException in Selenium is quite common with test execution for an environment with frequent changes.
//The exception implies that an element that was earlier present does not exist anymore on the page.
//it may occur because of the change in the page 