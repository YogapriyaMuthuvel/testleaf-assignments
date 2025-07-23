package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonMobilePhonePrice {

	public static void main(String[] args) throws InterruptedException {

		// lanuch the browser
		ChromeDriver driver = new ChromeDriver();

		// launch the url
		driver.get("https://www.amazon.in/");

		// maximize the browser

		driver.manage().window().maximize();

		// click continue shopping
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();

		// search bar

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(3000);

		List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		System.out.println(pricelist);

		int number = pricelist.size();
		System.out.println("The size of the list is: " + number);

		// Declare the String List
		List<Integer> allPrices = new ArrayList<Integer>();

		for (int i = 0; i < number; i++) {
			String text = pricelist.get(i).getText().replace(",", "");

			if (!text.isEmpty()) {

				allPrices.add(Integer.parseInt(text));
			}

		}
		System.out.println(allPrices);
		if (!allPrices.isEmpty()) {
			Collections.sort(allPrices);
			int lowestPrice = allPrices.get(0);
			System.out.println("The lowest mobile price is: ₹" + lowestPrice);
		}

	}
}
