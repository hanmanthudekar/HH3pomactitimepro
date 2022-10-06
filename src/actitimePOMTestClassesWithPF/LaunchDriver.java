package actitimePOMTestClassesWithPF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchDriver implements TestBase{
	
	public static WebDriver driver;
	public void launchChromeDriver() {
		System.out.println("launching chrome browser...");
		System.setProperty(key, path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("chromedriver launched succesfully...");
	}
	public void launchEdgeDriver() {
		System.out.println("launching Edge browser...");
		System.setProperty(key1, path1);
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("EdgeDriver launched succesfully...");	
	}

}
