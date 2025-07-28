package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingandInteraction {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter the user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    //Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on contacts button
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//input[@name='partyIdFrom']/following-sibling::a")).click();
		
		//Get the address of current page
		String parentAddress = driver.getWindowHandle();
		System.out.println(parentAddress);
		
		//Get the address of all the opened window
	    Set<String> allAddress = driver.getWindowHandles();
	    System.out.println(allAddress);
	    
	    //Convert set to list
	    List<String> address = new ArrayList<String>(allAddress);
	    
	    //Transfer the focus to the child window
	    driver.switchTo().window(address.get(1));
	    
	    //Click on the first resulting contact
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[1]")));	    
	    until.click();
	   
	    //Transfer the focus to parent window
	    driver.switchTo().window(address.get(0));
	    
	    //Click on the widget of the "To Contact"
	    driver.findElement(By.xpath("//input[@name='partyIdTo']/following-sibling::a")).click();
	    
	    //Get the new set of address
	    String parentAddress1 = driver.getWindowHandle();
	    System.out.println(parentAddress1);
	    
	   //Get the address of all the opened window
	    Set<String> allAddress2 = driver.getWindowHandles();
	    System.out.println(allAddress2);
	    
	   //Convert set to list
	    List<String> address2 = new ArrayList<String>(allAddress2);
	    
	   //Transfer the focus to the child window
	    driver.switchTo().window(address2.get(1));
	    
	    //Click on the second resulting contact 
	    WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement until2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[6]")));
        until2.click();
	    
	    //Transfer the focus to the parent window
        driver.switchTo().window(address2.get(0));
	    
        //click on merge
        driver.findElement(By.className("buttonDangerous")).click();
        
        //Accept the alert
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());
	    

	    
	    


	    
	  
	    
	    
	   
	   

	}

}
