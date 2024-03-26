package Practice;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basics {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.youtube.com/");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File temp=ts.getScreenshotAs(OutputType.FILE);
//		File src=new File("./errorShot/maaa.png");
//		FileHandler.copy(temp, src);
//		
//		File temp1=driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[3]")).getScreenshotAs(OutputType.FILE);
//		File src1=new File("./errorShot/maaa1.png");
//		FileHandler.copy(temp1, src1);
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//span[text()='✕']")).click();
//		driver.findElement(By.name("q")).sendKeys("iphone");
//		List<WebElement> autosug = driver.findElements(By.xpath("//a[@class='oleBil']"));
//		for (WebElement sug : autosug) {
//			System.out.println(sug.getText());
//		}
//		driver.findElement(By.name("q")).sendKeys(Keys.CONTROL+"ac");
//		Thread.sleep(2000);
//		Runtime.getRuntime().exec("notepad");
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_Q);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		r.keyRelease(KeyEvent.VK_Q);
//		driver.quit();

		driver.get("https://www.vtiger.com/");
		Actions a = new Actions(driver);
		WebElement resources = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String phno = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]")).getText();
		System.out.println(phno);
	}

}
