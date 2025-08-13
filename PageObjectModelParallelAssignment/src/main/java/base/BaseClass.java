package base;

import java.io.IOException;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;

public class BaseClass {
	
public EdgeDriver driver;
public String filename;
	
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

	@DataProvider(name = "fetchdata")
	public String[][] setData() throws IOException {
	String[][] readData = ReadExcel.readData(filename);
	return readData;
	
}
}
