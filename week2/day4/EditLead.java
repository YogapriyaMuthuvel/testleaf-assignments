package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Yoga");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Suriya");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yoga123");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Tester");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yoga123@gmail.com");
		WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select option = new Select(stateElement);
		option.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	
		
		
		
		
		
	}

}
