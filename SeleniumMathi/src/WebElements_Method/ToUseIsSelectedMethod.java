package WebElements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		WebElement optionElement = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		System.out.println(optionElement.isSelected());
//		optionElement.click();
//		System.out.println(optionElement.isSelected());
	}

}
