package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyAccountPage extends BaseClass{
	public CreateAccountPage clickCreateAccount() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();

}
}
