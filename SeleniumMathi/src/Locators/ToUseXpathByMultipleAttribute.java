
package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByMultipleAttribute {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("details-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and @value='Search store']")).sendKeys("computing and internet");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-item']"));
		System.out.println(productList.size());
	}

}
