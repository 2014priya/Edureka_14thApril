package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		//Instantiate a Browser Chrome
				System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				WebDriverWait wait =new WebDriverWait(driver,30);
						
				driver.get("https://www.linkedin.com/");
				
				WebElement ForgotPwd= wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot password?")));
				//ForgotPwd=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Forgot password?")));
				ForgotPwd.click();
				
				
				driver.findElement(By.id("username")).sendKeys("Priya");
				
				WebElement SubmitButton;
				SubmitButton=wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmitResetRequest")));
				SubmitButton.click();
			
				
				
				

	}

}
