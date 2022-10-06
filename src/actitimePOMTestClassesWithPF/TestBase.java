package actitimePOMTestClassesWithPF;

public interface TestBase {
String key="webdriver.chrome.driver";
String path="C:\\velocityTraining\\setups\\ChromeDriver\\chromedriver_win32\\chromedriver.exe";
String key1="webdriver.edge.driver";
String path1="C:\\velocityTraining\\setups\\Microsoft_Edge\\edgedriver_win64\\msedgedriver.exe";
public void launchChromeDriver();
public void launchEdgeDriver();

}
