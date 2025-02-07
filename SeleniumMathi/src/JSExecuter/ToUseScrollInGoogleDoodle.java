package JSExecuter;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseScrollInGoogleDoodle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(;;) {
		try {
//			driver.findElement(By.linkText("Celebrating Pani Puri")).click();
			driver.findElement(By.linkText("Sridevi's 60th Birthday")).click();
//			driver.findElement(By.linkText("India Independence Day 2023")).click();
			break;
		} catch (Exception e) {
			js.executeScript("window.scrollBy(0,300);");
		}
		}
//		js.executeScript("window.scrollBy(0,500);");
//		js.executeScript("window.scrollBy(0,-200);");
	}

}
