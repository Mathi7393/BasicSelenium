package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Abcdefghijkl");
		driver.findElement(By.id("pass")).sendKeys("12345655121");
//when we are in need of using the element multiple times store it in a variable and use it
		WebElement loginButton = driver.findElement(By.name("login"));
		System.out.println(loginButton.getText());
		loginButton.click();
	}
}
