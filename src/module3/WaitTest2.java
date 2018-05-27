package module3;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitTest2 {

	public static void main(String[] args) {
		//Instantiate a Browser Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.fi/2017/10/5-clearintervaltimer2-counter1-counter1.html");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.MINUTES);
		wait.ignoring(NoSuchElementException.class); //we need to ignore this 
														//exception
		
Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver argO) {
				System.out.println("Checking for the Object!");
				WebElement element=argO.findElement(By.linkText("dynamicText4"));
				if (element !=null) {
				System.out.println("A new dynamic object is found");	
					}
				return element;
				}
		};
		wait .until(function);
		
		driver.close();
	}

}
