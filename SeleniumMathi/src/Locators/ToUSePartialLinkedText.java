package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUSePartialLinkedText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Driver.findElement(By.partialLinkText("Books")).click();
	}
}
