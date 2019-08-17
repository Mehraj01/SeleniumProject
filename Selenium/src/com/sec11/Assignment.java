package com.sec11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		ChromeDriver d = new ChromeDriver();
		d.get("http://qaclickacademy.com/practice.php");
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.getCurrentUrl();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		System.out.println(option);
		
		Select s  = new Select (driver.findElement(By.id("dropdown-class-example")));
		
		s.selectByValue(option);
		
		System.out.println(driver.findElements(By.tagName("fieldset")).size());;
		
		
		driver.findElement(By.name("enter-name")).sendKeys(option);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alert = driver.switchTo().alert().getText();
		
		if(alert.contains(option)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("faild");
		}
	
		
			

	}

}
