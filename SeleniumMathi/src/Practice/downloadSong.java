package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadSong {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tamilpaatu.com/leo-songs-1?ref=sb");
		 driver.findElement(By.linkText("Leo")).click();
		 driver.findElement(By.xpath("//a[.='Naa Ready' and contains(@title,'Download')]")).click();

	}

}
