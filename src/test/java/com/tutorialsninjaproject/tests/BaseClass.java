package com.tutorialsninjaproject.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.tutorialsninjaproject.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	ReadConfig RC = new ReadConfig();

	String Url = RC.getbaseUrl();
	String Browser = RC.getbrowser();
	String Email = RC.getemail();
	String Password = RC.getpassword();

	public static WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setUp(String br)
	{

		if (br.equals("chrome"))
			driver=new ChromeDriver();
		else if (br.equals("firefox"))
			driver =new FirefoxDriver();


		
	}
	

	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}



