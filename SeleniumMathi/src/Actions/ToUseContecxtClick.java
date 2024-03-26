package Actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseContecxtClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		Actions action=new Actions(driver);
		WebElement googleSearch = driver.findElement(By.xpath("(//input[@name=\"btnK\"])[2]"));
		action.contextClick(googleSearch).perform();
		
		
		
		
	}
}
