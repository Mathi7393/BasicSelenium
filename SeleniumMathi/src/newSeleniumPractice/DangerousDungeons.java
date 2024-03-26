package newSeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DangerousDungeons {
	static Robot r;

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://poki.com/en/g/super-dangerous-dungeons");
		Thread.sleep(20000);
		WebElement frame = driver.findElement(By.id("game-element"));
		driver.switchTo().frame(frame);
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(15000);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(15000);
		actions.sendKeys(Keys.SPACE).perform();
		Thread.sleep(10000); 
		actions.sendKeys(Keys.ARROW_RIGHT).perform();
//		WebElement frame1 = driver.findElement(By.id("gameframe"));
//		frame1.sendKeys(Keys.SPACE);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.ARROW_RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		Thread.sleep(500);
//		frame1.sendKeys(Keys.RIGHT);
//		driver.switchTo().frame("game-element");
//		Thread.sleep(1000);
//
//		try {
//			r = new Robot();
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//		} catch (AWTException e) {
//			r = new Robot();
//			r.keyRelease(KeyEvent.VK_ENTER);
//			e.printStackTrace();
//		}
//		Thread.sleep(15000);
//
//		try {
//			r = new Robot();
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//		} catch (AWTException e) {
//			r = new Robot();
//			r.keyRelease(KeyEvent.VK_ENTER);
//			e.printStackTrace();
//		}
//		Thread.sleep(20000);
//
//		try {
//			r = new Robot();
////			System.out.println("jump");
//			r.keyPress(KeyEvent.VK_SPACE);
//			r.keyRelease(KeyEvent.VK_SPACE);
//			r.keyPress(KeyEvent.VK_SPACE);
//			r.keyRelease(KeyEvent.VK_SPACE);
//			r.keyPress(KeyEvent.VK_SPACE);
//			r.keyRelease(KeyEvent.VK_SPACE);
//			Thread.sleep(5000);
////			r.keyPress(KeyEvent.VK_RIGHT);
////			r.keyRelease(KeyEvent.VK_RIGHT);
////			r.keyPress(KeyEvent.VK_RIGHT);
////			r.keyRelease(KeyEvent.VK_RIGHT);
////			r.keyPress(KeyEvent.VK_RIGHT);
////			r.keyRelease(KeyEvent.VK_RIGHT);
////			Thread.sleep(5000);
//		} catch (AWTException e) {
//			r = new Robot();
//			System.out.println("jumpc");
////			r.keyRelease(KeyEvent.VK_SPACE);
//			r.keyRelease(KeyEvent.VK_RIGHT);
//			e.printStackTrace();
//		}
//
//		finally {
//			r = new Robot();
//			System.out.println("jumpf");
//			r.keyRelease(KeyEvent.VK_ENTER);
////			r.keyRelease(KeyEvent.VK_SPACE);
//			r.keyRelease(KeyEvent.VK_RIGHT);
//			Thread.sleep(5000);
//			driver.quit();
//		}
		
		Thread.sleep(15000);
		driver.quit();
	}

}
