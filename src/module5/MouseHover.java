package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > button")).click();
		driver.findElement(By.name("q")).sendKeys("Jackets");
		
		driver.findElement(By.cssSelector("#container > div > header > div._1tz-RS > div > div > div > div._1NLCcM > form > div > div.col-1-12 > button")).click();
		Thread.sleep(3000);
		
		WebElement target = driver.findElement(By.cssSelector("#container > div > div:nth-child(2) > div > div._1XdvSH._17zsTh > div > div._2xw3j- > div > div:nth-child(3) > div._2SxMvQ > div:nth-child(1) > div:nth-child(3) > div > a.Zhf2z- > div:nth-child(1) > div > div > img"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
	}

}
