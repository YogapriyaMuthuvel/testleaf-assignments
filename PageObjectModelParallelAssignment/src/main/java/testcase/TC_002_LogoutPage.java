package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_LogoutPage extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		filename = "TC_003_Createaccount";
	}

	@Test(dataProvider = "fetchdata")
	
	public void LogoutPage(String username, String password, String accountname, String description, String numberofemployees, String sitename) throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfa()
		.clickAccountsLink()
		.clickCreateAccount()
		.enterAccountName(accountname)
		.enterDescription(description)
		.enterNumberofEmployees(numberofemployees)
		.enterSiteName(sitename)
		.clickCreateAccountButton()
		.clickLogout();
		
		
	}

}
