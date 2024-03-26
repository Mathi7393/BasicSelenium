package advanced_selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsOnMultipleMethod {
	@Test
	public void createAccount() {
		Reporter.log("Account created Sucessfully", true);
	}
	@Test
	public void editAccount() {
		Reporter.log("Account edited Sucessfully", true);
	}
	@Test(dependsOnMethods ={"editAccount","createAccount"})
	public void deleteAccount() {
		Reporter.log("Account deleted Sucessfully", true);
	}
}
