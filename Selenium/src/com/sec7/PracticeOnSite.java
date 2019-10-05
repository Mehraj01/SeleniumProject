package com.sec7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOnSite {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"/Users/mehrajismayilov/SeleniumDependencies/driver/chromedriver");
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://qaclickacademy.com/interview.php");
	
	//driver.findElement(By.xpath("//*[@href=\"interview.php\"]")).click();
	
	//driver.findElement(By.xpath("//*[text()=' Soap UI ']")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"tablist1-tab1\"]/following-sibling ::li[3]")).click();
	
	//driver.findElement(By.xpath("//*[text()=' Testing ']")).click();
	
	//driver.findElement(By.xpath("//*[@id='tablist-tab1]")).click();
	
	System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab3']/parent::ul")).getAttribute("role"));
	
	driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

	//System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	
	
	Thread.sleep(6000);
	//driver.close();
	//driver.quit();
	}
}
