package com.qa.hubspot.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class BaseTest {
	
	public BasePage basepage;
	public WebDriver driver;
	public Properties prop;
	public LoginPage loginpage;
	public HomePage homepage;
	
	
	/**
	 * This method will invoke the driver from basepage and take the params from the properties file
	 */
	@BeforeTest
	public void setUp() {
		basepage=new BasePage();  //create a object for the base page to utilize the methods written there
		prop=basepage.init_prop();
		String browser = prop.getProperty("browser");
		driver=basepage.init_driver(browser); //storing in a web-driver reference
		String url=prop.getProperty("url");
		loginpage=new LoginPage(driver);//passing driver object to the loginpage
		driver.get(url);
	}
	
	/**
	 * This method is used to quit the browser after each test
	 */
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
