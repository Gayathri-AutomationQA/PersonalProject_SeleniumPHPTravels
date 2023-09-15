package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import hooks.BaseClass;
import pages.LoginPage;
import reports.ExtentReportManager;

public class TC2_ValidateLogin_Negative extends BaseClass {

	@Test
	public void validateNegativeLogin() {
		new LoginPage(driver)
		.inputLoginUserName("bga@123.com")
		.inputLoginPassword("")
		.checkboxRememberme()
		.clickSubmit()
		.validateErrorAlert();
	    ExtentTest test = ExtentReportManager.createTest("yourTestCase");
        test.log(Status.INFO, "Test step Description");
        test.log(Status.PASS, "Test passed!");
	}

}
