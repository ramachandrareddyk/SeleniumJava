package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Commands {
	
	private static WebDriver driver;

	public static void openChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void maximizeBrowser() throws Exception {
		driver.manage().window().maximize();
	}
	
	public static void openApplication(String url) throws Exception {
		driver.get(url);
	}
	
	public static void testNavigate() throws Exception {
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(5000);
		driver.navigate().to("http://www.google.com");
		//Thread.sleep(2000);

		Thread.sleep(5000);
		driver.navigate().back(); //gmail to be opened
		Thread.sleep(5000);
		driver.navigate().forward(); //google to be opened
	}
	
	public static void closeBrowser() throws Exception {
		driver.quit();
		//driver.close();
	}
			
	public static void main(String args[]) throws Exception {
		openChrome();
		maximizeBrowser();
		//openApplication("http://automationpractice.com/");
		testNavigate();
		//Thread.sleep(3000);
		//closeBrowser();
		
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.id(""))).build().perform();
	}
}
