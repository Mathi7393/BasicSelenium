package advanced_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	// Test Data
	String url = "https://demo.actitime.com/login.do";
	String usernameData = "admin";
	String passwordData = "manager";
	// Expected Data
	String expectedLoginPageTitle = "actiTIME - Login";
	String expectedHomePageTitle = "actiTIME -  Enter Time-Track";

	@BeforeClass
	public void browserSetup() {
		driver = new ChromeDriver();
		Reporter.log("Browser got Lanunched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got Maximized", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
		Reporter.log("Browser got Closed", true);
	}

	@BeforeMethod
	public void toLogin() throws InterruptedException {
		driver.get(url);
		String actualLoginPageTitle = driver.getTitle();
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			Reporter.log("Loginpage displayed Sucessfully", true);
		} else {
			Reporter.log("Failed to Navigate to Loginpage", true);
		}
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(usernameData);
		String actualDataInUsernameTextfield = usernameTextField.getAttribute("value");
		if (actualDataInUsernameTextfield.equals(usernameData)) {
			Reporter.log("Username TextField is Successfully Accepted Data", true);
		} else {
			Reporter.log("Username TextField is failed accept Data", true);
		}
		WebElement passwordTextfield = driver.findElement(By.name("pwd"));
		passwordTextfield.sendKeys(passwordData);
		String actualDataInpasswordTextfield = passwordTextfield.getAttribute("value");
		if (actualDataInpasswordTextfield.equals(passwordData)) {
			Reporter.log("Password TextField is Successfully Accepted Data");
		} else {
			Reporter.log("pASSWORD TextField is failed accept Data");
		}
		driver.findElement(By.id("loginButton")).click();
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(expectedHomePageTitle)) {
			Reporter.log("homepage displayed Sucessfully");
		} else {
			Thread.sleep(20000);
			Reporter.log("homepage displayed Sucessfully");
		}
	}

	@AfterMethod
	public void ToLogout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Loggedout Successfully", true);
	}

}
