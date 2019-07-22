package com.sec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/Users/mehrajismayilov/SeleniumDependencies/driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Thread.sleep(2000l);
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		Thread.sleep(2000l);
		//driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		
		
		
		
	}

}
