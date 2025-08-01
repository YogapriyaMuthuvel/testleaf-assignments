package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;



public class OrderingMobile {

	public static void main(String[] args) throws IOException {
		//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Load the URL
				driver.get("https://dev209663.service-now.com/");
				//Login with valid credentials username as admin and password
				driver.findElement(By.id("user_name")).sendKeys("admin");
				driver.findElement(By.id("user_password")).sendKeys("qy/Q6A=vOM3x");
				driver.findElement(By.id("sysverb_login")).click();
				//Click-All & Click the ServiceCatalog
				Shadow shadow = new Shadow(driver);
				shadow.setImplicitWait(20);
				shadow.findElementByXPath("//div[text()='All']").click();
				shadow.findElementByXPath("//span[text()='Service Catalog']").click();
				WebElement ele1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
				driver.switchTo().frame(ele1);
				//Click on  mobiles
				driver.findElement(By.linkText("Mobiles")).click();
				//Select Apple iphone13pro
				driver.findElement(By.linkText("Apple iPhone 13 pro")).click();
				//Choose yes option in lost or broken iPhone
				driver.findElement(By.xpath("(//label[@class='radio-label'])[1]")).click();
				//Enter phonenumber as 99 in original phonenumber field
				driver.findElement(By.id("IO:4afecf4e9747011021983d1e6253af34")).sendKeys("99");
				//8. Select Unlimited from the dropdown in Monthly data allowance
				WebElement dropDown = driver.findElement(By.id("IO:ff1f478e9747011021983d1e6253af68"));
				Select options = new Select(dropDown);
				options.selectByVisibleText("Unlimited [add $4.00]");
				
				//9. Update color field to SierraBlue and storage field to 512GB
				driver.findElement(By.xpath("(//label[@class='radio-label'])[7]")).click();
				driver.findElement(By.xpath("(//label[@class='radio-label'])[10]")).click();
				//10. Click on Order now option
				driver.findElement(By.id("oi_order_now_button")).click();
				//11. Verify order is placed and copy the request number
				WebElement confirmationMsg = driver.findElement(By.xpath("(//div[@class='notification notification-success'])//span[2]"));
				String msg = confirmationMsg.getText();
				System.out.println("Actual confirmation message:" +msg);

				if (msg.toLowerCase().contains("your request") && msg.toLowerCase().contains("submitted")) {
				    System.out.println("Order successfully placed.");
				} else {
				    System.out.println("Order not placed.");
				}

				WebElement reqElement = driver.findElement(By.xpath("//a[@id='requesturl']/b"));
				String requestNumber = reqElement.getText();
				System.out.println("Request Number: " + requestNumber);
				
				//Take a Snapshot of order placed page
				File source = driver.getScreenshotAs(OutputType.FILE);
				File destination = new File("./Data/orderstatus.png");
				FileUtils.copyFile(source, destination);
				
				
				
	}

}
