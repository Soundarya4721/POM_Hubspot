package com.qa.hubspot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(12, TimeUnit.MILLISECONDS);
		  driver.get("http://www.softwaretestingmaterial.com");
			//To maximize the browser window
			driver.manage().window().maximize();
	}

}
