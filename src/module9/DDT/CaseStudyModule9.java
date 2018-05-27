package module9.DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CaseStudyModule9 {
	
	
	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrow;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		//Open the AUT
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/"); 
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@class='signin pull-right top-signin']")).click();
        Thread.sleep(3000);
		
		
	}
	
	@Test(dataProvider ="TestData1")
	
	public void EdurekaTest(String Email , String Pwd) throws InterruptedException {
		
		
		driver.findElement(By.xpath(".//*[@id='inputName' and @name='data[User][email]']")).sendKeys(Email);
		
	    driver.findElement(By.xpath("//input[@id='inputName']//following::input[5]")).sendKeys(Pwd);
	    
		driver.findElement(By.cssSelector("#signinForm > div.forgotpasssec > button")).click();
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a")).click();
		
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

	driver.findElement(By.xpath("//input[@placeholder=\"Search edureka blogs\"]")).sendKeys("Selenium");
	driver.findElement(By.xpath("//input[@placeholder=\"Search edureka blogs\"]")).sendKeys(Keys.ENTER); 
	driver.findElement(By.xpath("//*[text()=\"Interview Questions\"]")).click(); 
       
		
		
	

}

	@DataProvider(name="TestData1")
	public Object [] [] TestDataFeed() throws IOException, BiffException{
		
		FileInputStream fis = new FileInputStream("E:\\Programs\\Edureka_14thApril\\src\\module9\\testdata\\TestData1.xls");
		
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet(0);
		
		numrow =sh.getRows();
		
		Object [] [] FormData = new Object[numrow][sh.getColumns()];
		
		for (int i=0; i<numrow; i++) {		
		
			FormData [i][0]=sh.getCell(0, i).getContents();
			FormData [i][1]=sh.getCell(1, i).getContents();
			
		
	}
		
		return FormData;
	}

}