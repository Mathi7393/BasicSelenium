package advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_009 extends BaseClass {
	@Test
	public void address() {
		driver.findElement(By.linkText("Addresses")).click();
		Reporter.log("navigated to address page successfully", true);
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("kalai");
		driver.findElement(By.id("Address_LastName")).sendKeys("priyan");
		driver.findElement(By.id("Address_Email")).sendKeys("123@gmail.com");
		WebElement countrysel = driver.findElement(By.id("Address_CountryId"));
		Select dropdown = new Select(countrysel);
		dropdown.selectByValue("41");
		driver.findElement(By.id("Address_City")).sendKeys("bangalore");
		driver.findElement(By.id("Address_Address1")).sendKeys("old airport road");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("123456");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
Reporter.log("address is entered successfully", true);
}
}
