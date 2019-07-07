package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(5000);
		//driver.switchTo().frame("packageFrame");
		//driver.switchTo().frame("packageFrame");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='packageFrame']")));
		driver.findElement(By.linkText("Action")).click();
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='packageListFrame']")));
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	}
}
