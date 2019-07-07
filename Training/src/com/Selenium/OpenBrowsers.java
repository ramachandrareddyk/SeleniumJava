package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowsers {

	private static WebDriver driver;
	
	public static void openFirefox() throws Exception {
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	public static void openChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void openIE() throws Exception {
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	
	

	public static void main(String args[]) throws Exception {
		openFirefox();
		//openChrome();
		//openIE();
		driver.manage().window().maximize(); //maximize the browser
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("testuser@testmail.com");
		
		
		
		//driver.navigate().to("http://www.google.com");*/
	}
}
