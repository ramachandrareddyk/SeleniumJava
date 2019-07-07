package com.SeleniumWeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_WebTable {

	private static WebDriver driver;
	
	public static void datePicker() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement ele:allDates) {			
			String date=ele.getText();
			if(date.equalsIgnoreCase("28")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	public static void webTable() throws Exception {
		//Printing all the countries in the displayed web table
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> countries = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		for(WebElement country : countries) {
			System.out.println(country.getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void main(String args[]) throws Exception {
		//datePicker();
		webTable();
	}
}
