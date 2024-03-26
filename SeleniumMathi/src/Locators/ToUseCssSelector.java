package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelector {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("Mathi@123");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mathi@123");
	}

}
