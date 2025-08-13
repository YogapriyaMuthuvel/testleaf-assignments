package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class CreateAccountPage extends BaseClass {
	
	public CreateAccountPage(EdgeDriver driver) {
		this.driver = driver;
	}

	public CreateAccountPage enterAccountName(String accountname) {
		driver.findElement(By.id("accountName")).sendKeys(accountname);
		return this;
    }
	
	public CreateAccountPage enterDescription(String description) {
		driver.findElement(By.name("description")).sendKeys(description);
		return this;
    }
	public CreateAccountPage enterNumberofEmployees(String numberofemployees) {
		driver.findElement(By.id("numberEmployees")).sendKeys(numberofemployees);
		return this;
    }
	public CreateAccountPage enterSiteName(String sitename) {
		driver.findElement(By.id("officeSiteName")).sendKeys(sitename);
		return this;
    }
	public ViewAccountPage clickCreateAccountButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
    }
	
	
	
	
	
	
}