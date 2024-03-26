package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInstagram {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Abcdefgh");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		

	}

}
