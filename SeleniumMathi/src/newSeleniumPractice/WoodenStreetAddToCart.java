package newSeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreetAddToCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		for (;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;

			} catch (Exception e) {
				Thread.sleep(2000);
			}
		}

		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.linkText("Sofa Sets")).click();
		driver.findElement(By.xpath("(//p[@class='name'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart-buy-now")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Bedroom")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("TV Units")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='heading' and contains(text(),'Hailey')])[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("button-cart-buy-now")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Study & Office")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Laptop Tables")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Naomi Laptop Table (Natural Finish)' and @class='heading']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("button-cart-buy-now")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.woodenstreet.com/");
//		driver.findElement(By.id("loginclose1")).click();
//		driver.findElement(By.partialLinkText("Study & Office")).click();
//		driver.findElement(By.partialLinkText("Laptop Tables")).click();
//		driver.findElement(By.xpath("//a[@class='heading' and text()='Naomi Laptop Table (Natural Finish)']")).click();
////		for (int i = 1; i < 4; i++) {
////			driver.findElement(By.linkText("Sofas")).click();
////			driver.findElement(By.linkText("Sofa Sets")).click();
////			System.out.println(i);
////			driver.findElement(By.xpath("(//p[@class='name'])["+i+"]")).click();
////			Thread.sleep(2000);
////			driver.findElement(By.id("button-cart-buy-now")).click();
////			Thread.sleep(2000);
////		}
//		
////		driver.findElement(By.linkText("Sofas")).click();
////		driver.findElement(By.linkText("Sofa Sets")).click();
////		driver.findElement(By.xpath("(//p[@class='name'])[1]")).click();
////		driver.findElement(By.id("button-cart-buy-now")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.linkText("Sofas")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.linkText("Sofa Sets")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("(//p[@class='name'])[2]")).click();
////		driver.findElement(By.id("button-cart-buy-now")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.linkText("Sofas")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.linkText("Sofa Sets")).click();
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("(//p[@class='name'])[3]")).click();
////		driver.findElement(By.id("button-cart-buy-now")).click();
////		Thread.sleep(2000);
////		driver.quit();

	}

}
