package com.sec6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Facebook example
 */
public class GenerateXpathCSS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		//Xpath==========
		
		//Syntax of Xpath:       //tagName[@atribute='value']
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("asdf");;
//		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1234");;
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();;
		
		//Regular Expression
		//Syntax for "contains" keyword "//tagName[contains(@attribute,'value')]"
		driver.findElement(By.xpath("//input[contains(@id,'emai')]")).sendKeys("asdf");;
		driver.findElement(By.xpath("//input[contains(@id,'pas')]")).sendKeys("1234");;
		driver.findElement(By.xpath("//input[contains(@value,'Log ')]")).click();
		
		
		
		//CSS==========
		
		//Syntax for CSS:     tagname[attribute = 'value']
//		driver.findElement(By.cssSelector("input[class=\"inputtext\"]")).sendKeys("abcerwsvsd");;
//	    driver.findElement(By.cssSelector("[id=pass]")).sendKeys("1234sdvsv56");;
//	    driver.findElement(By.cssSelector("input[value='Log In']")).click();;
		
		//Regular Expression CSS 
		//syntax: tagName[attribute*='value']
//		driver.findElement(By.cssSelector("input[class*='inputtext']")).sendKeys("abcerwsvsd");;
//		driver.findElement(By.cssSelector("input[id*='pass']")).sendKeys("1234sdvsv56");;
//		driver.findElement(By.cssSelector("input[value*='Log In']")).click();
		
		driver.close();

	}

}
