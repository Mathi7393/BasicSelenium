package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQAAcceptedElementsDragAndDropBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElement(By.id("draggable"));
		System.out.println(draggable.getText());
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.isEnabled());
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(draggable,150 , 0).perform();
		String backgroundcolor = driver.findElement(By.id("droppable")).getCssValue("background");
		System.out.println(backgroundcolor);
	}

}
