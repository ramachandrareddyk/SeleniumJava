package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
		//Scroll by visibility of an element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*WebElement ele = driver.findElement(By.xpath("//h1[contains(.,'Automation Practice Website')]"));
		js.executeScript("arguments[0].scrollIntoView();", ele);*/
		
		//Scroll by pixel
		js.executeScript("window.scrollBy(0,1000)");
		 
		 //Scroll till the bottom of the page
		 //js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
}
