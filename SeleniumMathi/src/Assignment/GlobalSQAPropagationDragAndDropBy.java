package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobalSQAPropagationDragAndDropBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.id("Propagation")).click();
		WebElement frame = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElement(By.id("draggable"));
		Actions actions=new Actions(driver);
		actions.dragAndDropBy(draggable, 200, 0).perform();
		actions.dragAndDropBy(draggable, 250, 0).perform();
		actions.dragAndDropBy(draggable, 0, 50).perform();
		actions.dragAndDropBy(draggable, -250, 0).perform();
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
