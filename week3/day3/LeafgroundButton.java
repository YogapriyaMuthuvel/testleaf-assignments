package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the URL
		driver.get("https://leafground.com/button.xhtml");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Click on the button with the text ‘Click and Confirm title'
		String text = driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//title of the page
		String expectedTitle = "Dashboard";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Page title is correct.");
		}
		
		//Navigate to previous page
		Thread.sleep(2000);
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println("Is button enabled: "+enabled);
		
		
		// print the position of the button with the text Submit
		Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println("The location of submit button: " +location);
		
		
		// print the background color of the button with the text Find the Save button color
		String cssValue = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("The background color of the Save button: " +cssValue);
		
		//print the height and width of the button with the text Find the height and width of this button
		
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("The height and width of submit button is: " +size);
		
		//close the browser
		driver.close();
	}

}
