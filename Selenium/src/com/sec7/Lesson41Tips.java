package com.sec7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Lesson41Tips {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/mehrajismayilov/SeleniumDependencies/driver/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/dp/B07FDF1B8S/ref=twister_B07DXFJ28H");
//		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("adidas");
//		driver.findElement(By.cssSelector(".nav-search-submit > input:nth-child(2)")).click();
//		driver.findElement(By.cssSelector("[src='https://m.media-amazon.com/images/I/61Rlwsl1WlL._AC_UL320_.jpg']")).click();
        //driver.findElement(By.cssSelector("#color_name_7")).click();
		Select s =new Select(driver.findElement(By.cssSelector("[id='dropdown_selected_size_name']")));
		s.selectByValue("2");

	}

}
