package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import hooks.BaseClass;
import hooks.LoginTestData;
import pages.LoginPage;
import reports.ExtentReportManager;

public class TC1_ValidateLogin_Positive extends BaseClass{


	@Test(dataProvider = "loginData",dataProviderClass = LoginTestData.class )
	public void loginPHP(String username, String password) {
		new LoginPage(driver).inputLoginPassword(username)
		.inputLoginUserName(password)
		.checkboxRememberme()
		.clickSubmit();
		
        ExtentTest test = ExtentReportManager.createTest("yourTestCase");
        test.log(Status.INFO, "Test step Description");
        test.log(Status.PASS, "Test passed!");

	}
	
	
}
