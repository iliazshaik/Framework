package com.regence.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	//Custom libraries for - screenshots, alerts, frames, windows, Sync issues, javascript executor
	public static String captureScreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath = System.getProperty("user.dir")+"/Screenshots/Regence_"+getCurrentDateTime() +".png";
		try 
		{
			FileHandler.copy(src, new File(screenshotPath));
		} catch (IOException e) {
			System.out.println("Unable to capture Screenshot "+e.getMessage());
		}
		return screenshotPath;
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customFormat.format(currentdate);
	}
	
	public void handleFrames()
	{
		
	}
	
	public void handleAlerts()
	{
		
	}

}
