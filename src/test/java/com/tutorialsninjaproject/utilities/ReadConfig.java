package com.tutorialsninjaproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties properties;



	//constructor
	public ReadConfig() {


		File src = new File( "./Configuration/config.properties");
		try 	{
			FileInputStream fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getbaseUrl()
	{
		String url = properties.getProperty("baseUrl");
		return url;

	}

	public String getbrowser()
	{
		String browser = properties.getProperty("browser");
		return browser;

	}

	public String chromebrowser ()
	{
		String chrome = properties.getProperty("chrome");
		return chrome;
	}

	public String firefoxbrowser ()
	{
		String firefox = properties.getProperty("firefox");
		return firefox;
	}

	public String getemail ()
	{
		String email = properties.getProperty("email");
		return email;
	}
	public String getpassword ()
	{
		String password = properties.getProperty("password");
		return password;
	}
}

