package com.qa.hubspot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.get("http://www.naukri.com");
		  driver.quit();
		 System.out.println(driver.getTitle());
	}

}
