package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class CreateAccount extends BaseClassm3{

	

	
    public void createAccount() throws InterruptedException {
	 Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
	    WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
	    driver.executeScript("arguments[0].click();", accountsTab);

        driver.findElement(By.xpath("//a[@title='New']")).click();
        String accountName = "Gokul";
        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
        WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
        driver.findElement(By.xpath("//span[@title='Public']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement toastElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage')]")));
        String toastMessage = toastElement.getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.toLowerCase().contains(accountName.toLowerCase().trim()),"Verify the Account name");
    }

}
