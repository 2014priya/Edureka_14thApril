package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Elements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.fi/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		
		
		//driver.findElement(By.id("profession-0")).click();
		
		
		WebElement a = driver.findElement(By.id("profession-0"));
		boolean result = a.isSelected();
		
		System.out.println(result);
				
		
	}

}
