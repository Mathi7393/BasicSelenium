package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelectMultipleCheckBox {
	static Scanner s = new Scanner(System.in);
	static boolean option=true;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		ArrayList<String> BL = new ArrayList<String>();
//		Actions actions=new Actions(driver);
		System.out.println("enter the product:");
		String product=s.nextLine();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product, Keys.ENTER);
		List<WebElement> Brands = driver.findElements(By.xpath("//div[@id='brandsRefinements']/ul/span/li"));

		for (WebElement webElement : Brands) {
			BL.add(webElement.getAttribute("aria-label"));
		}
		System.out.println(BL);
		do {
			System.out.println("Enter the Option:");
			String input = s.nextLine();
			if (BL.contains(input)) {
				driver.findElement(By.linkText(input)).click();
			}else {
				option =false;
			}
		} while (option);
		
	}

}
