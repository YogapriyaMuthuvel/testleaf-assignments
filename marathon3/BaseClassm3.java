package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;




public class BaseClassm3 {
	
	public ChromeDriver driver;
	
	
	@Parameters({"url", "username", "password"})
	@BeforeMethod
	public void preConditions(String url, String username, String password) throws InterruptedException {
		
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get(url);
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.id("Login")).click();
   
	}
	
	@AfterMethod
	public void postConditions() {
		driver.close();
}
}