package flipkartPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement username;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginButton;

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	 
	}
	public void setUsername() {
		username.sendKeys("8669777008");
	}
	public void setPassword() {
		password.sendKeys("mayur12345");
	}
	public void verifyLoginButton() {
		loginButton.click();
	}

	
}
