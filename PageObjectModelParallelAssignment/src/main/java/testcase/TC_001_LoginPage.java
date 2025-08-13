package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_LoginPage extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		filename = "TC_001_Loginpage";
	}

	@Test(dataProvider = "fetchdata")
	
	public void LoginPage(String username, String password) {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton();
	}
}
