package module9.DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT1 {

	WebDriver driver;
	
	//under the test need to put method
	
	@Test (dataProvider ="TestData")
	public void ChromeTest( String Fname , String Laname) throws InterruptedException {

	//open the Browser
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		 driver = new ChromeDriver();
		//Open the AUT
	driver.get("http://seleniumautomationpractice.blogspot.fi/2017/10/automation-testing-sample_28.html"); 
		 
		//Enter Data in first name
	driver.findElement(By.id("ts_first_name")).sendKeys(Fname);
	
	//Enter Data in last name
	driver.findElement(By.id("ts_last_name")).sendKeys(Laname);
	
	Thread.sleep(5000);
		
		//close the Browser
	driver.close();
		
		}
	
	//We are using @Data Provider which actually feeds the data to our test cases. Here we are using 2D array.
	//We have 2 rows and 2 columns
	//It will run our test cases two times
	//Enter data into both the fields and it will close the browser and then again it will use the nest set of data to iterate
	
	
	@DataProvider(name="TestData")
	public Object [] [] TestDataFeed(){
		
		Object [][] InputData = new Object [2][2];
		
		
		//Enter date in the 0th row and 0th column
		InputData [0] [0] = "Priya"	;
		
		InputData [0] [1] = "Singh"	;
		
		InputData [1] [0] = "Vishesh"	;
		
		InputData [1] [1] = "Kumar"	;
		
		return InputData;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
