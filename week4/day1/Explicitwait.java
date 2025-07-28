package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// Load the URL
		driver.get("https://leafground.com/window.xhtml");
		
		//Click the open with delay button
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		//Add explicit wait
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
		Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println(until);
	}

}
