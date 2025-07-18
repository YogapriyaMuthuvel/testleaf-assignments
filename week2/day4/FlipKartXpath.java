package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Men's shrit");
		search.submit();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Men')])[2]")).click();
		
		

	}

}
