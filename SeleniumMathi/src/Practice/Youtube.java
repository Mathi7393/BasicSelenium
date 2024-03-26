package Practice;

//import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	//static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
	//	System.out.println("Enter the song");
	//	String songName=s.nextLine();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("embutu irukuthu aasai song");
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Nakka Mukka song");
	//	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Laayi Laayi song");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
	//	searchBox.sendKeys(songName);
		//searchBox.sendKeys("Rajathi rajaya");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		//searchButton.click();
		//Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//div[@id='dismissible'])[59]")).click();
		//String time = driver.findElement(By.xpath("//a[@id='video-title']/../../../../..//span[@id='text']")).getText();
		//System.out.println(time);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		//Thread.sleep(minutes(time)/4);
		//searchBox.clear();
		searchBox.sendKeys("Laayi Laayi song");
		searchButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		Thread.sleep(2000);
		String Adtext = driver.findElement(By.xpath("//span[@class='ytp-ad-preview-container countdown-next-to-thumbnail']")).getAttribute("class");
		//String Adtext = driver.findElement(By.xpath("//span[contains(@class,'ytp-ad-preview-container countdown-next-to-thumbnail')]")).getAttribute("class");
		System.out.println(Adtext);
		boolean b=(Adtext=="ytp-ad-preview-container countdown-next-to-thumbnail")?true:false;
		System.out.println(b);
		if (!b) {
			Thread.sleep(5000);
			String skipIcon = driver.findElement(By.xpath("//span[@class='ytp-ad-skip-button-icon']")).getAttribute("class");
			System.out.println(skipIcon);
			boolean a=(skipIcon=="ytp-ad-skip-button-icon")?true:false;
			System.out.println(a);
			if (!(skipIcon=="ytp-ad-skip-button-icon")) {
				driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();				
			}
		}
	//	driver.findElement(By.xpath("//div[text()='Skip Ad']")).click();
	}
	public static int minutes(String time) {
		String[] minSec=time.split(":");
		int minutes = Integer.parseInt(minSec[0]);
	    int seconds = Integer.parseInt(minSec[1]);
	    int totalSeconds = (minutes * 60)+seconds;
	    return totalSeconds*1000;
		
	}

}
