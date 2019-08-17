package com.sec11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		///Enter the Beng.
		// Verify that if airport options are displayed
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://ksrtc.in");
		
		driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys("Beng");
		Thread.sleep(2000l);
//		driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys(Keys.DOWN);
		//get a tex t
		System.out.println(driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).getText());
		
		//JAVAScript DOM can extract hidden elements
		//because Selenium can not identify hidden elements
		// investigate the properties of object if it has any hidden text
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById('fromPlaceName').value;";
		String text = (String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("BENGALURU")) {
			driver.findElement(By.xpath("//input[@id = 'fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			
		}
		
		
		

	}

}
