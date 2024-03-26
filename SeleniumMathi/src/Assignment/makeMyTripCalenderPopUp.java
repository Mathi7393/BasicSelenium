package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class makeMyTripCalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveByOffset(25, 80).click().perform();
		Thread.sleep(5000);
		actions.moveByOffset(0, 0).click().perform();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='7']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
