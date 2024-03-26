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

public class AmazonSelectMultipleCheckBox2 {
	static Scanner s = new Scanner(System.in);
	static boolean option1=true;
	static boolean option2=true;
	static WebDriver driver = new ChromeDriver();
	static ArrayList<String> DL = new ArrayList<String>();
	static ArrayList<String> BL = new ArrayList<String>();
	public static void main(String[] args) {	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
//		Actions actions=new Actions(driver);
		System.out.println("enter the product:");
		String product=s.nextLine();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product, Keys.ENTER);
		List<WebElement> divisions = driver.findElements(By.xpath("//div[@id='s-refinements']/div/div"));
		for (WebElement webEleDiv : divisions) {
			DL.add(webEleDiv.getAttribute("id"));
		}
		System.out.println(DL);
		do {
			System.out.println("enter the divOption:");
			String divOption=s.nextLine();
			if (DL.contains(divOption)) {
				driver.findElement(By.id(divOption)).click();
				div(divOption);
			}else {
				option1 =false;
			}
		} while (option1);
		
	}
	public static void div(String divOption) {
		String xpath="//div[@id='"+divOption+"']/ul/span/li";
//		System.out.println(xpath);
		List<WebElement> Brands = driver.findElements(By.xpath(xpath));
		for (WebElement webElement : Brands) {
			BL.add(webElement.getText());
		}
		System.out.println(BL);
		do {
			System.out.println("Enter the Option:");
			String input = s.nextLine();
			if (BL.contains(input)) {
				driver.findElement(By.linkText(input)).click();
			}else {
				option2 =false;
				BL.removeAll(BL);
			}
			BL.removeAll(BL);
		} while (option2);
	}

}
