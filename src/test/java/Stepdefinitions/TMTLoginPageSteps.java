package Stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pages.TMTLoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class TMTLoginPageSteps {
	
	TMTLoginPage loginpage = new TMTLoginPage(DriverFactory.getDriver());
	
	WebDriver driver;
	
	@Given("Select City")
	public void user_Select_the_City() {
		loginpage.SelectCity();
		
		
	}
	

}
