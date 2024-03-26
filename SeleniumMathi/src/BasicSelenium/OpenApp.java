package BasicSelenium;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenApp {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://got.bigpoint.com/?aid=383");
		String TitleOfWebPage = driver.getTitle();
		System.out.println(TitleOfWebPage);

	}

}
