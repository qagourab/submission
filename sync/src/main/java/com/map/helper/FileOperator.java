package com.map.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileOperator {
	
	private String filePath = null;
	
	public FileOperator() {
		

	}
	public FileOperator(String filePath) {
		this.filePath = filePath;
		
		
	}
	public String getPropertyValue(String key) {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(filePath);

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			return prop.getProperty(key);
			

		} catch (IOException ex) {			
			ex.printStackTrace();
			return null;
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
	}
}
