package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	
	public MyHomePage clickCrmsfa() {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}