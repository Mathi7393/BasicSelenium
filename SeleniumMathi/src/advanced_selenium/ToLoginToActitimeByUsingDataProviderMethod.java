package advanced_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLoginToActitimeByUsingDataProviderMethod {

	@DataProvider(name = "cred")
	public String[][] sendData() {
		String[][] sarr = { { "admin", "manager" }, { "trainee", "trainee" }, { "Kiran", "Testing@123" } };
		return sarr;
	}

	@Test(dataProvider = "cred")
	public void login(String[] credentials) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		driver.findElement(By.id("loginButton")).click();
	}
}
