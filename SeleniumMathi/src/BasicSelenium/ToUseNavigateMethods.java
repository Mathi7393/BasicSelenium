package BasicSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNavigateMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
//		Driver.navigate().to("https://www.youtube.com/");
		Driver.navigate().to(new URL("https://www.youtube.com/"));
//		Driver.get("https://www.instagram.com/");
		Navigation nav = Driver.navigate();
		nav.back();
//		Driver.navigate().back();
		Thread.sleep(5000);
		nav.forward();
		Thread.sleep(5000);
		Driver.close();

	}

}
