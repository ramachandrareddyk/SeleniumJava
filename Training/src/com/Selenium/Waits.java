package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	private static WebDriver driver;
	
	
	public static void implicitWait() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void explicitWait() throws Exception {
		WebElement searchInput = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("search_query_top")));
	}
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		implicitWait();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
		explicitWait();
	}
}
