package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Load the URL
		driver.get("https://www.irctc.co.in/");
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
		//close the alert
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(5000);
		//Click flight option 
		driver.findElement(By.linkText("FLIGHTS")).click();
		//Get the address of flight
		String parentAddress = driver.getWindowHandle();
		System.out.println(parentAddress);
		//Get Address of both opened tabs
		Set<String> allAddress = driver.getWindowHandles();
		System.out.println(allAddress);
		//convert set to list
		List<String> address = new ArrayList<String>(allAddress);
		//switch the focus to child tab(flight)
		driver.switchTo().window(address.get(1));
		String titleAfter = driver.getTitle();
		System.out.println("Title after switching: " + titleAfter);
		//Switch the focus to parent tab(irctc tab)
		driver.switchTo().window(address.get(0));
		driver.close();
				
	}

}
