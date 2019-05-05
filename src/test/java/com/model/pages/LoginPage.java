package com.model.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mt.model.config.Config;

public class LoginPage 
{
	@FindBy (how=How.XPATH,using="//input[@name='userName']")
	WebElement objUsername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objPassword;
	
	@FindBy (how=How.XPATH,using="//input[@name='login']")
	WebElement objLogin;
	
	
   public void LoadloginPage()
   {
	   PageFactory.initElements(Config.driver,this);
   }
   public void enterUsername(String username)
   {
	   System.out.println("In enterUsername method");
	   objUsername.sendKeys(username);
	   System.out.println("username entered successfully");
   }
   public void enterPassword(String passwd)
   {
	   System.out.println("In enterPassword method");
	   objPassword.sendKeys(passwd);
   }
   public void login()
   {
	   System.out.println("In login method");
	   objLogin.click();
   }
}
