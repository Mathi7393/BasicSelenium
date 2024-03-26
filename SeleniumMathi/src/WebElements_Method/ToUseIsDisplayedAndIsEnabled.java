package WebElements_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToUseIsDisplayedAndIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		driver.findElement(By.name("username")).sendKeys("mmmmmm");
		driver.findElement(By.name("password")).sendKeys("nnnnnn");
		WebDriverWait ww=new WebDriverWait(driver, Duration.ofSeconds(10));
		ww.until(ExpectedConditions.elementToBeClickable(loginButton));
		
		
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());

	}

}
