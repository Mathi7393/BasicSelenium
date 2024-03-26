package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MynthraSearchIcon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("watch");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	}

}
