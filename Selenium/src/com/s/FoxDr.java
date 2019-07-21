package com.s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxDr {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/mehrajismayilov/SeleniumDependencies/driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		

	}

}
