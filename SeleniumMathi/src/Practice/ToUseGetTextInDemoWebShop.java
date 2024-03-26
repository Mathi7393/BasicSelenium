package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTextInDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(1000);
	driver.findElement(By.className("login-button")).click();
	Thread.sleep(1000);
	String errMsg = driver.findElement(By.linkText("No customer account found")).getText();
	System.out.println(errMsg);
	}

}
