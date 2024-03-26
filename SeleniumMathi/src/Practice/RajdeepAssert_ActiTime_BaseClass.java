package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class RajdeepAssert_ActiTime_BaseClass {

	WebDriver driver;
	String Actualusernamedata = "admin";
	String Actualpassworddata = "manager";
	String ExpectedLoginPageTitle = "actiTIME - Login";
	String ExpectedHomePageTitle = "actiTIME - Enter Time-Track";
	String ExpectedTaskList = "actiTIME - Task List";
	String ActualLoginPageTitle;
	String UserInpuutedUserName;
	String UserInpuutedPassword;
	String ActualHomePageTitle;
	String ActualTaskList;

	@BeforeClass
	public void LaunchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void validate_LoginPage() throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		ActualLoginPageTitle = driver.getTitle();
		Assert.assertEquals(ActualLoginPageTitle, ExpectedLoginPageTitle, "Login Page displaying failed");
		WebElement UserNameTextField = driver.findElement(By.id("username"));
		UserNameTextField.clear();
		UserNameTextField.sendKeys(Actualusernamedata);
		UserInpuutedUserName = UserNameTextField.getAttribute("value");
		Assert.assertEquals(UserInpuutedUserName, Actualusernamedata, "Username is Invalid");
		WebElement PasswordTextField = driver.findElement(By.name("pwd"));
		PasswordTextField.clear();
		PasswordTextField.sendKeys(Actualpassworddata);
		UserInpuutedPassword = PasswordTextField.getAttribute("value");
		Assert.assertEquals(UserInpuutedPassword, Actualpassworddata, "Password is Invalid");
		WebElement LoginButton = driver.findElement(By.id("loginButton"));
		LoginButton.click();
		Thread.sleep(5000);
		ActualHomePageTitle = driver.getTitle();
		Assert.assertEquals(ActualHomePageTitle, ExpectedHomePageTitle, "HomePage Displaying Failed");
	}

//	@BeforeMethod
//	public void validate_UserName() {
//		WebElement UserNameTextField = driver.findElement(By.id("username"));
//		UserNameTextField.clear();
//		UserNameTextField.sendKeys(Actualusernamedata);
//		UserInpuutedUserName = UserNameTextField.getAttribute("value");
//		Assert.assertEquals(UserInpuutedUserName, Actualusernamedata, "Username is Invalid");
//	}
//
//	@BeforeMethod
//	public void validate_Password() {
//		WebElement PasswordTextField = driver.findElement(By.name("pwd"));
//		PasswordTextField.clear();
//		PasswordTextField.sendKeys(Actualpassworddata);
//		UserInpuutedPassword = PasswordTextField.getAttribute("value");
//		Assert.assertEquals(UserInpuutedPassword, Actualpassworddata, "Password is Invalid");
//
//	}
//
//	@BeforeMethod
//	public void validate_HomePage() {
//		WebElement LoginButton = driver.findElement(By.id("loginButton"));
//		LoginButton.click();
//		ActualHomePageTitle = driver.getTitle();
//		Assert.assertEquals(ActualHomePageTitle, ExpectedHomePageTitle, "HomePage Displaying Failed");
//
//	}

	@AfterMethod
	public void validate_Logout() {
		WebElement LogOutButton = driver.findElement(By.id("logoutLink"));
		LogOutButton.click();
	}

	@AfterClass
	public void validate_CloseBrowser() {
		Reporter.log("Browser is getting closed", true);
		driver.quit();
	}

}