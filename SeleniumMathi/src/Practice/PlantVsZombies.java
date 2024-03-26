package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlantVsZombies {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://pvz.ee/");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(@onclick,'PlayAudio')]")).click();
		Actions actions=new Actions(driver);
		actions.moveByOffset(580, 480).click().perform();
		Thread.sleep(5000);
		actions.moveByOffset(800, 230).click().perform();
	}

}
