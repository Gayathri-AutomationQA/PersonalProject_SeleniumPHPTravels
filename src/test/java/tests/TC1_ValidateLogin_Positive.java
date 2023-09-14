package tests;

import org.testng.annotations.Test;

import hooks.BaseClass;
import pages.LoginPage;

public class TC1_ValidateLogin_Positive extends BaseClass{


	@Test
	public void loginPHP() {
		new LoginPage(driver).inputLoginPassword("bgayathri1993@gmail.com")
		.inputLoginUserName("Password@1")
		.checkboxRememberme()
		.clickSubmit();
	}
}
