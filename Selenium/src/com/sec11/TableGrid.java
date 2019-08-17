package com.sec11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/mehrajismayilov/Documents/Workplace/SeleniumAutomationFramework/SeleniumDependencies/driver/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.uefa.com/uefachampionsleague/season=2020/matches/round=2001138/match=2027003/lineups/index.html?iv=true");

		int count = driver.findElements(By.cssSelector("div[class='col-xs-12']")).size();

		WebElement homeAway = driver
				.findElement(By.cssSelector("div[class='row squadlist--wrap d3-plugin squad--team-wrap no-matchbox']"));

		int column = driver
				.findElements(By.cssSelector("div[class='row squadlist--wrap d3-plugin squad--team-wrap no-matchbox']"))
				.size();

		// System.out.println(column);

		// WebElement target = driver.findElement(By.cssSelector("div[class =' col-xs-6
		// col-md-6 squad--team-wrap squad--team-home']"));

		
		
		int c = driver.findElements(By.cssSelector("div[class ='col-xs-6 col-md-6 squad--team-wrap squad--team-home'] ul:nth-child(2)"))
				.size();
		 System.out.println("count is " + c);

		String name = driver
				.findElement(By.cssSelector("div[class ='col-xs-6 col-md-6 squad--team-wrap squad--team-home'] ul:nth-child(2)"))
				.getText();

		// System.out.println(name);

		for (int i = 0; i < c; i++) {
			String playerName = driver.findElements(By.cssSelector(
					"div[class ='col-xs-6 col-md-6 squad--team-wrap squad--team-home'] ul:nth-child(2)"))
					.get(i).getText();
			if (playerName.contains("Emreli")) {
			System.out.println(playerName);

				
			}
		}

		for (int i = 0; i < count; i++) {

			String position = driver.findElements(By.cssSelector("div[class='col-xs-12']")).get(i).getText();

			if (position.equalsIgnoreCase("MIDFIELDER")) {

				System.out.println(position);

			}

		}

	}

}
