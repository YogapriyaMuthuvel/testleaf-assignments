package week2.day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateNewAccount {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("leaf");
		
		WebElement dayElement = driver.findElement(By.id("day"));
		Select option1 = new Select(dayElement);
		option1.selectByIndex(6);
		
		WebElement monthElement = driver.findElement(By.id("month"));
		Select option2 = new Select(monthElement);
		option2.selectByVisibleText("May");
		
		WebElement yearElement = driver.findElement(By.id("year"));
		Select option3 = new Select(yearElement);
		option3.selectByValue("1999");
		
		List<WebElement> radios = driver.findElements(By.name("sex"));
		 radios.get(1).click();
	    
		driver.findElement(By.name("reg_email__")).sendKeys("test1@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("testleaf@123");
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
