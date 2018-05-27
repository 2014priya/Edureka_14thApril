package module11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;


public class Sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Installation Stuff\\Exe Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
           driver.get("https://www.edureka.co");
           Thread.sleep(4000);
           
           Screen s = new Screen();
           s.getScreen().click("E:\\Sikuli\\Login_edureka.JPG");
           
           Thread.sleep(4000);
           
           s.getScreen().click("E:\\Sikuli\\ForgotPassword.JPG");
		
	}

}
