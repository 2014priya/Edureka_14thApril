package module4;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver,30);
		
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'bookingflightTab\']/div[2]/div[1]/ul[1]/li[2]/a")).click();
		WebElement cpopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"globalModal\"]/div/div/div[1]/button")));
		cpopup.click();
	    Thread.sleep(3000);
	    
		driver.findElement(By.xpath("//*[@id=\'oneWay\']/form/div[1]/ul/li[1]/input[1]")).click();
		WebElement option =driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[1]/div/ul"));
		option.findElement(By.xpath(".//a[contains(text(),'Bengaluru (BLR)')]")).click();
		Thread.sleep(3000);
		
		
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[2]/div/ul"));
		option1.findElement(By.linkText("Lucknow (LKO)")).click();
		Thread.sleep(3000);
		
		
		Select oSelect = new Select(driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[1]/label[2]/select")));
		oSelect.selectByVisibleText("3");
		Thread.sleep(3000);
		
		
		Select oSelect1 =new Select(driver.findElement(By.xpath("//*[@id=\"oneWay\"]/form/div[1]/ul/li[3]/div/div[2]/label[2]/select")));
		oSelect1.selectByVisibleText("2");
		Thread.sleep(3000);
		
	
		driver.findElement(By.name("indiGoOneWaySearch.DepartureDate")).click();
		Thread.sleep(3000);
		
	
		
		
		WebDriverWait waitElement = new WebDriverWait(driver,50);
		WebElement SearchButton;
		SearchButton = waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"oneWay\"]/form/div[2]/button")));
		SearchButton.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		

	}
 
}

