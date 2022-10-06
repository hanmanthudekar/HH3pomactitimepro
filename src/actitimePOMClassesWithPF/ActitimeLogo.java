package actitimePOMClassesWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogo {
	
	@FindBy(xpath = "//img[@height='61']")
	private WebElement logo;
	WebDriver driver;
	
	public ActitimeLogo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyLogo() {
		boolean condition = logo.isDisplayed();
		if(condition == true) {
			System.out.print("Test scenario passed logo is verified");
		}
	}
}
