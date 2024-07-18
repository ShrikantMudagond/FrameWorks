package com.tutorialsninjaproject.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver ldriver;

	public LandingPage(WebDriver rdriver)
	{
		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//*[@title=\"My Account\"]") WebElement MyAccount;
	@FindBy(xpath="(//a[text()=\"Login\"])[1]") WebElement Login;


	public void MyAccount()
	{
		MyAccount.click();
	}
	public void Login()
	{
		Login.click();
	}
}
