package com.s;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleni {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		
		WebDriver dd = new ChromeDriver();
		dd.get("https://google.com");
		
		

	}

}
