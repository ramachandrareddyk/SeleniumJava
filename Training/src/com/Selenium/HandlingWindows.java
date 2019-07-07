package com.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(5000);
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle:"+ parentWindowHandle);
		WebElement browserWindow = driver.findElement(By.id("button1"));
		browserWindow.click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		String childWindow = null;
		for(String window : windows) {
			System.out.println("Two windows:" + window);
			if(!(window.equals(parentWindowHandle))) {
				childWindow = window;
			}
		}
		System.out.println("Child window:" + childWindow);
		driver.switchTo().window(childWindow); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'Agile Testing and ATDD Automation')]"));
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.quit();
	}
}
