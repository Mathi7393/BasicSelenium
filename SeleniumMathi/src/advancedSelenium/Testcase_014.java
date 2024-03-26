package advancedSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase_014 extends BaseClass{
@Test
public void wishlist()
{
	driver.findElement(By.partialLinkText("Digital downloads")).click();
	//driver.findElement(By.xpath("(//a[@title='Show details for Music 2'])[3]")).click();
	driver.findElement(By.linkText("Music 2")).click();
	//driver.findElement(By.id("add-to-wishlist-button-52")).click();
	driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
	driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	driver.findElement(By.xpath("//input[@value='Email a friend']")).click(); 
	driver.findElement(By.id("FriendEmail")).sendKeys("4567@gmail.com");
	driver.findElement(By.id("PersonalMessage")).sendKeys("Hiii....how r u!!!!!!");
	driver.findElement(By.name("send-email")).click();
	String capture =driver.findElement(By.cssSelector("[class='result']")).getText();
	Reporter.log(capture, true);
}
}
