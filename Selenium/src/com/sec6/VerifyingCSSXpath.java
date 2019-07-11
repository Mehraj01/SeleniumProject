package com.sec6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingCSSXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://salesforce.com");
		driver.findElement(By.cssSelector("body > header > div:nth-child(2) > div:nth-child(2) > div > div"
				+ " > nav > div.container.globalnavbar-header-container > div > div."
				+ "top-section.col > div.utility-bar > div.global-nav-login-fl"
				+ "ydown.global-login > div > a")).click();;
		driver.findElement(By.id("username")).sendKeys("login");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234");
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
		

	}

}
