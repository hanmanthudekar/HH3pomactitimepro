package actitimePOMClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyLogo {
	//declaration
	private WebElement logo;
	private WebElement timeTrack;
	private WebElement user;
	private WebElement logoutButton;
	WebDriver driver;

	//Initialization
	public VerifyLogo(WebDriver driver) throws InterruptedException {

		this.driver=driver;
		logo = driver.findElement(By.xpath("//img[@height='61']"));
		timeTrack = driver.findElement(By.xpath("(//img)[5]"));
	//	reports = driver.findElement(By.xpath("(//img[@width='84'])[4]"));
	}
	public void verifyLogo() {
		
		boolean result=logo.isDisplayed();
		if(result==true) {
			System.out.println("Test scenario passed and logo is verified");
		}
		else {
			System.out.println("Test scenario failed");
		}

	}
	public void verifytimeTrack() throws InterruptedException {
		timeTrack.click();
		System.out.println("Clicked on Timetrack...");
		WebElement addTask = driver.findElement(By.xpath("//input[@id='taskSearchControl_field']"));
		addTask.sendKeys("Study");
		//driver.navigate().back();
		Thread.sleep(2000);
	}
}


