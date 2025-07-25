package marathon1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the browser

		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		//Search bags for boys
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		
		driver.findElement(By.xpath("(//div[text()='bags for boys'])[1]")).click();
		
		//Print the total number of results
		String text = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		String text1 = driver.findElement(By.xpath("(//span[contains(text(),'bags for boys')])[1]")).getText();
		System.out.println("The number of results: " +text +" " +text1);
		
		//Select the first 2 brands in the left menu
		 List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@id='brandsRefinements']//li//label"));
		 Thread.sleep(3000);
		 checkBoxes.get(0).click();
		 
		 Thread.sleep(3000);
		 checkBoxes = driver.findElements(By.xpath("//div[@id='brandsRefinements']//li//label"));
		 checkBoxes.get(1).click();
		 
		//Choose New Arrivals (Sort) 
		driver.findElement(By.className("a-dropdown-container")).click();
		 
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		//Print the first resulting bag info (name)
		String text2 = driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])/span[1]")).getText();
	    System.out.println("The bag name is: "+text2);
	    
	    //Print the first resulting bag info (discounted price)
	    String text3 = driver.findElement(By.className("a-price")).getText();
	    System.out.println("The price of the bag is: "+text3);
	    
	    //Get the page title
	    String pageTitle = driver.getTitle();
	    System.out.println("The page title is: " +pageTitle);
	    
	    //close the browser
	    driver.close();
	
	}
	

}
