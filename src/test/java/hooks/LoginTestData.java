package hooks;

import org.testng.annotations.DataProvider;

public class LoginTestData {
	
	@DataProvider(name = "loginData")
    public static Object[][] getLoginData() {
        return new Object[][] {
            {"bgayathri1993@gmail.com", "password@1"},
            {"abc@g.com", "word2"},
            // Add more test data sets as needed
        };
    }

}
