package steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSalesStepDefinition extends BaseClassSales {
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver();
	    
	}

	@And("Load the URL")
	public void load_the_url() {
		driver.get("https://login.salesforce.com");
	    
	}

	@And("Enter the username as {string}")
	public void enter_the_username_as(String username) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(username);
	    
	}

	@And("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	   
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	    driver.findElement(By.id("Login")).click();
	}

	@Then("It should be logged in")
	public void it_should_be_logged_in() {
		System.out.println("Login should be successful");
	    
	}

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	    
	}

	@And("Click view All")
	public void click_view_all() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	    
	}

	@And("Click Sales from App Launcher")
	public void click_sales_from_app_launcher() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    
	}

	@And("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		Thread.sleep(3000);
        WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click();", accountsTab);
	}
	
	@And("Click on New button")
	public void click_on_new_button() {
		 driver.findElement(By.xpath("//div[@title='New']")).click();
	}

	@Given("Enter {string} as account name")
	public void enter_as_account_name(String accountname) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(accountname);
	}

	@And("Select Ownership as Public")
	public void select_ownership_as_public() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    By ownershipDropdownLocator = By.xpath("//label[text()='Ownership']/following::button[1]");
		    WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(ownershipDropdownLocator));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dropdown);
		    WebElement publicOption = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Public']"))
		    );
		    publicOption.click();
	}

	@When("Click save and verify Account name")
	public void click_save_and_verify_account_name() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='SaveEdit']")));
		    saveButton.click();
	}

	@Then("Account name to be verified")
	public void account_name_to_be_verified() {
		String accountName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
        if (accountName.equals("Yoga")) {
            System.out.println("Account created successfully: " + accountName);
        } else {
            System.out.println("Account creation failed");
        }
	}


}
