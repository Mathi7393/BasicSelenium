package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Mathi");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Azhagan");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("Mathi1234567@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Mathi@123");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Mathi@123");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).submit();

	}

}
