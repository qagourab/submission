package com.map.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {
	
	private static WebDriver driver = null;
		private  WebDriverFactory(String browser) {
			switch(browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "E:\\software\\jars\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "ie":
				System.setProperty("webdriver.ie.driver", "E:\\software\\jars\\MicrosoftWebDriver.exe");
				driver = new InternetExplorerDriver();
				break;
			case "opera":
				System.setProperty("webdriver.opera.driver", "E:\\software\\jars\\operadriver.exe");
				driver = new OperaDriver();
				break;
				
			case "":
				break;
		}
	}
		
		public static WebDriver getWebDriver(String browser) {
			if(null == driver) {
				 new WebDriverFactory(browser);
				 return driver;
			}else 
				return driver;
		}
}
