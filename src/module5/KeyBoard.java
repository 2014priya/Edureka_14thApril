package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement UName = driver.findElement(By.name("email"));
		
		Actions act = new Actions(driver);
		
		Action newact = act.moveToElement(UName)
				.click()
				.keyDown(UName, Keys.SHIFT)
				.sendKeys(UName , "Priya")
				.keyUp(UName, Keys.SHIFT)
				.doubleClick(UName)
				.contextClick().build();
		
		newact.perform();
			
				
		

	}

}
