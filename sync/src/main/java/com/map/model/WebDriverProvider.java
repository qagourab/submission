package com.map.model;

import org.openqa.selenium.WebDriver;

import com.map.helper.FileOperator;


public class WebDriverProvider {

	private FileOperator configFile = new FileOperator("E:\\submission\\submission\\sync\\src\\main\\resources\\config.properties");
	private static String browser =null;
	private static String url =null;
	private WebDriverProvider() {
		browser = configFile.getPropertyValue("browser");
		url = configFile.getPropertyValue("url");
	}
	
	public static WebDriver getDriver() {
		if(null==browser)
			new WebDriverProvider();
		return WebDriverFactory.getWebDriver(browser);
	}
	public static String getURL() {
		return url;
		
	}
	
}
