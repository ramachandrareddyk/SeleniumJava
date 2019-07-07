package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		driver.findElement(By.id("search_query_top")).sendKeys("Casual Dresses");
		WebElement searchBtn = driver.findElement(By.name("submit_search"));
		searchBtn.click();
		Thread.sleep(4000);
		List<WebElement> actualoptions = driver.findElements(By.xpath(".//*[@id='selectProductSort']/OPTION"));
		for(int i = 0; i < actualoptions.size(); i++) {
			System.out.println(actualoptions.get(i).getText());
		}
		
		for(WebElement x : actualoptions) {
			System.out.println(x.getText());
		}
		Select I = new Select(driver.findElement(By.id("selectProductSort")));
		I.selectByIndex(0);
		Thread.sleep(2000);
		I.selectByValue("price:asc");
		Thread.sleep(2000);
		I.selectByVisibleText("Price: Lowest first");
		Thread.sleep(2000);
		driver.quit();
	}
}
