package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteractionandDataVerification {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://erail.in/");
		
		//Enter "MAS" as the "From" station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
		//Enter "MDU" as the "To" station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		//Uncheck the "Sort on Date" checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		// Retrieve the train names from the web table
		List<WebElement> trainName = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr/td[2]"));
        
		
        Set<String> uniqueTrains = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        
        //Verify if there are any duplicate train names in the web table
        System.out.println("Train Names:");
        for (int i = 0; i < trainName.size(); i++) {
            String trainName1 = trainName.get(i).getText().trim();
            System.out.println(trainName1);
            if (!uniqueTrains.add(trainName1)) {
                duplicates.add(trainName1);
            }
        }
           
        //print the duplicate train name
        System.out.println("\nDuplicate Train Names:");
            if (duplicates.isEmpty()) {
                System.out.println("No duplicates found.");
            } else {
                List<String> duplicateList = new ArrayList<>(duplicates);
                for (int i = 0; i < duplicateList.size(); i++) {
                    System.out.println(duplicateList.get(i));
                }
            }
        }
		}
		

	


