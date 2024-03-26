package Practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFIlesByUsingSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///E:/Selenium/FileUpload.html");
		WebElement uploadbutton = driver.findElement(By.xpath("//input[@type='file']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", uploadbutton);
		File f= new File("C:\\Users\\mathi\\OneDrive\\Desktop\\seleni.pdf");
		String path=f.getAbsolutePath();
		uploadbutton.sendKeys(path);

	}

}
