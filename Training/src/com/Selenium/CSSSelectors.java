package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#search_query_top"));
		driver.findElement(By.cssSelector("div#header_logo>a>img"));
		driver.findElement(By.cssSelector("a[href^='http://automationpractice.com']"));  //element with attribute href that starts with
		driver.findElement(By.cssSelector("a[href$='index.pdp']"));
		driver.findElement(By.cssSelector("a[href*='w3schools']"));   //element with attribute href that contains w3schools
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
		driver.findElement(By.cssSelector(""));
	}
}
