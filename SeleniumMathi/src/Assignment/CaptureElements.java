package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		List<WebElement> Elements = driver.findElements(By.xpath("//li[@class='menu-show']"));
		for (WebElement webElement : Elements) {
			System.out.println(webElement.getText());
		}
//		for (int j = 0; j < Elements.size(); j++) {
//			System.out.println(driver.findElements(By.xpath("//li[@class='menu-show']")).get(j).getText());
//		}

	}

}
