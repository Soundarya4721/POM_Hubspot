package com.qa.hubspot.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BootStrapDrpdwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		  
		  By tutorialClick=By.xpath("//div/button[@id='menu1']");

		  
		  driver.findElement(tutorialClick).click();
		  Thread.sleep(2000);
		  By tutoriallist=By.xpath("//div/button[@id='menu1']//following-sibling::ul/li/a");
		  List<WebElement> elms=driver.findElements(tutoriallist);
		  
		  for(WebElement ele : elms) {
			  
			  String text=ele.getText();
			  
			  System.out.println(text);
			  
			  if(text.equalsIgnoreCase("HTML")) {
				  ele.click();
				  break;
			  }
		  }
		  
	}

	

}
