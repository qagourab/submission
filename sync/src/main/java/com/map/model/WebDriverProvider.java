package com.map.model;

import org.openqa.selenium.WebDriver;

import com.map.helper.FileOperator;


public class WebDriverProvider {

	private FileOperator configFile = new FileOperator("config.properties");
	private static String browser =null;

	private WebDriverProvider() {
		browser = configFile.getPropertyFileValue("browser");

	}
	
	public static WebDriver getDriver() {
		if(null!=browser)
			new WebDriverProvider();
		return WebDriverFactory.getWebDriver(browser);
	}
	
	
}
