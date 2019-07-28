package com.sec10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		WebElement move = driver.findElement(By.cssSelector("[id='nav-link-accountList']"));
		Actions a = new Actions(driver);
		//Press the shift button ant type with upper case
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick()
		.build().perform();
		
		
		//Move to specific element
		
		a.moveToElement(move).contextClick().build().perform();
		
		//a.moveToElement(driver.findElement(By.cssSelector("[id='nav-link-accountList']"))).build().perform();
		
			

	}

}
