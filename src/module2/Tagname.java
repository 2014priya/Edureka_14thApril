package module2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		
		
		//Instantiate a Browser Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
        driver.get("https://www.facebook.com/");

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size ());
        
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i).getText());
        }
	}

	}
