package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCSSValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		// WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login']"));
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		System.out.println(loginButton.getCssValue("color"));
		System.out.println(loginButton.getCssValue("font-family"));
		System.out.println(loginButton.getCssValue("font-size"));
		System.out.println(loginButton.getCssValue("border"));
		System.out.println(loginButton.getCssValue("border-radius"));
		System.out.println(loginButton.getCssValue("text-decoration"));

	}

}
