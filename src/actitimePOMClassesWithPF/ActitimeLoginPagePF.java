package actitimePOMClassesWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPagePF {
	
    @FindBy(xpath="//input[@id='username']")
	private WebElement username;
    
    @FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
    
    @FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginButton;
    
	public static WebDriver driver;
	//Initialization
	public ActitimeLoginPagePF(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("Entering login details...");
	}
	
	public void setLoginPageName() {
		username.sendKeys("admin");
	}
	public void setLoginPassword() {
		password.sendKeys("manager");
	}
	public void verifyLoginButton() {
		loginButton.click();
	}
}
