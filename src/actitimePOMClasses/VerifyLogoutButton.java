package actitimePOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLogoutButton {
static WebDriver driver;
public VerifyLogoutButton(WebDriver driver){
	this.driver=driver;
}
	public void verifyLogoutButton() {
		
		 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();

	}
}
