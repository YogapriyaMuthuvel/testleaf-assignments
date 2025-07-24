package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("https://leafground.com/alert.xhtml");

		// Maximize the browser
		driver.manage().window().maximize();

		//click show button
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
        //Transfer to alert
		Alert confirmAlert = driver.switchTo().alert();
		
		//Get text in Alert box
		String text = confirmAlert.getText();
		System.out.println(text);
		
	   //Accept the alert
		Thread.sleep(5000);
		confirmAlert.accept();
		

	}

}
