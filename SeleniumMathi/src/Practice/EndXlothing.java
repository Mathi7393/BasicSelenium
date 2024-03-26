package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EndXlothing {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.endclothing.com/gb/women");
		driver.findElement(By.xpath("//span[text()='ACCEPT & CLOSE']")).click();
		driver.findElement(By.cssSelector("[data-test-id=\"Autosuggest__Button\"]")).click();
		driver.findElement(By.cssSelector("[data-test-id=\"Autosuggest__Input\"]")).sendKeys("nike");
		driver.findElement(By.cssSelector(
				"[class=\"Link__InnerLink-sc-e4qf6g-0 iJLkPn AutosuggestSearchLinks__SuggestionLink-sc-5o7282-1 fjsxSg\"]"))
				.click();
	}

}
