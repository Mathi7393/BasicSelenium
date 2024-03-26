package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userNameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.id("password"));
		userNameTextField.clear();
		userNameTextField.sendKeys("Mathi");
		passwordTextField.clear();
		passwordTextField.sendKeys("Mathi@123");
		
		
	}

}
