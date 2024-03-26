package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTextActitime {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		Driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		String ErrorMessage = Driver.findElement(By.className("errormsg")).getText();
		System.out.println(ErrorMessage);
	}

}
