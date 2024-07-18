package com.tutorialsninjaproject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id="input-email") WebElement EnterEmailID;
	@FindBy(id="input-password") WebElement EnterPassword;
	@FindBy(xpath="//input[@value='Login']") WebElement LoginButton;


	public void enteremail  (String email)
	{
		EnterEmailID.sendKeys(email);


	}
	public void enterpassword(String password)
	{
		EnterPassword.sendKeys(password);

	}
	public void LoginButton  ()
	{
		LoginButton.click();

	}
}

