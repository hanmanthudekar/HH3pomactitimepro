package actitimePOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyTasks {
	private WebElement tasks;
	private WebDriver driver;

	public VerifyTasks(WebDriver driver) {
		this.driver=driver;
		tasks = driver.findElement(By.xpath("(//img[@width='84'])[2]"));

	}
	public void verifyTasks() throws InterruptedException {
		tasks.click();
		WebElement filter = driver.findElement(By.xpath("//input[@name='visiableFilterString']"));
		boolean condition = filter.isEnabled();
		if(condition==true) {
			filter.sendKeys("Hanmant");
			Thread.sleep(2000);
			System.out.println("Test scenario passed Tasks block verified");
		}
	}

}
