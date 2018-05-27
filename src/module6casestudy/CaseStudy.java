package module6casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CaseStudy {

	
WebDriver driver;
	
	
	
@BeforeTest
public void openBrowser() {
	
	System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
	driver = new ChromeDriver();
	//Open the AUT
	
	
	driver.get("https://www.edureka.co/");
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
}

       @Test (priority =1)
     public void EdurekaTest() throws InterruptedException {
    	   
    	   driver.findElement(By.xpath("//*[@class='signin pull-right top-signin']")).click(); 
    	
}	
       
      @Test(priority =0 ,dependsOnMethods="EdurekaTest" ) 
      public void Login() throws InterruptedException {
       
    	 
	        
	        driver.findElement(By.xpath(".//*[@id='inputName' and @name='data[User][email]']")).sendKeys("abcedureka@gmail.com");
	        driver.findElement(By.xpath("//input[@id='inputName']//following::input[5]")).sendKeys("ABC@2018");
	        driver.findElement(By.cssSelector("#signinForm > div.forgotpasssec > button")).click();
		    

}

      @Test(priority =2,dependsOnMethods="Login")
      public void AllCourses() {
    	  
    	 driver.findElement(By.xpath("//*[@id=\"dropdownMenu3\"]")).click();
    	 WebElement option=driver.findElement(By.cssSelector("#navbar > ul > li:nth-child(2) > div > ul"));
    	 option.findElement(By.cssSelector("#navbar > ul > li:nth-child(2) > div > ul > li.ga-allcourses.ga_ecom_info > a")).click();
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      }
      
      
      
      
      
      
      
   }