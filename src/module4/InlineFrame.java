package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InlineFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Instantiate a Browser Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com");
		
		List<WebElement> iFrame = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total No. of Online Frames are "+ iFrame.size());
		
	
	}

}
