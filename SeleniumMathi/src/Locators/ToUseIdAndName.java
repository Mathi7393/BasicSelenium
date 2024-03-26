package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdAndName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		Driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		Driver.findElement(By.name("pwd")).sendKeys("manager");
		Driver.findElement(By.id("loginButton")).click();
		
		

	}

}
