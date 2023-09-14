package tests;

import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.LoginPage;

public class TC2_ValidateLogin_Negative extends BaseClass {

	@Test
	public void validateNegativeLogin() {
		new LoginPage(driver)
		.inputLoginUserName("bga@123.com")
		.inputLoginPassword("")
		.checkboxRememberme()
		.clickSubmit()
		.validateErrorAlert();
		
	}

}
