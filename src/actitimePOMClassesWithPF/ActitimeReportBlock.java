package actitimePOMClassesWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeReportBlock {

	@FindBy(xpath ="(//img[@width='84'])[3]")
	private WebElement report;

	@FindBy(xpath="//span[@unselectable='on']")
	private WebElement createProject;
	
	@FindBy(xpath="//img[@id='closeLightbox']")
	private WebElement close;
	WebDriver driver;
	public	ActitimeReportBlock(WebDriver driver) { 
		PageFactory.initElements(driver, this);
	}
	public void validateReport() {
		report.click();
	}
	public void verifyCreateProject() {
		createProject.click();
	}
	public void verifyCloseSymbol() {
		close.click();
		System.out.println("Test scenario passed Report block validated succesfully");
	}
}
