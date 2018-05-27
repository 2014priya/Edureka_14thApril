package module9.DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class DDT2 {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrow;
	
	@BeforeTest
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		//Open the AUT
		driver.get("http://seleniumautomationpractice.blogspot.fi/2017/10/automation-testing-sample_28.html"); 
		
		
	}
	
	@Test(dataProvider = "TestData")
	public void ChromeTest(String Fname , String Lname, String Address) throws InterruptedException {
	
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(Fname);
		
		
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(Lname);
		
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys(Address);
		
		Thread.sleep(5000);
	
	}
	
	@DataProvider(name="TestData")
	public Object [] [] TestDataFeed() throws IOException, BiffException{
		
		FileInputStream fis = new FileInputStream("E:\\Programs\\Edureka_14thApril\\src\\module9\\testdata\\TestData.xls");
		
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet(0);
		
		numrow =sh.getRows();
		
		Object [] [] FormData = new Object[numrow][sh.getColumns()];
		
		for (int i=0; i<numrow; i++) {		
		
			FormData [i][0]=sh.getCell(0, i).getContents();
			FormData [i][1]=sh.getCell(1, i).getContents();
			FormData [i][2]=sh.getCell(2, i).getContents();
			
		
	}
		
		return FormData;
	}
	@AfterTest 
	public void QuitBrowser() {
	driver.quit();
	
}
	
}


