
package DropDown;
//to handle dropdown we need to Use select class methods
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseSelectClassForSingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
//		we need create object for select class
		Select daySelect=new Select(dayDropDown);
		Select monthSelect=new Select(monthDropDown);
		Select yearSelect=new Select(yearDropDown);
//		Calling Methods to select the Option
		daySelect.selectByIndex(21);
		monthSelect.selectByVisibleText("May");
		yearSelect.selectByValue("2000");
		
		List<WebElement> allMonths = monthSelect.getOptions();
		for (WebElement month : allMonths) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(2000);	
		}
	}
}
