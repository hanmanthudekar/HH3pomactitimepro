package flipkartPOMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutFunctionality {

	@FindBy(xpath = "//div[text()='My Account']")//(//div[@class="exehdJ"])[1]
	private WebElement myAcc;
	
	@FindBy(xpath ="//ul[@class='pO9syL undefined']//a")//ul[@class="pO9syL undefined"]//a
	private List<WebElement> opt;
	
	WebDriver driver;
	
	public LogoutFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void myAccount() {
		Actions s = new Actions(driver);
		s.moveToElement(myAcc).perform();
		System.out.println("Moved to My account");
	}
	public void logout() {
		for(WebElement op:opt) {
			String text = op.getText();
			if(text.equals("Logout")) {
				op.click();
				System.out.println("Logged out succesfully");
			}
		}
	}
}
