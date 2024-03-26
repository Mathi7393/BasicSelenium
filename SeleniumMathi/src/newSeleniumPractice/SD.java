package newSeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SD {
	static WebDriver driver;

	public static void main(String[] args) {
		 ToLaunchBrowser();
		 ToNavigateUrl();
		
	}

	public static void ToLaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void ToNavigateUrl() {
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void ToCloseBrowser() {
		driver.quit();
	}
}
