package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		//Instantiate a Browser Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("tutuorial");
		driver.findElement(By.name("password")).sendKeys("tutuorial");
		driver.findElement(By.name("laogin")).click();
		
		driver.findElement(By.linkText("Profile")).click();
	}

}
