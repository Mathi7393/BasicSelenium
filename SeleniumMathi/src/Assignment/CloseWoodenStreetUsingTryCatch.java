package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWoodenStreetUsingTryCatch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		for (;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				
			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		
	}

}
