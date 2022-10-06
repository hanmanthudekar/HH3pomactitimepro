package actitimePOMClassesWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTasks {
   @FindBy(xpath ="(//img[@height='93'])[4]")
	private WebElement tasks;
   
   @FindBy(xpath = "//input[@class='controlBorder']")
   private WebElement filterTasks;
   
   @FindBy(xpath = "//input[@id='tasksFilterSubmitButton']")
   private WebElement applyFilterButton;
	WebDriver driver;
	
	public ActitimeTasks(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void validateTasksBlock() {
		tasks.click();
	}
	public void setFilterName() {
		filterTasks.sendKeys("Hanmant");
	}
	public void verifyFilterButton() {
		applyFilterButton.click();
		System.out.println(" test scenario passed Task block validated succesfully");
	}
}
