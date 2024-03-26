package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\mathi\\OneDrive\\Desktop\\New folder\\mathi resume 08.08.2023.pdf");	
		
	}

}
