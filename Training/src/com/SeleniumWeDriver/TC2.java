package com.SeleniumWeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		//Open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open amazon site
		driver.get("https://www.amazon.com/");
		
		//Search for a product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dove"+Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class='s-access-image cfMarker']/ancestor::a)[5]")).click();
		
		if(driver.findElement(By.xpath("//span[@id='availability']")).isDisplayed()) {
			System.out.println("Selected product is available");
		}
		else {
			System.out.println("Selected product is out of stock");
		}
		
		//close the browser
		driver.quit();
	}
}
