package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yoga1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suriya");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("abc");
		driver.findElement(By.className("smallSubmit")).click();
		
		String expectedTitle = "View Lead | opentaps CRM";
		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
		    System.out.println("Page title is correct.");
		} else {
		    System.out.println("Page title mismatch! Found: " + actualTitle);
		}
        driver.close();
		
	}

}
