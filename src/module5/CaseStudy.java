package module5;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver1,30);
			driver1.get("https://www.edureka.co/");
			driver1.manage().window().maximize();
			
	        driver1.findElement(By.xpath("//*[@class='signin pull-right top-signin']")).click();
	        
	        Thread.sleep(3000);
	        
	        driver1.findElement(By.xpath(".//*[@id='inputName' and @name='data[User][email]']")).sendKeys("abcedureka@gmail.com");
	        driver1.findElement(By.xpath("//input[@id='inputName']//following::input[5]")).sendKeys("ABC@2018");
		    driver1.findElement(By.cssSelector("#signinForm > div.forgotpasssec > button")).click();
		    Thread.sleep(3000);
		    
		    driver1.findElement(By.className("webinar-profile-name")).click();
		    Thread.sleep(3000);
		    
		    WebElement target = driver1.findElement(By.cssSelector("#header-II > section > nav > div > ul.nav.navbar-nav.navbar-right.profile.pull-right > li.dropdown.userdrop.hidden-sm.hidden-xs.open > ul > li:nth-child(1) > a"));
		    target.click();
		   Thread.sleep(3000);
		   
		   driver1.findElement(By.cssSelector("#myprofile > div.col-lg-4.col-md-4.col-sm-12.col-xs-12.p-init.bg-white.prof-pic-contant > div > h5 > span > i")).click();
		   Thread.sleep(3000);
		   
		   driver1.findElement(By.name("designation")).sendKeys("Software Quality Engineer");
		   Thread.sleep(3000);
		   driver1.findElement(By.cssSelector("#profile_detail > div.col-md-12.p-init > div > form > div.col-lg-9.col-md-9.col-sm-12.col-xs-12.profile_deatil_edit > div > div:nth-child(2) > div.col-md-6.p-init-right.p-init-sm > div > input")).sendKeys("TCS");
		   Thread.sleep(3000);
		   driver1.findElement(By.className("btn-lg-orange-white")).click();
		   
		   Thread.sleep(3000);
		    
		   Select oSelect = new Select(driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[1]/div/div/div/div/select")));
		   oSelect.selectByVisibleText("4-7 years");
		   Thread.sleep(5000);
		   
		   
		  Select oSelect1 = new Select(driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[2]/div/div/div/div/select")));
		   oSelect1.selectByVisibleText("5-10 LPA");
		   Thread.sleep(3000);
		   

		   Select oSelect2 = new Select(driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[3]/div/div/div/div/select")));
		   oSelect2.selectByVisibleText("IT-Software / Software Services");
		   Thread.sleep(3000);
		   
		   driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[4]/div/div/div/div/div/div[1]/button")).click();
		   Thread.sleep(3000);
		 
		   WebElement option =driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[4]/div/div/div/div/div/div[1]/ul"));
		   option.findElement(By.linkText("India")).click();
		   Thread.sleep(3000);
		   
		  driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[4]/div/div/div/div/div/div[2]/input")).sendKeys("Gurugram");
		   Thread.sleep(3000);
		   
		  
		   
		   
		   Select oSelect3 =new Select (driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[5]/div/div/div/div/select")));
		   oSelect3.selectByVisibleText("Software Testing");
		   Thread.sleep(3000);
		   
		   driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[6]/div/div/div/div/label[1]/i[1]")).click();
		   Thread.sleep(3000);
		   
		   Select oSelect4 = new Select(driver1.findElement(By.cssSelector("#professional_detail > app-professional-detail > div.professional-details.col-md-12.p-init > div > form > div:nth-child(1) > div > div > div > div:nth-child(7) > div > div > div > div > select")));
		   oSelect4.selectByIndex(4);
		   Thread.sleep(3000);
		   
		   Select oSelect5 = new Select(driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[9]/div/div/div/div/select")));
		   oSelect5.selectByVisibleText("Permanent");
		   Thread.sleep(3000);
		   
		   driver1.findElement(By.xpath("//*[@id=\"professional_detail\"]/app-professional-detail/div[1]/div/form/div[1]/div/div/div/div[10]/div/div/div/div/div/div[2]/input")).sendKeys("Pune");
		   Thread.sleep(3000);
		   
		 
		  
	}
	}


