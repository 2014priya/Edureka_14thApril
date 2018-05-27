package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumFirstClassFile {

	public static void main(String[] args) {
		
		//Instantiate a Browser
		//Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox
				System.setProperty("webdriver.gecko.driver", "E:\\Installation Stuff\\Exe Files\\geckodriver.exe");
				WebDriver driver1 = new FirefoxDriver();
				
				
				//IE
				System.setProperty("webdriver.ie.driver", "E:\\Installation Stuff\\Exe Files\\IEDriverServer.exe");
				WebDriver driver2 = new InternetExplorerDriver();
		
		
	}

	
		
	}


