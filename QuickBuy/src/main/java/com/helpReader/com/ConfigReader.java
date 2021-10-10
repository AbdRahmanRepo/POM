package com.helpReader.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties p;

	public ConfigReader() throws Throwable {
		File f = new File(
				"C:\\Users\\ELCOT\\eclipse-workspace\\QuickBuy\\src\\main\\java\\com\\Helper\\com\\help.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getUserName() {
		String UserName = p.getProperty("username");
		return UserName;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}


}
