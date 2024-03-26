package BasicSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseManageMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Thread.sleep(1000);
		Driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		Driver.manage().window().minimize();
		Thread.sleep(1000);
		Driver.manage().window().fullscreen();
		Thread.sleep(1000);
		Dimension sizeOfWebPage = Driver.manage().window().getSize();
		Thread.sleep(1000);
		System.out.println("size if WebPage"+sizeOfWebPage);
		Driver.manage().window().setSize(new Dimension(500, 500));
		Thread.sleep(1000);
		Point positionOfBrowser = Driver.manage().window().getPosition();
		Thread.sleep(1000);
		System.out.println(positionOfBrowser);
		Driver.manage().window().setPosition(new Point(500, 500));
		Thread.sleep(1000);
		Dimension sizeOfWebPage1 = Driver.manage().window().getSize();
		Thread.sleep(1000);
		System.out.println("New Size of WebPage"+sizeOfWebPage1);
		Point positionOfBrowser1 = Driver.manage().window().getPosition();
		Thread.sleep(1000);
		System.out.println("New Size of Position"+positionOfBrowser1);
		Driver.quit();

	}

}
