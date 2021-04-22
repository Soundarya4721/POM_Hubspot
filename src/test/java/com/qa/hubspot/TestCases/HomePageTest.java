package com.qa.hubspot.TestCases;

import org.junit.BeforeClass;

import com.qa.hubspot.base.BaseTest;
import com.qa.hubspot.pages.HomePage;

public class HomePageTest extends BaseTest {

	@BeforeClass
	public void HomeTest() {
	
		homepage=loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
}
