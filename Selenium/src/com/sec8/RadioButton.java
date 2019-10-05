package com.sec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
//		//Static Dropdown
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		System.setProperty("webdriver.gecko.driver",
				"/Users/mehrajismayilov/git/geckodriver ");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
//		driver.findElement(By.cssSelector("[value='Milk']")).click();
//		driver.findElement(By.cssSelector("[value='Water']")).click();
//		System.out.println(driver.findElements(By.cssSelector("[name='group1']")).size());
//		System.out.println(driver.findElements(By.cssSelector("[name='group2']")).size());
		
		int count = driver.findElements(By.cssSelector("[name='group1']")).size();
		for (int i = 0; i < count; i++) {
			Thread.sleep(1000l);
			//driver.findElements(By.cssSelector("[name='group1']")).get(i).click();
			String value =driver.findElements(By.cssSelector("[name='group1']")).get(i).getAttribute("value");
			System.out.println(value);
			Thread.sleep(1000l);
			if(value.equals("Milk")) {
			Thread.sleep(1000l);
			driver.findElements(By.cssSelector("[name='group1']")).get(i).click();
		}
		}
		
	}

}
