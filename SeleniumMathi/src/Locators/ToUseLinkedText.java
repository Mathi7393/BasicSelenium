package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseLinkedText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		Driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("Email")).sendKeys("Mathi");
		Thread.sleep(1000);
		Driver.findElement(By.id("Password")).sendKeys("Mathi@123");
		Thread.sleep(1000);
		Driver.findElement(By.id("RememberMe")).click();
	}

}
