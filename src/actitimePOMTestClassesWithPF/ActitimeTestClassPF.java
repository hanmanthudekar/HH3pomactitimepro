package actitimePOMTestClassesWithPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimePOMClassesWithPF.ActitimeLoginPagePF;
import actitimePOMClassesWithPF.ActitimeLogo;
import actitimePOMClassesWithPF.ActitimeReportBlock;
import actitimePOMClassesWithPF.ActitimeTasks;
import actitimePOMClassesWithPF.ActitimeUsersBlock;

public class ActitimeTestClassPF extends LaunchDriver {
	//static WebDriver driver;
	public ActitimeTestClassPF(WebDriver driver) {
		driver = super.driver;
	}

	public static void main(String [] args) {

		LaunchDriver d = new LaunchDriver();
		d.launchChromeDriver();
		//d.launchEdgeDriver();
		ActitimeLoginPagePF login = new ActitimeLoginPagePF(driver);
		login.setLoginPageName();
		login.setLoginPassword();
		login.verifyLoginButton();
		//Logo
		ActitimeLogo logo = new ActitimeLogo(driver);
		logo.verifyLogo();
		//Tasks
		ActitimeTasks tasks = new ActitimeTasks(driver);
		tasks.validateTasksBlock();
		tasks.setFilterName();
		tasks.verifyFilterButton();
		//Reports
		ActitimeReportBlock report = new ActitimeReportBlock(driver);
		report.validateReport();
		report.verifyCreateProject();
		report.verifyCloseSymbol();
		//users
		ActitimeUsersBlock users = new ActitimeUsersBlock(driver);
		users.verifyUserBlock();
		users.verifyCreateUserBlock();
		//users.setFirstName();
		users.verifyCloseButton();
	//	driver.quit();
		System.out.println("Browsesr closeed Succesfully...");
	}
}
