package newSeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		

	}

}
