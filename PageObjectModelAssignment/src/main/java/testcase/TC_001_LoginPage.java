package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_LoginPage extends BaseClass {
	
	
		@Test
		public void CreateAccount() {
			
			LoginPage lp = new LoginPage();
			lp.enterUserName()
			.enterPassword()
			.clickLoginButton()
			.clickCrmsfa()
			.clickAccountsLink()
			.clickCreateAccount()
			.enterAccountName()
			.enterDescription()
			.enterNumberofEmployees()
			.enterSiteName()
			.clickCreateAccountButton()
			.verifyAccountCreation();
		}

	}


