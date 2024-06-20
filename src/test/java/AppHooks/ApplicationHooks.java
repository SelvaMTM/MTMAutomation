package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		
	}
	
	@Before(order = 2)
	public void launchURL() {
		String URLName = prop.getProperty("URL");			
		driver.get(URLName);
		
//	driver.get("https://takemytickets.co.in/");
//	ChromeOptions option=new ChromeOptions();
//	option.setPageLoadStrategy(PageLoadStrategy.NONE);
//	driver = new ChromeDriver(option);
	

		
	}
	

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

//	@After(order = 1)
//	public void tearDown(Scenario scenario) {
//		if (scenario.isFailed()) {
//			// take screenshot:
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//			scenario.attach(sourcePath, "image/png", screenshotName);
//
//		}
	//}

}
