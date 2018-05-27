package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		//Instantiate a Browser Chrome
				System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.google.com/");
				
				String appTitle =driver.getTitle();
				
				System.out.println(appTitle);
				
				boolean result =appTitle.equals("Google");
				
				System.out.println("Result-" +result);
				
	}

}
