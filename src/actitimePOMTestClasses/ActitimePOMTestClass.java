package actitimePOMTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimePOMClasses.VerifyLogo;
import actitimePOMClasses.ActitimeLoginPage;
import actitimePOMClasses.VerifyLogoutButton;
import actitimePOMClasses.VerifyReports;
import actitimePOMClasses.VerifyTasks;
import actitimePOMClasses.VerifyUsers;
import actitimePOMClasses.VerifyWorkSchedule;

public class ActitimePOMTestClass extends LaunchDrivers{
	static WebDriver driver;
 public ActitimePOMTestClass(WebDriver driver) {
	 super.driver=driver;
 }
	public static void main(String [] args) throws InterruptedException {
		LaunchDrivers launch= new LaunchDrivers();
		launch.LaunchChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Launching ChromeDriver...");
		//Login page scenarios
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		System.out.println("Filling Login Details");
		login.setUsername();
		login.setPassword();
		login.verifyLoginButton();
		System.out.println("Test scenario passed Logged in Succesfully...");
		//Homepage scenarios
		Thread.sleep(2000);
		VerifyLogo homepage = new VerifyLogo(driver);
		homepage.verifyLogo();
		Thread.sleep(2000);
		VerifyTasks task = new VerifyTasks(driver);
		task.verifyTasks();
		//Reports
		VerifyReports report = new VerifyReports(driver);
		report.verifyReports();
		VerifyLogoutButton logout = new VerifyLogoutButton(driver);
		VerifyUsers users = new VerifyUsers(driver);
		users.verifyUsers();
		//Verify Work Schedule
		VerifyWorkSchedule work = new VerifyWorkSchedule(driver);
		work.verifyWorkSchedule();
		logout.verifyLogoutButton();
		driver.quit();
	}
}
