package com.pages;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TMTEventDetails  {
	 WebDriver driver;
	 public TMTEventDetails(WebDriver driver)
	    {
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    } 
	 
	 
		@FindBy(xpath = "//textarea[contains(@name,'textarea-field')]")
	    public WebElement txtEventName;
		
		@FindBy(xpath = "(//*[contains(@class,'flex flex-col w-full gap-2')]/descendant::div)[2]")
	    public WebElement btnvisibilitypubfic;
		
	
		
		
	
		
	
	
	
	
	
	
	
}
