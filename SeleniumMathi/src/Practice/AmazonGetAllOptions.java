package Practice;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGetAllOptions {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.out.println("enter lan code:");
		String lancode=s.nextLine();//HI
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
		WebElement tab = driver.findElement(By.xpath("//div[@id='nav-xshop-container']"));
		driver.findElement(By.xpath("(//span[@dir='ltr' and text()="+lancode+"])[1]"));
		System.out.println(tab.getText());
	}

}
