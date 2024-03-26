package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureErrorMessageColour {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']")).click();
		String errorMessageColour = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful')]")).getCssValue("color");
		System.out.println(errorMessageColour);
	}

}
