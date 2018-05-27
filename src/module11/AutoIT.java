package module11;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class AutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
           
		driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver1.get("http://seleniumautomationpractice.blogspot.fi/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		
	     driver1.findElement(By.id("photo")).click();
	
		
		
		
		
		Runtime.getRuntime().exec("E:\\AutoIT\\UploadDoc1.exe");

		Thread.sleep(4000);
		
		
	}

}
