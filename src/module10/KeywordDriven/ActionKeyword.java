package module10.KeywordDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyword {
	
	
	static WebDriver driver;
	
	public static void openbrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		
	}
	
	public static void navigate() throws InterruptedException {
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		
	}
	
	public static void click_Gmail() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		Thread.sleep(5000);
	}

}
