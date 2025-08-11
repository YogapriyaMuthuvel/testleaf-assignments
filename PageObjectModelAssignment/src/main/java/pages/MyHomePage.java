package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyAccountPage clickAccountsLink() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}

}