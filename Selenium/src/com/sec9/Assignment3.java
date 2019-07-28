package com.sec9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait s = new WebDriverWait(driver, 5);
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/a[2]")).click();
		s.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("results"))));
		System.out.println(driver.findElement(By.id("results")).getText());;

	}

}
