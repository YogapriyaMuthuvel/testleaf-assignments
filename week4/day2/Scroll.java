package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Maximize the browser

				driver.manage().window().maximize();
				
				//Load the URL
				driver.get("https://www.amazon.in/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
				//Create obj for actions class
				Actions act = new Actions(driver);
				//Find the Element
				WebElement scrollEle = driver.findElement(By.linkText("Conditions of Use & Sale"));
				//Use the method to scroll
				act.scrollToElement(scrollEle).perform();
				//click the condition url
				scrollEle.click();

	}

}
