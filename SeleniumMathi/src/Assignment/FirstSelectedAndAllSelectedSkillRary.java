package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedAndAllSelectedSkillRary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
		WebElement ListBox = driver.findElement(By.id("cars"));
		Select MultiDropDown=new Select(ListBox);
		MultiDropDown.selectByIndex(0);
		MultiDropDown.selectByValue("99");
		MultiDropDown.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		MultiDropDown.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		MultiDropDown.selectByVisibleText("More Than INR 500 ( 55 ) ");
		Thread.sleep(2000);
		WebElement firstSelected = MultiDropDown.getFirstSelectedOption();
		System.out.println(firstSelected);
		List<WebElement> allSelected = MultiDropDown.getAllSelectedOptions();
		for (WebElement Elements : allSelected) {
			System.out.println(Elements.getText());	
		}
	}

}
