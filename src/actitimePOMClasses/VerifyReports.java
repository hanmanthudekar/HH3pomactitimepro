package actitimePOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyReports {
	WebDriver driver;
	private WebElement reports;

	public VerifyReports(WebDriver driver) {
		this.driver=driver;
		reports=driver.findElement(By.xpath("(//img[@width='84'])[3]"));
	}
	public void verifyReports() throws InterruptedException {
		reports.click();
		System.out.println("Clicked on reports");
		driver.findElement(By.xpath("//span[@unselectable='on']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@id='closeLightbox']")).click();
		System.out.println("Test scenario passed Reports block verified");
	}

}
