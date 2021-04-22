package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage {
	/**
	 * Using Encapsulation concept here by declaring the By locators private.
	 * Use only By class to create the object repository
	 * Creating a private driver to test this page.
	 */
	private WebDriver driver;
	
	private By username=By.xpath("//input[@id='username' and @type='email']");
	private By password=By.xpath("//input[@id='password' and @type='password']");
	private By loginButton=By.xpath("//button[@id='loginBtn' and @type='submit']");
	private By SignupLink=By.linkText("Sign up");
	
	/**
	 * 
	 * @param driver returns a driver to access the locators and methods
	 */
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	/**
	 * Page actions : Features of the page in the form of methods
	 */
	
	/**
	 * 
	 * @returns title of the page
	 */

	public String getLoginPageTitle() {
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return driver.getTitle();
	}
	
	/**
	 * 
	 * @return if the link on the page is displayed or not
	 * @throws InterruptedException 
	 */
	public boolean doesSignUpLinkExist(){
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.findElement(SignupLink).isDisplayed();
	}
	
	/**
	 * This is the method to login
	 */
	public HomePage doLogin(String usrname,String pwd) {
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Login with username : " +usrname+ "password : "+pwd);
		driver.findElement(username).sendKeys(usrname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
		return new HomePage(driver);

	}
			
}
