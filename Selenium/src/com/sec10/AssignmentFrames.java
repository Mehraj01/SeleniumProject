package com.sec10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AssignmentFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/git/SeleniumProject/Selenium/drivers/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Nested Frames")).click();;
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(0);
		//Actions a = new Actions(driver);
		
		//System.out.println(driver.findElement(By.tagName("div")).getText());
		System.out.println(driver.findElement(By.cssSelector("body")).getText());
		

	}

}
