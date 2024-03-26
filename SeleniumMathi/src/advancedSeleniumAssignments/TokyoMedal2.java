package advancedSeleniumAssignments;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TokyoMedal2 {

	public static <E> void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		ArrayList<String> al = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			String i1 = "" + i;
			String countryname = driver.findElement(By.xpath("//div[@data-row-id='country-medal-row-" + i1
					+ "' and @class='styles__CountryWrapper-sc-fehzzg-4 hjfJyH']")).getText();
			al.add("\n"+countryname);
			String gold = driver.findElement(By.xpath("//div[@data-medal-id='gold-medals-row-" + i + "']")).getText();
			al.add(gold);
			String silver = driver.findElement(By.xpath("//div[@data-medal-id='silver-medals-row-" + i + "']"))
					.getText();
			al.add(silver);
			String bronze = driver.findElement(By.xpath("//div[@data-medal-id='bronze-medals-row-" + i + "']"))
					.getText();
			al.add(bronze);
		}
		System.out.println(al);
		driver.quit();
	}

}
