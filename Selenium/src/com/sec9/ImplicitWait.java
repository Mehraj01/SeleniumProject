package com.sec9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.com/?fid=4abef031-0654-40f7-9471-ff6a2c00ce91");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		WebDriverWait d = new WebDriverWait(driver, 5);
		
		driver.findElement(By.xpath("//a[@href='/Hotels']")).click();
		//Thread.sleep(5000l);
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("BAKU");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys(Keys.ENTER);
		
		//d.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='HEADING']"))));
		
		driver.findElement(By.id("HEADING")).click();
		
		
		//Explicit Wait
		
		
		 d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"property_2354322\"]")));
		 
		driver.findElement(By.xpath("//*[@id=\"property_2354322\"]")).click();;
		
//	     
//	     d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Wed Aug 07 2019']")));
//	     driver.findElement(By.xpath("//div[@aria-label='Wed Aug 07 2019']")).click();
		
		
		
		
		
		
	
	}

}
