package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWorkShopUsingExcel {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./testdata/actiTime.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		System.out.println("enter the number of staring row");
		int n1=s.nextInt();
		System.out.println("enter the number of ending row");
		int n2=s.nextInt();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = workbook.getSheet("Sheet2").getRow(0).getCell(0).toString();
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		for (int i = n1; i < n2; i++) {
				
				String firstName = workbook.getSheet("Sheet2").getRow(i).getCell(1).toString();
				String lastName = workbook.getSheet("Sheet2").getRow(i).getCell(2).toString();
				String email = workbook.getSheet("Sheet2").getRow(i).getCell(3).toString();
				String password = workbook.getSheet("Sheet2").getRow(i).getCell(4).toString();
				String confirmPassword = workbook.getSheet("Sheet2").getRow(i).getCell(5).toString();
				String gender = workbook.getSheet("Sheet2").getRow(i).getCell(6).toString();		
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
				Thread.sleep(3000);
			}
		driver.quit();
	}

}
