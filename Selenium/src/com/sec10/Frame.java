package com.sec10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target =  driver.findElement(By.id("droppable"));
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		//a.dragAndDrop(source, target).build().perform();
		
	}

}
