package hooks;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	Properties configProp;
	public static WebDriver driver;
	
	@BeforeClass
	public Properties readProperties() throws IOException {
		FileReader reader = new FileReader("./src/test/java/utils/config.properties"); //to read the config file from location 
		configProp = new Properties();
		configProp.load(reader);  
		return configProp;
	}
	
	@BeforeMethod
	public void initialSetUp() {
		driver = new ChromeDriver();
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	public void waitForElement(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.visibilityOf(webElement));
	}
}
