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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TMTLoginPageSteps {
	
		// TODO Auto-generated constructor stub

	TMTLoginPage loginpage = new TMTLoginPage(DriverFactory.getDriver());
	
	private static String title;
	
	@Given("Login to TMT Portal")
	public void Logintoportal() {
		loginpage.SelectCity();
		loginpage.loginpagestep();
			
	}
	
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	 title = loginpage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	
	@When("Updating My profile page")
	public void Profile_Update() {
	
		loginpage.Profileupdate();
		loginpage.usernameandprofilepicupdate();
			
	}
	

}
