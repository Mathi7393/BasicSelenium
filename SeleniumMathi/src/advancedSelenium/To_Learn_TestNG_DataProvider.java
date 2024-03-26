package advancedSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class To_Learn_TestNG_DataProvider {

	@DataProvider(name="facebook")
	public String[][] toSendData()
	{
		String [][] data = { {"kalai123@gmail.com", "kalai123@"},
				                     {"hari123@gmail.com", "hari123@"},
		                             {"mani123@gmail.com", "mani123@"},
		                             {"barathi123@gmail.com", "barathi123@"}};
		return data;	
	}
	
	@Test(dataProvider="facebook")
	public void toLogin(String email, String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
