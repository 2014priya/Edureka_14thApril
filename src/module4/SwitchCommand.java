package module4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Instantiate a Browser Chrome
				System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.seleniumframework.com/Practiceform/");
				String handle = driver.getWindowHandle();
				
				System .out.println("Main Window name is"+ handle);
				System.out.println("------------------------------------");
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id=\'content\']/div[2]/div[2]/div/div[1]/div/p[3]/button")).click();
				
				Set AllWindowName = driver.getWindowHandles();
				
				System.out.println("All Windows name are"+ AllWindowName);
				System.out.println("--------------------------------------");
				Thread.sleep(4000);
				
				for (String newhandle : driver.getWindowHandles()) {
					
					System.out.println(newhandle);
					Thread.sleep(4000);
					driver.switchTo().window(handle);
					Thread.sleep(4000);
				    driver.switchTo().window(newhandle);
				    Thread.sleep(4000);
					
					
				}
				driver.close();
				Thread.sleep(4000);
				
				driver.quit();
				
				

	}

}
