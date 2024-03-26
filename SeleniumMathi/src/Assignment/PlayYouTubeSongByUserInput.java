package Assignment;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayYouTubeSongByUserInput {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter the song");
		String songName = s.nextLine();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		searchBox.sendKeys(songName);
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		searchButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();

	}

}
