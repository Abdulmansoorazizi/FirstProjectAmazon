package com.amazojn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	@FindBy (id= "ap_email")
     private WebElement singin;
	
	public SignIn (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void fillingIntoBox(String Email)
	{
		singin.sendKeys(Email);
	}
	public void ClickingOnBtn()
	{
		
	}
	
}

