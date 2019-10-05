package com.sec11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/git/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");

		// 1. this find links in entire page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. this is count links only in footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3 count of links in column

		WebElement columndriver = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));

		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// click the all link in column and print window heading

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

			columndriver.findElements(By.tagName("a")).get(i)
					.sendKeys(Keys.chord(Keys.CONTROL, Keys.COMMAND, Keys.ENTER));
			Thread.sleep(2000l);
			

		}
		Thread.sleep(2000l);
		link.Name(driver);

		

	}

}

class link {

	public static void Name(WebDriver driver) throws InterruptedException {
		
		

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> itr = ids.iterator();

		

		while (itr.hasNext()) {

			driver.switchTo().window(itr.next());

			System.out.println(driver.getTitle());
			Thread.sleep(2000l);

		}
		
		
		

	}
}
