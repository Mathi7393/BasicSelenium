package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySongInYoutube {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("chinna chinna kiliye");
//		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("chinna chinna kiliye");
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("embutu irukuthu aasai song");
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Laayi Laayi song");
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Nenjil Mamazhai song");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		driver.findElement(By.id("video-title")).click();
		
	}

}
