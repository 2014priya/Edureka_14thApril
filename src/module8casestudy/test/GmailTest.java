package module8casestudy.test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import module8casestudy.object.GmailLoginPageObjects;

public class GmailTest {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com/gmail/about/#");
		driver.findElement(By.cssSelector("body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
		
		
		GmailLoginPageObjects page = new GmailLoginPageObjects(driver);
		
		page.GmailLogin("abcpriya2018@gmail.com");
		
		Thread.sleep(4000);
		page.GmailLogin1("Spring@05");
		
		
		new WebDriverWait(driver, 35).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")))	; 
		page.GmailLogin5("Compose");
		
		Thread.sleep(3000);
		
		page.GmailLogin2("vishesh_1987@yahoo.com");
		
		Thread.sleep(3000);
		
		page.GmailLogin3("Hello");
		
		Thread.sleep(3000);
		
		page.GmailLogin4("I miss Vishesh");

	}

}
