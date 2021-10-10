package com.helpReader.com;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstancefr() throws Throwable {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	 
	public ConfigReader getInstancecr() throws Throwable {
		
		ConfigReader cr = new ConfigReader();
		return cr;
		
	}

}
