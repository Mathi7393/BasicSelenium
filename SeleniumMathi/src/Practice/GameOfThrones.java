package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GameOfThrones {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://got.bigpoint.com/?aid=383");
		driver.findElement(By.id("bgcdw_login_form_username")).sendKeys("Maanaa");
		driver.findElement(By.id("bgcdw_login_form_password")).sendKeys("Mathi@7393");
		driver.findElement(By.cssSelector("input[class='bgcdw_button bgcdw_login_form_login']")).click();
		Actions actions = new Actions(driver);
		Thread.sleep(30000);
		actions.moveByOffset(1384,84).click().perform();
		Thread.sleep(10000);
		actions.moveByOffset(0,0).click().perform();
		Thread.sleep(10000);
		actions.moveByOffset(0,0).click().perform();
		Thread.sleep(10000);
		actions.moveByOffset(0,0).click().perform();
		Thread.sleep(10000);
		actions.moveByOffset(0,0).click().perform();
	}

}
