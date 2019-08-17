package com.sec11; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTableGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement target = driver.findElement(By.id("product"));
		
		
		//Number of raws
		int count = target.findElements(By.cssSelector("#product > tbody > tr")).size();
		System.out.println(count);
		
		//Number of columns                           //#product > tbody > tr:nth-child(3) > td:nth-child(1)
		int  column = target.findElements(By.cssSelector("#product > tbody > tr:nth-child(3) > td")).size();
		System.out.println(column);
		// text of second raw 
		String text = target.findElement(By.cssSelector("#product > tbody > tr:nth-child(3) ")).getText();
		System.out.println(text);
		

	}

}
