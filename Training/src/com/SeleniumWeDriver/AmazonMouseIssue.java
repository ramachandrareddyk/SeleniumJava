package com.SeleniumWeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseIssue {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Departments"))).perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//span/span[@class='nav-text'][text()='Prime Video']"))).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
