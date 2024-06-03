package com.pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TMTLoginPage  {

	// 1. By Locators:
	public WebDriver driver;
	
	private By btnSelectcity = By.xpath("//button[contains(@type,'button') and contains(@id,'menu-button-:r5:')]");
	
	private By Selectcity = By.xpath("//*[contains(@class,'chakra-menu__menu-list css-10ptq7q')]/descendant::*[normalize-space(text())='Chennai']");
	
	// 2. Constructor of the page class:
	public TMTLoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	// 3. page actions: features(behavior) of the page the form of methods:
	
	public void SelectCity() {
		driver.findElement(btnSelectcity).click();
		driver.findElement(Selectcity).click();
		System.out.println("Do");
	}
	
	
}
