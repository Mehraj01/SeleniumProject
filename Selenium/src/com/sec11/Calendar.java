package com.sec11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/SeleniumDependencies/driver/chromedriver");

		WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.com/Hotels-g155032-Montreal_Quebec-Hotels.html");
		
		//System.out.println(driver.findElement(By.xpath("//div[@class = 'rsdc-month-title yb3 ']")).getText());
		
//		WebElement el = driver.findElement(By.xpath("//span[@class = 'rsdc-month-title yb3 ']"));
//		
//		while(!el.getText().contains("November")) {
//			System.out.println(driver.findElement(By.xpath("//span[@class = 'rsdc-month-title yb3 ']")).getText());
//			driver.findElement(By.xpath("//div[@class='rsdc-next rsdc-nav ui_icon single-chevron-right']")).click();
//			
//		}
		
		
	
		System.out.println(driver);
		
		List<WebElement>list = driver.findElements(By.className("rsdc-yb-label.rsdc-ignore-clicks "));
		
		int count = driver.findElements(By.xpath("//div[@class='rsdc-cell rsdc-day yb3']")).size();
		 //int count1 = driver.findElements(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/span/div[3]/div/div[2]/div[3]/span/span/div[1]")).size();
				 int c = list.size();
		System.out.println(count);
		
		
		
		
		for (int i = 0; i < count; i++) {
			String day = driver.findElements(By.xpath("//div[@class='rsdc-cell rsdc-day yb3']")).get(i).getText();
			System.out.println(day);
			if(day.equalsIgnoreCase("27")) {
				driver.findElements(By.xpath("//div[@class='rsdc-cell rsdc-day yb3']")).get(i).click();
				break;
			}
			
		}
		
		for (int i = 0; i < count; i++) {
			String day = driver.findElements(By.xpath("//div[@class='rsdc-cell rsdc-day yb3']")).get(i).getText();
			System.out.println(day);
			if(day.equalsIgnoreCase("20")) {                //rsdc-cell rsdc-day yb3
				driver.findElements(By.xpath("//div[@class='rsdc-cell rsdc-day yb3']")).get(i).click();
				break;
			}
			
		}
		

	}

}
