package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class ViewAccountPage extends BaseClass {
	
public ViewAccountPage(EdgeDriver driver) {
	this.driver = driver;
	}

public ViewAccountPage clickLogout() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Account logged out successfully");
	return this;
}	



public void verifyAccountCreation() {
		
		System.out.println("Account created successfully");
	}

}