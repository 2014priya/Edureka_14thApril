package module8.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module8.object.GoogleHomePageObjects;

public class GoogleSearchTest {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		
		page.SearchGoogle("SeleniumHQ");
		
		page.SearchGoogle("Edureka");
		
	}

}
