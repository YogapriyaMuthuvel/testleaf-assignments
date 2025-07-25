package marathon1;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException  {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
				
				//Load the URL
				driver.get("https://www.pvrcinemas.com/");
				
				//Click on Cinema under Quick Book
				driver.findElement(By.xpath("//span[text()='Cinema']")).click();
				
				////Select Your Cinema
				driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//span[contains(text(),'INOX Smartcity Mall Dharwad')]")).click();
				
				//Select date
				Thread.sleep(1000);

				driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
				
				//Select movie name
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//span[text()='THE FANTASTIC FOUR: FIRST STEPS']")).click();
				
				//Select the time
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//span[contains(text(),'05:00 PM')]")).click();
				
				//Click book button
				driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
				
				//click Accept in terms & condition
				Thread.sleep(3000);

				driver.findElement(By.xpath("//button[text()='Accept']")).click();
				
				//select the seat number
				driver.findElement(By.xpath("//span[@id='EX.Executive|I:13']")).click();
				
				//print seat info		
				String seatInfo = driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
				System.out.println("Seatinfo:" +seatInfo);
				
				//print grand total
				String grandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
				System.out.println("Grandtotal:" +grandTotal);
				
				//click on proceed
				driver.findElement(By.xpath("//button[text()='Proceed']")).click();
				
				//Close the pop-up
				Thread.sleep(5000);
				driver.findElement(By.xpath("//h6[text()='SKIP']")).click();
				
				//print the current page title
				String pageTitle = driver.getTitle();
				System.out.println("Current page Title:" +pageTitle);
				
				//close the browser
				Thread.sleep(2000);
				driver.close();
				
	    
			
			

		
		
		
		
		
		
		

	}

}
