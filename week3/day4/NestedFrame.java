package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Launch the URL
				driver.get("https://leafground.com/frame.xhtml");

				// Maximize the browser
				driver.manage().window().maximize();
				
				//Outerframe
				WebElement outerFrameElement = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
				driver.switchTo().frame(outerFrameElement);
				
				//inner frame
				WebElement innerFrameElement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
				driver.switchTo().frame(innerFrameElement);
				
				//click the clickme button
				driver.findElement(By.id("Click")).click();
				
				String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
				System.out.println(text);
	}

}
