package module3;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		//Instantiate a Browser Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("Blockchain")).click();
		driver.navigate().back();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		 WebElement element= driver.findElement(By.id("homeSearchBar"));
	     element.sendKeys("Selenium");
	     element.submit();
	     
	      WebDriverWait wait =new WebDriverWait(driver,30);
			
			WebElement Selenium= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium Certification Training")));
			Selenium.click();
	     
			String Title =driver.getTitle();
			
			System.out.println(Title);
			
			boolean result =Title.equals("Selenium 3.0 WebDriver Online Training | Selenium Certification Course | Edureka");
			
			System.out.println("Result-" +result);
		 
			driver.navigate().back();
			
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath(".//*[text()='All Courses' and @class='listitem']")).click();
			
			FluentWait<WebDriver> wait1 = new FluentWait<WebDriver> (driver);
			wait1.pollingEvery(250, TimeUnit.MILLISECONDS);
			wait1.withTimeout(2, TimeUnit.MINUTES);
			wait1.ignoring(NoSuchElementException.class); 
			
			
	       Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
				
				public WebElement apply(WebDriver argO) {
					System.out.println("Checking for All courses!");
					WebElement element=argO.findElement(By.xpath(".//*[text()='All Courses' and @class='listitem']"));
					element.click();
					if (element !=null) {
					System.out.println("All courses are loaded");	
						}
					return element;
					}
			};
			wait .until(function);
			
			
			
		}
			
	}


