package com.qa.hubspot.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggstns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  driver.get("http://www.naukri.com");
		  driver.findElement(By.id("qp")).sendKeys("test");
		  Actions actions=new Actions(driver);
		  WebElement ele=driver.findElement(By.xpath(".//*[@id='autosuggest']/ul/li[2]/a"));
		  actions.moveToElement(ele).build().perform();
		  Thread.sleep(2000);

		// finally click on that element
		actions.click(ele).build().perform();
	}

}
