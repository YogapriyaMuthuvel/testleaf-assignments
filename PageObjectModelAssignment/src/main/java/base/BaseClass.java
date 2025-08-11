package base;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
public static EdgeDriver driver;
	
	@BeforeMethod
	public void preConditions() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\91959\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	
	public void postConditions() {
		
		driver.close();
	}

}
