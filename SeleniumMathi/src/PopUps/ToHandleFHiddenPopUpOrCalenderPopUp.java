package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFHiddenPopUpOrCalenderPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.abhibus.com/");

		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[text()='December']/../../..//span[text()='5']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
			}
		}
	}

}
