package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQAPropagation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.id("Propagation")).click();
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		WebElement droppable2 = driver.findElement(By.id("droppable2"));
		WebElement innerDroppable = driver.findElement(By.id("droppable-inner"));
		WebElement innerDroppable2 = driver.findElement(By.id("droppable2-inner"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(draggable, droppable).perform();
		actions.dragAndDrop(draggable, droppable2).perform();
		actions.dragAndDrop(draggable, innerDroppable).perform();
		actions.dragAndDrop(draggable, innerDroppable2).perform();
		String droppableColour = driver.findElement(By.id("droppable")).getCssValue("background");
		System.out.println(droppableColour);
		String droppableColour2 = driver.findElement(By.id("droppable2")).getCssValue("background");
		System.out.println(droppableColour2);
		String innerDroppableColour = driver.findElement(By.id("droppable-inner")).getCssValue("background");
		System.out.println(innerDroppableColour);
		String innerDroppable2Colour = driver.findElement(By.id("droppable2-inner")).getCssValue("background");
		System.out.println(innerDroppable2Colour);
	}

}
