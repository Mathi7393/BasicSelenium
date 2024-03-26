package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToUSeDisableNotification {

	public static void main(String[] args) {
		ChromeOptions settinngs = new ChromeOptions();
		settinngs.addArguments("--disable-notifications");
//		settinngs.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(settinngs);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yatra.com/");
	}

}
