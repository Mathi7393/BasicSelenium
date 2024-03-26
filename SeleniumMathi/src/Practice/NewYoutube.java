package Practice;

//import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewYoutube {
	// static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		// System.out.println("Enter the Video title:");
		// String VideoTitle = s.nextLine();
		String[] videoList = { "Laayi Laayi", "Chinna Chinna Kiliye","embutu irruku aasa song","nenjil mamazhai nenjil mamazhai" };
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		for (int j = 0; j < videoList.length; j++) {
			searchBox.sendKeys(videoList[j]);
			searchButton.click();
			Thread.sleep(2000);
			String time = driver.findElement(By.xpath("//a[@id='video-title']/../../../../..//span[@id='text']")).getText();
			System.out.println(time);
			driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
			Thread.sleep(6000);
			try {
				if (!((driver.findElement(By.xpath("//div[text()='Skip Ads']")).getText()) == "Skip Ads")) {
					String S1=driver.findElement(By.xpath("//div[text()='Skip Ads']")).getText();
					System.out.println(S1);
					driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
				}
				else {
					System.out.println("text not captured");
				}
			} catch (Exception e) {
				System.out.println("text not captured");
			}
			
			Thread.sleep(time(time)/4);
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
