package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkShopUsingExcelMultidata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/actiTime.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Sheet2").getRow(0).getCell(0).toString();
		String firstName = workbook.getSheet("Sheet2").getRow(0).getCell(1).toString();
		String lastName = workbook.getSheet("Sheet2").getRow(0).getCell(2).toString();
		String email = workbook.getSheet("Sheet2").getRow(0).getCell(3).toString();
		String password = workbook.getSheet("Sheet2").getRow(0).getCell(4).toString();
		String confirmPassword = workbook.getSheet("Sheet2").getRow(0).getCell(5).toString();
		String gender = workbook.getSheet("Sheet2").getRow(0).getCell(6).toString();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));			
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		if (gender.equalsIgnoreCase(driver.findElement(By.xpath("//label[text()='Male']")).getText())) {
			driver.findElement(By.id("gender-male")).click();
		} else {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

}
