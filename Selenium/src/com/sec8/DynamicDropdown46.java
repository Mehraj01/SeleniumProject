package com.sec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown46 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		//Dynamic Dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		//select from 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000l);
		//select to
		//adding [2] to chose second dropdown section
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/table/tbody/tr[4]/td[4]/a")).click();;
		System.out.println(driver.findElement(By.xpath("//html/body/div[2]/div[1]/table/tbody/tr[4]/td[4]/a")).getLocation());
		Thread.sleep(2000l);
		driver.findElement(By.cssSelector("#Div1 > button:nth-child(4)")).click();
		Thread.sleep(2000l);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		Thread.sleep(2000l);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(2000l);
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		Thread.sleep(2000l);
		//driver.findElement(By.id("hrefIncChd")).click();
		Thread.sleep(2000l);
		driver.findElement(By.cssSelector("[value='Done']")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	
		Thread.sleep(6000l);
	
		driver.quit();
	
	
	
	}
	
	
	

}
