package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_003_CreateAccount extends BaseClass {
	  
	@BeforeTest
	public void setValues() {
		filename = "TC_003_Createaccount";
	}

	@Test(dataProvider = "fetchdata")
		public void CreateAccount(String username, String password, String accountname, String description, String numberofemployees, String sitename) {
			
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
			.clickCreateAccountButton();
			
			
		}

	}

