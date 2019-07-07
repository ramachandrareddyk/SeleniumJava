package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HandlingAlerts {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(5000);
		WebElement alertButton = driver.findElement(By.id("alert"));
		alertButton.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();//ok button
//		alert.dismiss();              
		//driver.quit();
		
	}
}
