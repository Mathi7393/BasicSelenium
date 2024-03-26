package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
//		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
//		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("9688603286");
		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About Us")).click();
		//driver.findElement(By.xpath("//a[text()='About Us']")).click();
	}

}
