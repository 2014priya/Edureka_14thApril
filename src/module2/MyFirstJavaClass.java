package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyFirstJavaClass {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
           
		driver1.get("https://www.google.com/");
		
		
		driver1.quit();
           
		
	}

}
