package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Maximize the browser

				driver.manage().window().maximize();
				
				//Load the URL
				driver.get("https://www.leafground.com/table.xhtml");
				
				//To retrieve entire second column data
				List<WebElement> column2 = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[2]"));
				for(int i = 0; i < column2.size(); i++) {
					String text = column2.get(i).getText();
					System.out.println(text);
				}
	}

}
