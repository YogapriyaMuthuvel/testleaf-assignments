package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsAmazon { 

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Maximize the browser

				driver.manage().window().maximize();
				
				//Load the URL
				driver.get("https://www.amazon.in/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
				
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				String priceOfFirstProduct = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
				System.out.println("The price of first product is: " +priceOfFirstProduct);
				
				String rating = driver.findElement(By.xpath("//span[text()='302']")).getText();
				System.out.println("The rating of first product is: " +rating);
				
				driver.findElement(By.xpath("//span[text()='TheGiftKart Back Cover for OnePlus 9 Pro 5G (TPU, Poly Carbonate | Transparent)']")).click();

				WebElement mobile = driver.findElement(By.id("ppd"));
				
				File source = mobile.getScreenshotAs(OutputType.FILE);
				
			    File Destination =new File("./Data/mobile.png");
			    
			    FileUtils.copyFile(source, Destination);
				
				driver.findElement(By.id("add-to-cart-button")).click();
				
				WebElement cartSubtotal = driver.findElement(By.id("sw-subtotal"));
				String subtotalText = cartSubtotal.getText();
				
				 String subTotal = subtotalText.replace("₹", "").replace(",", "").trim();
			     String productPrice = priceOfFirstProduct.replace(",", "").trim();

			     System.out.println("Cart Subtotal: ₹" + subTotal);
			     System.out.println("Product Price: ₹" + productPrice);
			     
			     if (subTotal.equals(productPrice)) {
			            System.out.println("Cart subtotal matches product price.");
			        } else {
			            System.out.println("Cart subtotal does NOT match product price.");
			        }
				driver.close();

	}

}
