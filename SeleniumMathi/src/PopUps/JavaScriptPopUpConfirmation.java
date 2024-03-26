package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUpConfirmation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://licindia.in/");
		driver.findElement(By.partialLinkText("Login")).click();
		Alert conformation = driver.switchTo().alert();
		System.out.println(conformation.getText());
		conformation.accept();
//		conformation.dismiss();

	}

}
