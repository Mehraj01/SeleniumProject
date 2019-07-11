package com.s;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/geckodriver");
		
		WebDriver dd = new FirefoxDriver();
		dd.get("https://facebook.com");
		
		

	}

}
