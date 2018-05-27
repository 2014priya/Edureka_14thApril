package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Edureka {

	public static void main(String[] args) throws InterruptedException {
		
		//Instantiate a Browser Chrome
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.edureka.co/");
		
		driver.findElement(By.xpath("//a[@href ='javascript:void(0);' and @class = 'signin pull-right top-signin']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='inputName' and @name='data[User][email]']")).sendKeys("Priya");
		
		driver.findElement(By.xpath("//input[@id='inputName']//following::input[5]")).sendKeys("Priya");

	}

}
