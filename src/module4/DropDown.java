package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.fi/2017/10/functionisogramigoogleanalyticsobjectri.html");

		Select oSelect = new Select (driver.findElement(By.id("continents")));
		
		//By Visible Text
		oSelect.selectByVisibleText("Africa");
		Thread.sleep(3000);
		
		
		//By Index
		oSelect.selectByIndex(4);
		Thread.sleep(3000);
		
		//By value
		oSelect.selectByValue("g");
		Thread.sleep(3000);
		
		driver.close();
	}

}
