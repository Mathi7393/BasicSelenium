package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetDataFromPropertiesFiles {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("testdata/testData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("url"));
		String url = prop.getProperty("url");
//		String url =(String) prop.get("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		System.out.println(prop.get("url"));
	}

}
