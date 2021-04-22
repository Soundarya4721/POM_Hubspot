package com.qa.hubspot.pages;



	 class BasePage { 
		public String pageUrl = "http://BasePage.com"; 
		public String getPageUrl() { 
			return this.pageUrl; 
			} 
		} 
	 class HomeePage extends BasePage { 
		public String getPageUrl() { 
			this.pageUrl = "http://HomePage.com"; 
			return this.pageUrl; 
			}
		} 
	public class test {
	public static void main(String[] args) {
		BasePage basePage = new HomeePage(); 
		String pageurl = basePage.getPageUrl(); 
		System.out.println(pageurl); 
		
	}

}
