package com.sec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown42 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		//Static Dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
        s.selectByIndex(2);
		s.selectByVisibleText("AED");
		//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")).getText());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getAttribute("name"));
		System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getCssValue("class"));
		
		
		
		Thread.sleep(2000l);
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000l);
		int i = 0;
		while(i<5) {
			//System.out.println(driver.findElement(By.id("hrefIncAdt")).getTagName());
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		System.out.println(driver.findElement(By.id("divpaxinfo")).getTagName());
		System.out.println(driver.findElement(By.id("divpaxinfo")).getCssValue("id"));
        
	}

}
