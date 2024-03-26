package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class geturl {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String CurrentUrl = driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	}
  }
