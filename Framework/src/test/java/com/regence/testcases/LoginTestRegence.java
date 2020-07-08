package com.regence.testcases;


import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.annotations.Test;
import com.regence.pages.BaseClass;
import com.regence.pages.HomePage;

public class LoginTestRegence extends BaseClass{
	
	
	@Test(priority=1)
	public void loginapp()
	{
		logger = report.createTest("Login to Regence");
		HomePage HomePage = PageFactory.initElements(driver, HomePage.class);
		logger.info("Starting Application");
		HomePage.loginToRegence(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		logger.pass("Login was successfull");
		//Assert.assertTrue(driver.getTitle().contains("Regence Home"),"User is not able to login - Invalid Credentials");
	}
	
	@Test(priority=2)
	public void loginapp1()
	{
		logger = report.createTest("Login to Regence");
		HomePage HomePage = PageFactory.initElements(driver, HomePage.class);
		logger.info("Starting Application");
		HomePage.loginToRegence(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 1));
		logger.fail("Login was not successfull");
	}
	
}
