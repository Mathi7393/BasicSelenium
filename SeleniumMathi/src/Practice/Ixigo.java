package Practice;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ixigo {

	public static void main(String[] args) {
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ixigo.com/");
		driver.findElement(By.xpath("//span[.='From']")).sendKeys("salem");
	}

}
