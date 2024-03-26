package advancedSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass_crossCheckBrowser {
	
		WebDriver driver;
		@Parameters("browserName")
		@BeforeClass
		public void  toLaunchBrowser(String bName) {
			if(bName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if(bName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			Reporter.log("browser got launched", true);
			driver.manage().window().maximize();
			Reporter.log("browser got maximised successfully", true);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}

		@BeforeMethod
		public void login()
		{
			driver.get("https://demowebshop.tricentis.com/");
			Reporter.log("Navigated to welcome page successfully", true);
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("kalai1234@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("kalai123@");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Reporter.log("Navigated to home page successfully", true);
		}

		@AfterMethod
		public void logout()
		{
			driver.findElement(By.linkText("Log out")).click();
			Reporter.log("Page got logout successfully", true);
		}

		@AfterClass
		public void toCloseBrowser()
		{
			driver.quit();
			Reporter.log("browser got closed successfully", true);
		}
}
