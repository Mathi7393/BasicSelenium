package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGdetTagName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tagName = driver.findElement(By.id("loginButton")).getTagName();
		System.out.println(tagName);

	}

}
