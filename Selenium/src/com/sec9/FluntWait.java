package com.sec9;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.FluentWait;
public class FluntWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		//Static Dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.cssSelector("[href=\"javascript: void(0);loadAjax();\"]")).click();
		
		Wait<WebDriver> wait = new  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement el = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				
				if(driver.findElement(By.id("results")).isDisplayed()) {
					Assert.assertTrue(true);
				return driver.findElement(By.id("results"));
				}else {
					
					return null;
				}
			}
		});
		
		System.out.println(driver.findElement(By.id("results")).isDisplayed());
		
	}

}
