package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetPageSource {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		String getpagesource = driver.getPageSource();
		System.out.println(getpagesource);
		

	}

}
