package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalDialogBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.fi/2018/04/popups.html");

		driver.findElement(By.xpath("//*[@id=\'post-body-5871078819124590039\']/a")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\'post-body-5871078819124590039\']/div/div/input")).sendKeys("Priya Singh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-body-5871078819124590039\"]/div/div/ul[1]/li[2]/button")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-body-5871078819124590039\"]/div/div/ul[1]/li[1]/button")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
