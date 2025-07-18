package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("98127");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		
	    WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		String leadId = firstLead.getText();
		System.out.println("FirstLead" + leadId);
		firstLead.click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys("10146");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
        String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);
		if (text.equals("No records to display")) {
			System.out.println("Lead id successfully deleted.");
		} 
		else {
			System.out.println("Lead id was NOT deleted.");
		}
		
		driver.close();
		
		
		
	}

}
