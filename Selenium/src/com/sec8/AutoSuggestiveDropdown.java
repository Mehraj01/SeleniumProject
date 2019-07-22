package com.sec8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
//		
//		driver.findElement(By.id("fromCity")).click();
//		//driver.findElement(By.id("fromCity")).clear();
//		driver.findElement(By.xpath("//*[@placeholder=\"From\"]")).sendKeys("ABU");
//		Thread.sleep(2000l);
//		for (int i = 0; i < 4; i++) {
//			driver.findElement(By.xpath("//*[@placeholder=\"From\"]")).sendKeys(Keys.ARROW_DOWN);
//	}
//		Thread.sleep(2000l);
	//driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		
//		Thread.sleep(2000l);
	//WebElement source=driver.findElement(By.id("fromCity"));
		//source.clear();
//		Thread.sleep(2000l);
		//source.sendKeys("ABU");
//		for (int i = 0; i < 4; i++) {
//			source.sendKeys(Keys.ARROW_DOWN);
//		}
//		source.sendKeys(Keys.ENTER);
		//*[@id="fromCity"]
		//#fromCity
		
		WebElement source = driver.findElement(By.cssSelector("#fromCity"));
		
		source.click();
		
		WebElement from = driver.findElement(By.xpath("//*[@placeholder=\"From\"]"));
		from.clear();
		from.sendKeys("MUM");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000l);
		WebElement to = driver.findElement(By.xpath("//*[@placeholder='To']"));
		Thread.sleep(2000l);
		to.sendKeys("Abu");
		Thread.sleep(2000l);
		for (int i = 0; i < 4; i++) {
			to.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000l);
		}
		to.sendKeys(Keys.ENTER);
		
		
	}

}
