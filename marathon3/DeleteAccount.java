package marathon3;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class DeleteAccount extends BaseClassm3 {

	
    public void deleteAccount() throws InterruptedException {
		
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
			Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[text()='View All']")).click();
		    driver.findElement(By.xpath("//p[text()='Sales']")).click();
			Thread.sleep(3000);
		    WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
		    driver.executeScript("arguments[0].click();", accountsTab);

        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Gokul"+ Keys.ENTER);
        Thread.sleep(2000);
        String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        String[] s = noOfItems.split(" ");
        int countBeforeDelete = Integer.parseInt(s[0]);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
        driver.findElement(By.xpath("//a[@title='Delete']")).click();
        driver.findElement(By.xpath("//button[@title='Delete']")).click();
        Thread.sleep(2000);
        noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        s = noOfItems.split(" ");
        int countAfterDelete = Integer.parseInt(s[0]);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement deleteToast = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage')]")));
        String deleteMsg = deleteToast.getText();
        System.out.println(deleteMsg);
        Assert.assertTrue(deleteMsg.toLowerCase().contains("deleted"),"Verify the account has deleted");

    }


}
