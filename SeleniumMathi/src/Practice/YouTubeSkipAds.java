package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeSkipAds {

	public static void main(String[] args) throws InterruptedException {
		String[] videoList = { "Chinna Chinna Kiliye", "Laayi Laayi", "embutu irruku aasa song",
				"nenjil mamazhai nenjil mamazhai", "Yeto Vellipoyindi Manasu - Priyathama", "kadhal kaditham song" };
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// driver.manage().window().setSize(new Dimension(770, 830));
		driver.get("https://www.youtube.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		for (int j = 0; j < videoList.length; j++) {
			searchBox.sendKeys(videoList[j]);
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(2000);
			String time = driver.findElement(By.xpath("//a[@id='video-title']/../../../../..//span[@id='text']"))
					.getText();
			System.out.println(time);
			driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
			Thread.sleep(7000);
			try {
//				if (driver.findElement(By.xpath("//button[.='Skip Ads']")).isDisplayed()) {
//					driver.findElement(By.xpath("//button[.='Skip Ads']")).click();
//				} else if (driver.findElement(By.xpath("//button[.='Skip ads']")).isDisplayed()) {
//					driver.findElement(By.xpath("//button[.='Skip ads']")).click();
//				} else if (driver.findElement(By.xpath("//button[.='Skip Ad']")).isDisplayed()) {
//					driver.findElement(By.xpath("//button[.='Skip Ad']")).click();
//				} else 
				if (driver.findElement(By.xpath("//div[.='Skip' and contains(@id,'ad-text')]/parent::button"))
						.isDisplayed()) {
//					System.out.println(
//							driver.findElement(By.xpath("//div[.='Skip' and contains(@id,'ad-text')]/parent::button"))
//									.isDisplayed());
					driver.findElement(By.xpath("//div[.='Skip' and contains(@id,'ad-text')]/parent::button")).click();
				}
			} catch (Exception e) {
				System.out.println("Can't able to capture or click ads");
			}

			Thread.sleep(time(time) / 5);
			Thread.sleep(2000);
			searchBox.clear();
		}

	}

	public static int time(String time) {
		String[] minSec = time.split(":");
		int minutes = Integer.parseInt(minSec[0]);
		int seconds = Integer.parseInt(minSec[1]);
		int totalSeconds = (minutes * 60) + seconds;
		return totalSeconds * 1000;
	}

}

//if (driver.findElement(By.xpath("//div[@class='ytp-ad-text ytp-ad-preview-text']")).isDisplayed()) {
//	System.out.println("Can't able to skip ad");
//} else 
