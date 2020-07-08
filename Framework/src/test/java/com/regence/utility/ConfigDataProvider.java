package com.regence.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro; //using properties class
	//Creating a constructor - It will help us to initialize the variables and objects
	public ConfigDataProvider()
	{
		File src = new File("./Config/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load config file "+e.getMessage());
		} 	
	}
	
	public String gerDataFromConfig(String KeyToSearch)
	{
		return pro.getProperty(KeyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getQA1URL()
	{
		return pro.getProperty("qa1URL");
	}

}
