package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Locators {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub
		
		//Instantiate a Browser Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://www.facebook.com/");
		
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Priya");

        
        
        
        
        
        
        
        
        
        /*
		driver.findElement(By.id("u_0_d")).sendKeys("Priya");
		
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("1234567890");
		

		
		driver.findElement(By.linkText("Forgot account?")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Forgot")).click();
	
        
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("#u_0_a")).click();
*/
        
        
	}

}
