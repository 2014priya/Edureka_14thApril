package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.fi/2018/01/blog-post.html");
		
		driver.findElement(By.id("prompt")).click();
		Alert sAlert = driver.switchTo().alert();
		
		
		String alerttext = sAlert.getText();
		Thread.sleep(3000);
		
		System.out.println(alerttext);
		Thread.sleep(3000);
		
		sAlert.sendKeys("Priya Singh");
		Thread.sleep(3000);
		
		sAlert.accept();
		Thread.sleep(3000);
		
		driver.close();
	}

}
