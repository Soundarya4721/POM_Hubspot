package com.qa.hubspot.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	
	/**
	 * This method initializes the driver based on the given browser name as input...
	 * @param browser
	 * @return This returns web-driver driver
	 */
	public WebDriver init_driver(String browser) {
		
		System.out.println("The browser is : "+browser );
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxProfile profile=new FirefoxProfile();
			profile.setAcceptUntrustedCertificates(true);
			 driver=new FirefoxDriver();
 
		}
		
		else {
			System.out.println("please pass the appropriate browser name"+" "+browser);
		}
		
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	
	/**
	 * This method is used to read the properties from config.properties file and load to prop object.
	 * @return Returns properties from prop reference
	 */
	public Properties init_prop()  {
		 prop=new Properties();
		 try {
			FileInputStream fis=new FileInputStream("./src/main/java/com/qa/hubspot/config/config.properties");
			prop.load(fis);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}catch (IOException e) {
				// TODO Auto-generated catch block
		    e.printStackTrace();
			
		}
	    return prop;
	
	}
	

}
