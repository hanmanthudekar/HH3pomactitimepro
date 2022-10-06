package flipkartTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDrivers  implements TestBase {
	public static  WebDriver driver;
	
	public void LaunchChromeDriver() {
    System.setProperty(key, path);
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.navigate().to("https://www.flipkart.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
