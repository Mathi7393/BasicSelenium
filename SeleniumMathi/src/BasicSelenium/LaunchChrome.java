package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//String Title = driver.getTitle();
		//System.out.println(Title);
		//String currentURL = driver.getCurrentUrl();
		//System.out.println(currentURL);
		//String getSourceCode = driver.getPageSource();
		//System.out.println(getSourceCode);
		//driver.close();
		driver.quit();
	}

}
