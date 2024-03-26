package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetRectMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Rectangle values = driver.findElement(By.id("loginButton")).getRect();
		System.out.println(values.getHeight());
		System.out.println(values.getWidth());
		System.out.println(values.getX());
		System.out.println(values.getY());
	}

}
