package actitimePOMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyTimeTrack {

	private WebElement tasks;
	private WebDriver driver;

	public VerifyTimeTrack(WebDriver driver) {
		this.driver=driver;
		WebElement timeTrack = driver.findElement(By.xpath("(//img[@width='84'])[2]"));
	}
}
