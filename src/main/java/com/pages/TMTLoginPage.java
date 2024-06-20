package com.pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TMTLoginPage  {

	// 1. By Locators:
	public static WebDriver driver;
	
	private By btnSelectcity = By.xpath("//button[contains(@type,'button') and contains(@id,'menu-button-:r5:')]");
	
	private By Selectcity = By.xpath("//*[contains(@class,'chakra-menu__menu-list css-10ptq7q')]/descendant::*[normalize-space(text())='Chennai']");
	
	private By Userprofileupdatebtn = By.xpath("//*[contains(@type,'button') and (contains(@id,'menu-button-:re:'))]");
	
	
	// 2. Constructor of the page class:
	public TMTLoginPage(WebDriver driver)
	{
		TMTLoginPage.driver = driver;
		
	}
	
	// 3. page actions: features(behavior) of the page the form of methods:
	
	public void SelectCity() {
	
		driver.findElement(btnSelectcity).click();
		driver.findElement(Selectcity).click();
		
	}
	
	public  void loginpagestep()
	{
		
	driver.get("https://takemytickets.co.in/?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6InNlbHZhbWFuaWF0aGl5YXBwYW5AZ21haWwuY29tIiwiaWF0IjoxNzE4ODU3NjYyLCJleHAiOjE3MTg4NjEyNjJ9.PBE4Y0qdiLrRlibuAQSuRkMyVOoaybCEbOrcGe2BXcY");
	System.out.println("loginpage:ValidatedSuccessfully");
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	
	public  void Profileupdate() {
		WebElement Userprofileupdate = driver.findElement(Userprofileupdatebtn);
		Userprofileupdate.click();
		WebElement profilebutton = driver.findElement(By.xpath("//*[contains(@id,'menu-list-:re:-menuitem-:rg:')]"));
		profilebutton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Editbutton = driver.findElement(By.xpath("//button[contains(text(),'Edit')]"));
		Editbutton.click();
		System.out.println("Profileupdate:ValidatedSuccessfully");
		
	}
	
	public  void usernameandprofilepicupdate()
	{
		
		WebElement Photoupdate = driver.findElement(By.xpath("//input[contains(@id,'files')]"));
		Photoupdate.sendKeys("C:\\Users\\Selva\\Downloads\\images.jpg");
		WebElement Usrnameupdate = driver.findElement(By.xpath("//input[contains(@name,'fullName')]"));
		Usrnameupdate.clear();
		Usrnameupdate.sendKeys("Selva");
		WebElement Usrnameupdatesave = driver.findElement(By.xpath("//*[contains(@class,'profile_submitBtn__hJ13F')]"));
		Usrnameupdatesave.click();
		//*[contains(@class,'profile_submitBtn__hJ13F')]
		System.out.println("usernameandprofilepicupdate:ValidatedSuccessfully");
	
		
	}
	
	
	
	
	
}
