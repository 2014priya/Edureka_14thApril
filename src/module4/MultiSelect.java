package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.fi/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		Select oSelect = new Select(driver.findElement(By.id("selenium_commands")));
		
		
		//By Visisble text
		oSelect.selectByVisibleText("Switch Commands");
		Thread.sleep(3000);
		oSelect.deselectByVisibleText("Switch Commands");
		Thread.sleep(3000);
		
		//Print All the name of the options selected by us
		List<WebElement> oSize = oSelect.getOptions();
		
		int iListsize = oSize.size();
		
		for(int i = 0; i<iListsize; i++ ) {
			
			String sValue =oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			
			oSelect.selectByIndex(i);
			Thread.sleep(3000);
			
			//one by one deselect
			oSelect.deselectByIndex(i);
			Thread.sleep(3000);
		
		}
		
		//oSelect.deselectAll();
		driver.close();
		

	}

}
