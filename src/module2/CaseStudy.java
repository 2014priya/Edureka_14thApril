package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
           
			driver1.get("https://www.edureka.co/");
		
	        driver1.manage().window().maximize();
	        
	        
	       WebElement element= driver1.findElement(By.id("homeSearchBar"));
	       element.sendKeys("Selenium");
	       element.submit();
	       Thread.sleep(3000);
	       
	        driver1.navigate().back();
		      
		    driver1.findElement(By.linkText("Blockchain")).click();
		    Thread.sleep(3000);
	        driver1.navigate().back();
		      
	        
	        driver1.findElement(By.partialLinkText("Corp")).click();
	        driver1.findElement(By.className("form-control")).sendKeys("ABC");
	        driver1.findElement(By.name("organization")).sendKeys("ABC limited");
	        driver1.findElement(By.cssSelector("#top-corp-form > div > div:nth-child(3) > input")).sendKeys("abc2018@gmail.com");
	        
	        driver1.navigate().back();
	             
	        driver1.findElement(By.xpath("//*[@class='signin pull-right top-signin']")).click();
	        
	        Thread.sleep(3000);
	        
	        driver1.findElement(By.xpath(".//*[@id='inputName' and @name='data[User][email]']")).sendKeys("abc2018@gmail.com");
	        
	        driver1.findElement(By.xpath("//input[@id='inputName']//following::input[5]")).sendKeys("Priya@2018");
	        
		  
		   
		   List<WebElement> list = driver1.findElements(By.tagName("a"));
	        System.out.println(list.size ());
	        
	        for(int i=0; i<list.size(); i++) {
	        	System.out.println(list.get(i).getText());
	       
	        
	        
		
		
	        }
		
		
	}

}
