package com.sec11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		Thread.sleep(2000l);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById(\"autocomplete\").value";
		
		String text = (String) js.executeScript(script);
		int i=0;
		while (!text.equalsIgnoreCase("United Sstates Minor Outlying Islands")) {
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			
			System.out.println(text);
			
			if(i>10)
				break;
		}
		if (i>10) {
			System.out.println("fail");
		}

	}

}
