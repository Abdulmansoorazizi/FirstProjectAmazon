package com.amazon.testscript;

import org.testng.annotations.Test;
import com.amazojn.pages.BaseStartApp;
import com.amazojn.pages.SignIn;


public class AmazoneScript extends BaseStartApp
{

@Test
public void MouseHoveringOnSignInPage()
{
	
	LandingPage land = new LandingPage(driver);
	
	land.MethodOfHovering();
	
	land.ClickOnSignIn();
	
	
	SignIn sign = new SignIn(driver);
	
	sign.fillingIntoBox("jsfilij90jnsfkdh---=-@gmail.com");
	
	sign.ClickingOnBtn();
	
}
}


