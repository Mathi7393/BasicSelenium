package advancedSeleniumAssignments;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TokyoMedal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//			List<WebElement> countries = driver.findElements(By.xpath("(//span[@data-cy='country-name'])[position()<6]"));
//			List<WebElement> countries = driver.findElements(By.xpath("(//span[@data-cy='country-name']/ancestor::div[@data-row-id='country-medal-row-1']/following-sibling::div[@data-cy=\"medal\"])[position()<6]"));
		WebElement countries = driver.findElement(By.xpath("//div[@data-cy='table-content']"));
//			ArrayList<String> al= new ArrayList<>();
//			for (WebElement webElement : countries) {
//				al.add(webElement.getText());
//			}
		String S = countries.getText();
		String[] s = S.split("\n");
		int count = 5;
		int count1 = s.length / 5;
		int ali = 0;
		String[][] lom = new String[count1][count];
		for (int i = 0; i < count1; i++) {
			for (int j = 0; j < count; j++) {
				lom[i][j] = s[ali];
				ali++;
			}
		}
		driver.quit();
		System.out.println("enter the count:");
		int count2=sc.nextInt();
		System.out.println("country gold silver bronze total");
		for (int i = 0; i < count2; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(lom[i][j] + " ");
			}
			System.out.println();
		}
//			System.out.println(s.length);
//			for (int i = 0; i < s.length; i++) {
//				System.out.println(s[i]);
//			}
		
	}

}
