package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseDragAndDrop {

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
		WebElement trash = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(image1, trash).perform();
		Thread.sleep(100);
		actions.dragAndDrop(image2, trash).perform();
		Thread.sleep(100);
		actions.dragAndDrop(image3, trash).perform();
		Thread.sleep(100);
		actions.dragAndDrop(image4, trash).perform();
		Thread.sleep(5000);
		actions.dragAndDrop(image1, gallery).perform();
		Thread.sleep(100);
		actions.dragAndDrop(image2, gallery).perform();
		Thread.sleep(100);
		actions.dragAndDrop(image3, gallery).perform();
		Thread.sleep(100);
		actions.dragAndDrop(image4, gallery).perform();
		
	}

}
