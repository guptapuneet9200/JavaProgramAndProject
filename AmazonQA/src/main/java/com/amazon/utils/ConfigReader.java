package com.amazon.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	public ConfigReader() {
		
		prop = new Properties();
		
		try { //Here We Load the config.properties file 
			
			FileInputStream fis = new FileInputStream("src/main/resource/configuration/config.properties");
			prop.load(fis);
			
				} catch (IOException io) {
			io.printStackTrace();
											}
							}
	
	public String getUrl() {
		return prop.getProperty("URL");
							}

	public String getBrowser() {
		return prop.getProperty("BROWSER");
	}
	
	public Long getGlobalWaitValue() {   //This method give the string value so we convert into 
		return Long.parseLong(prop.getProperty("GLOBALWAIT"));
	}
							}
