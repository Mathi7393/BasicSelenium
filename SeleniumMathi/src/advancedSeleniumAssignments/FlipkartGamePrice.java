package advancedSeleniumAssignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartGamePrice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.flipkart.com/");
		Actions action = new Actions(driver);
		action.moveByOffset(50, 100).click().perform();
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		action.moveToElement(electronics).perform();
		WebElement gaming = driver.findElement(By.linkText("Gaming"));
		action.moveToElement(gaming).perform();
		WebElement games = driver.findElement(By.linkText("Games"));
		action.moveToElement(games).click().perform();
		String id = driver.getWindowHandle();
		WebElement game = driver.findElement(By.xpath("(//a[@target='_blank']/..)[1]"));
		game.click();
		Set<String> ids = driver.getWindowHandles();
		for (String stringid : ids) {
			if (!(id.equals(stringid))) {
				driver.switchTo().window(stringid);
			}
		}

		String price = driver.findElement(By.className("_16Jk6d")).getText();
		System.out.println(price);
		driver.quit();
	}

}
