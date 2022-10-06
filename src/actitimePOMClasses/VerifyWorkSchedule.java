package actitimePOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyWorkSchedule {

	WebDriver driver;
	private WebElement schedule;

	public VerifyWorkSchedule(WebDriver driver) {
		this.driver=driver;
		schedule=driver.findElement(By.xpath("(//img[@width='84'])[5]"));
	}
	public void verifyWorkSchedule() throws InterruptedException {
		schedule.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='label']")).click();
		System.out.println("Test scenario passed Work Schedule block verified");
		Thread.sleep(2000);

	}
}
