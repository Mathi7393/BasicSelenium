package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopUpActiTime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		String mainID = driver.getWindowHandle();
		Set<String> allID = driver.getWindowHandles();
		System.out.println(mainID);
		System.out.println(allID);
		for (String id : allID) {
			if (!(mainID.equals(id))) {
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.linkText("Log in")).click();
	}

}
