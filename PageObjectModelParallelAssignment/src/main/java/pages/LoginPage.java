package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(EdgeDriver driver) {
		this.driver = driver;	
	}
	
	public LoginPage enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	
    public LoginPage enterPassword(String password) {
    	driver.findElement(By.id("password")).sendKeys(password);
    	return this;
	}
    
    
    public WelcomePage clickLoginButton() {
    	driver.findElement(By.className("decorativeSubmit")).click();
    	return new WelcomePage(driver);
   	}
	

}