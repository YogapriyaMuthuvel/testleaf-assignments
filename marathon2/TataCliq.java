package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Load the URL
		driver.get("https://www.tatacliq.com/");
		//close the popup
		driver.findElement(By.id("moe-dontallow_button")).click();
		//MouseHover on 'Brands'
		Actions act = new Actions(driver);
		WebElement mouseHoverEle1 = driver.findElement(By.xpath("//div[text()='Brands']"));
		act.moveToElement(mouseHoverEle1).perform();
		//MouseHover on 'Watches & Accessories'
		Actions act1 = new Actions(driver);
		WebElement mouseHoverEle2 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act1.moveToElement(mouseHoverEle2).perform();
		//Choose the first option from the 'Featured brands'
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//Select sortby: New Arrivals
		WebElement dropDown = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select options = new Select(dropDown);
		options.selectByVisibleText("New Arrivals");
		//choose men from catagories filter
		driver.findElement(By.className("CheckBox__base")).click();
		//print all price of watches
		Thread.sleep(3000);
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));
		int numberOfProducts = prices.size();
		List<String> allPrices = new ArrayList<String>();
		for(int i = 0; i < numberOfProducts; i++) {
			String watchPrices = prices.get(i).getText();
			allPrices.add(watchPrices);
			System.out.println(watchPrices);
		}
		//click on the first resulting watch
		driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		
		String parentAddress = driver.getWindowHandle();
		System.out.println(parentAddress);
		
		Set<String> allAddress = driver.getWindowHandles();
		System.out.println(allAddress);
		
		List<String> address = new ArrayList<String>(allAddress);
		//switch the focus to child
		driver.switchTo().window(address.get(1));
		String priceofWatch = driver.findElement(By.xpath("//h3[contains(text(),'MRP:')]")).getText();
		System.out.println(priceofWatch);
		String listPagePrice  = allPrices.get(0);
		//compare two price are similar
		if(priceofWatch.contains(listPagePrice)) {
			System.out.println("Prices match: ₹" + priceofWatch);
		} else {
			System.out.println("Price mismatch! List: ₹" + listPagePrice + " | Detail: ₹" + priceofWatch);
		}
			
		//click Add to cart and get count from the cart icon
		Thread.sleep(3000);
		//driver.findElement(By.className("mobile-number-login__loginCloseBtn")).click();
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String countFromCart = driver.findElement(By.xpath("//span[text()='1']")).getText();
		System.out.println(countFromCart);
		//Click on the cart
		driver.findElement(By.className("DesktopHeader__myBagShow")).click();
		//Take a snap of the resulting page
		WebElement myBag = driver.findElement(By.className("CartPage__base"));
	      File source = myBag.getScreenshotAs(OutputType.FILE);
	      File destination = new File("./Data/myBag.png");
	      FileUtils.copyFile(source, destination);
		//Close All the opened windows one by one
	      driver.close();
	      
	      driver.switchTo().window(address.get(0));
	      driver.close();
		

	}

}
