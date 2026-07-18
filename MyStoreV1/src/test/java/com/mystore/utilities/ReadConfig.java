package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	String path="C:\\Users\\lenovo\\eclipse-workspace\\MyStoreV1\\Configuration\\config.properties";
	
//Constructor	
	public ReadConfig() {
		try {
		prop = new Properties();
		
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
					e.printStackTrace();
		}
		
	}

//Read Base Url Method	
	public String getBaseUrl() {
		
	String value =	prop.getProperty("baseUrl");
	
	if(value !=null) 
		
		return value;
	else
		 throw new RuntimeException("url not specified in config file");
	}
	
//Read Browser Method	
		public String getBrowser() {
			
		String value =	prop.getProperty("browser");
		
		if(value !=null) 
			
			return value;
		else
			 throw new RuntimeException("browser not specified in config file");
		}	
	
}
