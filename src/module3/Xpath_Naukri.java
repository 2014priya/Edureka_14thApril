package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Naukri {

	public static void main(String[] args) throws InterruptedException {
		
		//Instantiate a Browser Chrome
				System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://login.naukri.com/nLogin/Login.php");
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@id='usernameField' or @id ='emailTxt']")).sendKeys("Priya");
				
				
	}

}
