package flipkartPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilpkartHomepage {

	@FindBy(xpath ="//input[@name='q']")
	private WebElement searchBar;

	@FindBy(xpath ="\"html/body/div/div/div/div/div/div[2]/form/div/button")
	private WebElement searchButton;

	@FindBy(xpath ="//img[@alt='Top Offers']")
	private WebElement TopOffers;


	WebDriver driver;
	public FilpkartHomepage(WebDriver driver) {
		PageFactory.initElements( driver , this );
	}
	public void setSearchText() {
		searchBar.sendKeys("Samsung phones");
		System.out.println("Test scenario passed search bar verified");
	}
	public void verifySearchButton() throws InterruptedException {
		searchButton.click();
		System.out.println("Test scenario passed search button verified");
	}
	public void verifyTopOffers() {
		TopOffers.click();
	}
}
