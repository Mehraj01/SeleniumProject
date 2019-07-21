package com.sec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		//Static Dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.cssSelector("[value='Milk']")).click();
		driver.findElement(By.cssSelector("[value='Water']")).click();
		System.out.println(driver.findElements(By.cssSelector("[name='group1']")).size());
		System.out.println(driver.findElements(By.cssSelector("[name='group2']")).size());
	}

}
