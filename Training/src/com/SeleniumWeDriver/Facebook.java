package com.SeleniumWeDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		//Open the browser . Set cromeoptions to disable the notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//open facebook site
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("suji.gm@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("facebookpswd");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
				
		//close the browser
		driver.quit();
	}
}
