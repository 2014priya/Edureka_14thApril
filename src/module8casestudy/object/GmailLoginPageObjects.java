package module8casestudy.object;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class GmailLoginPageObjects {

	
	
	public GmailLoginPageObjects (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy (name ="identifier")
	public WebElement logintext;
	
	@FindBy (id="identifierNext")
	public WebElement nextbutton;
	
	@FindBy (name="password")
	public WebElement password;
	
	
	@FindBy (id="passwordNext")
	public WebElement nextbutton1;
	
	
	@FindBy (xpath ="//div[contains(text(),'COMPOSE')]")
	public WebElement compose;
	
	@FindBy (name ="to")
	public WebElement receipt;
	
	@FindBy (name ="subjectbox")
	public WebElement subject;
	
	@FindBy (css ="#\\3a 6k")
	public WebElement body;
	
	@FindBy (id =":7z")
	public WebElement sendbutton;
	
public void GmailLogin(String EmailText) {
		
		logintext.sendKeys(EmailText);
		nextbutton.click();
		
		
	}
	
public void GmailLogin1(String Password) {
	
	password.sendKeys(Password);
	nextbutton1.click();
	
}

public void GmailLogin5(String Compose) {
	
	compose.click();
			}

	
	public void GmailLogin2 (String Receipt) {
		
		receipt.sendKeys(Receipt);
	}
	
	public void GmailLogin3 (String Subject)
	{subject.sendKeys(Subject);
	}
	
	public void GmailLogin4 (String Body) {
		body.sendKeys(Body);
		sendbutton.click();
	}
}
