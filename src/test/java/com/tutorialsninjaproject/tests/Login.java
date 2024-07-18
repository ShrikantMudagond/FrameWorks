package com.tutorialsninjaproject.tests;

import org.testng.annotations.Test;

import com.tutorialsninjaproject.pageobject.LandingPage;
import com.tutorialsninjaproject.pageobject.LoginPage;


public class Login extends BaseClass {


	@Test
	public void verifyLoginWithCredentials() throws InterruptedException
	{
		driver.get(Url);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		LandingPage Landing = new LandingPage(driver);
		Thread.sleep(5000);
		LoginPage Login = new LoginPage(driver);
		Thread.sleep(5000);

		Landing.MyAccount();
		Thread.sleep(5000);
		Landing.Login();
		Thread.sleep(5000);
		Login.enteremail(Email);
		Thread.sleep(5000);
		Login.enterpassword(Password);
		Thread.sleep(5000);
		Login.LoginButton();
		Thread.sleep(5000);
	}
}
