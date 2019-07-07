package com.SeleniumWeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		//Open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//open amazon site
		driver.get("https://www.amazon.com/");
		
		//Search for a product
		int count = 0;
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dove"+Keys.ENTER);
		List<WebElement> products = driver.findElements(By.xpath("//h2[contains(@class,'a-size-base')]"));
		for(WebElement ele : products) {
			if(ele.getText().contains("Dove")) {
				System.out.println("Matched product: " + ele.getText());
				count++;
			}
			else
				System.out.println("Mismatched product: " + ele.getText());
		}
		System.out.println("Total number of products matching the search criteria:" + count);
		
		//close the browser
		driver.quit();
	}
}
