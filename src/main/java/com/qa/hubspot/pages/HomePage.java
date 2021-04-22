package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class HomePage extends BasePage  {
	/**
	 * Using Encapsulation concept here by declaring the By locators private.
	 * Use only By class to create the object repository
	 * Creating a private driver to test this page.
	 */
	private WebDriver driver;
	
	private By UsrGuide_Head=By.xpath("//h1/i18n-string[text()='User Guide']");
	private By settingIcon=By.xpath("//a[@id='navSetting']");
	private By accountName=By.className("account-name ");

	/**
	 * 
	 * @param driver returns a driver to access the locators and methods
	 */
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	/**
	 * 
	 * @return home page title
	 */
	public String gethomeTitle() {
		return driver.getTitle();
	}
	
	/**
	 * 
	 * @return return the user guide value
	 */
	public String getHeaderValue() {
		if(driver.findElement(UsrGuide_Head).isDisplayed()) {
			return (driver.findElement(UsrGuide_Head)).getText();
		}
		else
			return null;
	}
	
	/**
	 * 
	 * @return returns boolean value if the settings icon count is less than zero
	 */
	public boolean isSettingIconExist() {
		
		//driver.findElement(accountName).isDisplayed();
		if(driver.findElements(settingIcon).size()<0) {
			return true;
		}
		else
			return false;
		}
	
	/**
	 * 
	 * @return return the account value 
	 */
	public String getAccountValue() {
		if(driver.findElement(accountName).isDisplayed()) {
			return driver.findElement(accountName).getText();
		}
		else
			return null;
	}
}
