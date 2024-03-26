package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleMethod {

	public static void main(String[] args) {
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.instagram.com/");
		String WindowID = Driver.getWindowHandle();
		System.out.println(WindowID);//D24E8966391CE52FF0D30479662C48B9
									 //9F1B895CF6693591712E57B8DFD43646

	}

}
