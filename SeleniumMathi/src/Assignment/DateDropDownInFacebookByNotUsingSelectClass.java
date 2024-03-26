package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateDropDownInFacebookByNotUsingSelectClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[text()='7']")).click();
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[text()='Mar']")).click();
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[text()='1993']")).click();

	}

}
