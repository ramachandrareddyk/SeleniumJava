package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='classFrame']")));
		action.contextClick(driver.findElement(By.linkText("com.thoughtworks.selenium"))).perform();
		
	}
}
