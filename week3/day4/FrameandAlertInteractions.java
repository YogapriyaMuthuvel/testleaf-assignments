package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameandAlertInteractions {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Launch the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Switch to frames
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Switch to Alert
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Harry Potter");

		Thread.sleep(5000);
		alert1.accept();

		// get the text
		WebElement element = driver.findElement(By.id("demo"));
		String text = element.getText();

		// Verify text displayed correct
		if (text.contains("Harry Potter")) {
			System.out.println("The text is displayed correctly: " + text);
		} else {
			System.out.println("The displayed text is incorrect");
		}
        
		//Reload the page to reset
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

		// Launch the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Maximize the browser
		driver.manage().window().maximize();

		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		// Switch to frames
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// Switch to Alert
		Alert alert2 = driver.switchTo().alert();

		alert2.dismiss();

		// get the text
		WebElement element1 = driver.findElement(By.id("demo"));
		String text1 = element1.getText();

		// Verify text displayed correct
		if (text1.contains("User cancelled the prompt.")) {
			System.out.println("The text is displayed correctly: " + text1);
		} else {
			System.out.println("The displayed text is incorrect");
		}

	}

}
