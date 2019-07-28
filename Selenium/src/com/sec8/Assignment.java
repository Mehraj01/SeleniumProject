package com.sec8;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.id("RoundTrip")).click();
		
          //driver.findElement(By.cssSelector(".listMenu.listMenuPicker.currencyMenu/ul[2]/li[5]")).click();
		driver.findElement(By.cssSelector(".listMenuLink.currencyLink")).click();
		driver.findElement(By.xpath("//*[@id=\"userAccountNav\"]/nav/ul/li[1]/ul/ul[2]/li[12]/a")).click();
		//chose  from 
		WebElement from = driver.findElement(By.cssSelector("[name='origin']"));
		from.sendKeys("JFK");
		Thread.sleep(2000l);
		WebElement to = driver.findElement(By.cssSelector("[name='destination']"));
		Thread.sleep(2000l);
		to.sendKeys("GYD");
		Thread.sleep(4000l);
		to.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000l);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000l);
		
		//Calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[3]/a")).click();

		// driver.findElement(By.id("#PaxBlock")).getAttribute("id");

		//System.out.println(driver.findElement(By.id("PaxBlock")).getText());

		WebElement count = driver.findElement(By.id("Adults"));
		count.click();
		Thread.sleep(2000l);
		
			driver.findElement(By.xpath("//*[@id='Adults']/option[1]")).click();;
			Thread.sleep(2000l);
			driver.findElement(By.xpath("//*[@id='Childrens']/option[1]")).click();
			Thread.sleep(2000l);
			driver.findElement(By.xpath("//*[@id='Infants']/option[1]")).click();
			Thread.sleep(2000l);
			driver.findElement(By.id("SearchBtn")).click();
			
		

		

	}

}
