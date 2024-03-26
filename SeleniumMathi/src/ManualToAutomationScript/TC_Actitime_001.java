package ManualToAutomationScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_Actitime_001 {
	public static void main(String[] args) {
		// Test Data
		String url = "https://demo.actitime.com/login.do";
		String usernameData = "admin";
		String passwordData = "manager";

		// Expected Data
		String expectedLoginPageTitle = "actiTIME - Login";
		String expectedHomePageTitle = "actiTIME -  Enter Time-Track";

		// Step 1:- Open the Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got launched Sucessfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximized");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Step 2:- Enter the URL
		driver.get(url);
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Loginpage displayed Sucessfully");
		} else {
			System.out.println("Failed to Navigate to Loginpage");
		}

		// Step 3:- To Enter the data in Username Textfield
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		usernameTextfield.clear();
		usernameTextfield.sendKeys(usernameData);
		String actualDataInUsernameTextfield = usernameTextfield.getAttribute("value");
		if (actualDataInUsernameTextfield.equals(usernameData)) {
			System.out.println("Username TextField is Successfully Accepted Data");
		} else {
			System.out.println("Username TextField is failed accept Data");
		}

		// Step 4:- To Enter the data in Password Textfield
		WebElement passwordTextfield = driver.findElement(By.name("pwd"));
		passwordTextfield.clear();
		passwordTextfield.sendKeys(passwordData);
		String actualDataInpasswordTextfield = passwordTextfield.getAttribute("value");
		if (actualDataInpasswordTextfield.equals(passwordData)) {
			System.out.println("Password TextField is Successfully Accepted Data");
		} else {
			System.out.println("pASSWORD TextField is failed accept Data");
		}

		// Step 5:- To Click on Login Button
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("homepage displayed Sucessfully");
		} else {
			wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));
			System.out.println("homepage displayed Sucessfully");
		}

		// Step 6:- To close Browser
		System.out.println("Browser got Closed");
		driver.quit();
	}
}
