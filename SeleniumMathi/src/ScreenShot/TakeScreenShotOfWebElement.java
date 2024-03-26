package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		Thread.sleep(5000);
//		File temp = driver.findElement(By.xpath("(//img)[11]")).getScreenshotAs(OutputType.FILE);
		File temp = driver.findElement(By.xpath("//img[@alt='Udemy' and @loading='lazy']")).getScreenshotAs(OutputType.FILE);
		File src=new File("./errorShot/udemy1.jpeg");
		FileHandler.copy(temp, src);
	}

}
