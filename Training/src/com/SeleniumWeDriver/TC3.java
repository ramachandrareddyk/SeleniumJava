package com.SeleniumWeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		//Open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open amazon site
		driver.get("https://www.amazon.com/");
		
		//Invalid registration
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createAccountSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@class='a-alert-content'][contains(text(),'Enter your name')]")).isDisplayed())
			System.out.println("Error message for username field is displayed");
		if(driver.findElement(By.xpath("//div[@class='a-alert-content'][contains(text(),'Enter your email')]")).isDisplayed())
			System.out.println("Error message for email field is displayed");
		if(driver.findElement(By.xpath("//div[@class='a-alert-content'][contains(text(),'Enter your password')]")).isDisplayed())
			System.out.println("Error message for password field is displayed");
		
		//close the browser
		driver.quit();
	}
}
