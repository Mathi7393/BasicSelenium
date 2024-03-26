package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseDragAndDropByElementXY {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(image1, 500, 0).perform();
		actions.dragAndDropBy(image2, 500, 0).perform();
		actions.dragAndDropBy(image3, 500, 0).perform();
		actions.dragAndDropBy(image4, 500, 0).perform();
		Thread.sleep(5000);
		actions.dragAndDropBy(image1, -180, 0).perform();
		actions.dragAndDropBy(image2, -180, 0).perform();
		actions.dragAndDropBy(image3, -180, 0).perform();
		actions.dragAndDropBy(image4, -180, 0).perform();
		
	}

}
