package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToDemoWebShopper {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("Mathi12345@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Mathi@123");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
//		driver.findElement(By.className("login-button")).click();
		Thread.sleep(5000);
//		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
	}

}
