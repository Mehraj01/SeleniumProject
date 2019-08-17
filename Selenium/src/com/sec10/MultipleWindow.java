package com.sec10;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.Select;


public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://accounts.google.com");
		
		//WebElement move = driver.findElement(arg0)
		
		String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		Actions a  = new Actions(driver);             ////*[@id="view_container"]/div/div/div[2]/div/div[1]/span/div/div/a
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/span/div/div/a"))).
		keyDown(Keys.COMMAND).click().build().perform();;
	    
		//driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/span/div/div/a")).sendKeys(clickOnLink);
		
		
		Thread.sleep(2000l);
		
		
		
		System.out.println(driver.getTitle());
		
		Set<String> ids = driver.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		 String parentId = it.next();
		 
		 String childId = it.next();
		 
		 driver.switchTo().window(childId);
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000l);
		 
		 driver.switchTo().window(parentId);
		 System.out.println(driver.getTitle());
		 

	}

}
