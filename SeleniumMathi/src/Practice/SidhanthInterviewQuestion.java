//Write a programm to redirect to google.com and check the spelling of google if it is correct then redirect to google.co.in 
package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SidhanthInterviewQuestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//img[@alt='Google']")).getAttribute("alt");
		System.out.println(text);
		if (text.equals("Google")) {
			driver.navigate().to("https://www.google.co.in/");
		}
		else {
			System.out.println("Its not Correct spelling");
		}

	}

}
