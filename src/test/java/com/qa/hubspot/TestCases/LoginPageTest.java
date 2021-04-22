package com.qa.hubspot.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BaseTest;
import com.qa.hubspot.utils.Constants;


public class LoginPageTest extends BaseTest{

	/**
	 * This test method is used to verify the login page.
	 * Inheriting the login page test from the base test where the object is created.
	 */
	@Test
	public void verifyLoginPageTitleTest() {
		String title=loginpage.getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);	
	}
	
	@Test
	public void verifySignupLinkTest() throws InterruptedException {
		Assert.assertTrue(loginpage.doesSignUpLinkExist());
	}
	
	@Test
	public void logintest() {
		loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
}
