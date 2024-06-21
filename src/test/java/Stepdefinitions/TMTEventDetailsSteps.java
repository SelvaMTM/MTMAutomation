package Stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.TMTEventDetails;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TMTEventDetailsSteps {
	
	TMTEventDetails Eventdetail = new TMTEventDetails(DriverFactory.getDriver());

 WebDriver driver =DriverFactory.getDriver();

	
	@SuppressWarnings("deprecation")
	
	@Given("Updating details on Whats your event about page")
	public void users_gets_the_title_of_the_page() {
	
			
		Eventdetail.txtEventName.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Eventdetail.txtEventName.sendKeys("HaveFun");
		Eventdetail.btnvisibilitypubfic.click();
		
	}
	
	
	

}
