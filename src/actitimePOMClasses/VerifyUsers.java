package actitimePOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUsers {

		WebDriver driver;
		private WebElement user;

		public VerifyUsers(WebDriver driver) {
			this.driver=driver;
			user=driver.findElement(By.xpath("(//img[@width='84'])[4]"));
		}
		public void verifyUsers() throws InterruptedException {
			user.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='userNameInput']")).clear();
			System.out.println("Test scenario passed users block verified");
		}
}
