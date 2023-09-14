package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage (WebDriver driver) {
		BaseClass.driver=driver;
	}

	public LoginPage inputLoginUserName(String uName) {
		driver.findElement(By.id("email")).sendKeys(uName);
		return this;
	}

	public LoginPage inputLoginPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}

	public LoginPage checkboxRememberme() {
		driver.findElement(By.id("rememberchb")).click();
		return this;		
	}

	public LoginPage clickSubmit() {
		driver.findElement(By.id("submitBTN")).click();;
		return this;
	}
	
	public LoginPage validateErrorAlert() {
		waitForElement(driver.findElement(By.xpath("//h4[text()=\"Invalid Login\"]")));
		Assert.assertEquals(driver.findElement(By.xpath("//h4[text()=\"Invalid Login\"]")).getText(), "Invalid Login");
		return this;
	}

}
