package actitimePOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPage {

	//Declaration
	private WebElement username;
	private WebElement password;
	private WebElement loginButton;
	private static WebDriver driver;

	//Initialization
	public ActitimeLoginPage(WebDriver driver) {
		this.driver=driver;
		username=driver.findElement(By.xpath("//input[@id='username']"));
		password=driver.findElement(By.xpath("//input[@name='pwd']"));
		loginButton=driver.findElement(By.xpath("//a[@id='loginButton']"));
	}
	//usage
	public void setUsername() {
		username.sendKeys("admin");
	}
	public void setPassword() {
		password.sendKeys("manager");
	}
	public void verifyLoginButton() {
		loginButton.click();
	}
}
