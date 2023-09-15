package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.BaseClass;

public class LoginPage extends BaseClass{
	// Using final for locators 
	public final By usernameInput = By.id("email");
	public final By passwordInput = By.id("password");
	public final By loginButton = By.id("submitBTN");


	public LoginPage (WebDriver driver) { //constructor
		BaseClass.driver=driver;
	}

	public LoginPage inputLoginUserName(String uName) {
		driver.findElement(usernameInput).sendKeys(uName);
		return this;
	}

	public LoginPage inputLoginPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
		return this;
	}

	public LoginPage checkboxRememberme() {
		driver.findElement(By.id("rememberchb")).click();
		return this;		
	}

	public LoginPage clickSubmit() {
		driver.findElement(loginButton).click();
		return this;
	}

	public LoginPage validateErrorAlert() {
		waitForElement(driver.findElement(By.xpath("//h4[text()=\"Invalid Login\"]")));
		Assert.assertEquals(driver.findElement(By.xpath("//h4[text()=\"Invalid Login\"]")).getText(), "Invalid Login");
		return this;
	}


}
