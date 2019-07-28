package com.sec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		//Static Dropdown
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//select Trip type
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		//driver.switchTo().alert().dismiss();
		//prints style 
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		driver.findElement(By.id("MultiCityModelAlert")).click();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		Assert.assertFalse(driver.findElement(By.id("ctl00$mainContent$view_date2")).isEnabled());
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000l);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		
		
		
		
		//Calendar  in calendar section only current date hase unique class name  ".ui-state-default.ui-state-highlight.ui-state-active
		driver.findElement(By.xpath("//html/body/div[2]/div[1]/table/tbody/tr[4]/td[4]/a")).click();;
//		System.out.println(driver.findElement(By.xpath("//html/body/div[2]/div[1]/table/tbody/tr[4]/td[4]/a")).getLocation());
		Thread.sleep(1000l);
		driver.findElement(By.cssSelector("#Div1 > button:nth-child(4)")).click();
		Thread.sleep(1000l);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		
		//Select checkbox
		System.out.println("SeniorCitizenDiscount.isSelected"+driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//click friendsFamily checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//print status of friendsFamily checkbox(select or not)
		System.out.println("friendsandfamily.isSelected()"+driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		//Using TestNg
		
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		
		
		
		//Using Select to select static dropdown 
		Select s = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
        //s.selectByIndex(2);
		//s.selectByVisibleText("AED");
		//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")).getText());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getAttribute("name"));
		
		
		
		
		Thread.sleep(1000l);
		//Increasing Pax count
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(1000l);
		int i = 0;
		while(i<5) {
			//System.out.println(driver.findElement(By.id("hrefIncAdt")).getTagName());
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getTagName());
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getCssValue("id"));
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"6 Adult");
		
		//Search Button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//Thread.sleep(5000l);
		
		//driver.quit();

	}

}
