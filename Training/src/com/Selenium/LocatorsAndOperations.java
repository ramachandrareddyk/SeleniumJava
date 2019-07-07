package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatorsAndOperations {

	private static WebDriver driver;
	
	public static void openApplication() throws Exception {
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
	}
	
	public static void findById() throws Exception {
		WebElement searchInput = driver.findElement(By.id("search_query_top"));
		searchInput.clear();
		searchInput.sendKeys("party wear");
		searchInput.isDisplayed();   //boolean 
		searchInput.isEnabled();
		
	}
	
	public static void findByName() throws Exception {
		WebElement searchButton = driver.findElement(By.name("submit_search"));
		Actions action = new Actions(driver);
		action.moveToElement(searchButton).contextClick(searchButton).build().perform();
		searchButton.click();
		searchButton.isEnabled();
		
	}
	
	public static void findByClass() throws Exception {
		WebElement resultsFoundLbl = driver.findElement(By.className("heading-counter"));
	}
	
	public static void getText() throws Exception {
		WebElement resultsFoundLbl = driver.findElement(By.className("heading-counter"));
		System.out.println(resultsFoundLbl.getText());
	}
	
	public static void findByLinkText() throws Exception {
		WebElement signInLink = driver.findElement(By.linkText("Get support"));
		signInLink.click();
	}
	
	public static void findByPartialLinkText() throws Exception {
		WebElement signInLink = driver.findElement(By.partialLinkText("Sign"));
		signInLink.click();
	}
	
	public static void findByTagName() throws Exception {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		/*for(WebElement x : links) {
			System.out.println(x.getText());
		}*/
		for(int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
	}
	
	public static void findByCSSSelector() throws Exception {
		WebElement searchField = driver.findElement(By.cssSelector("#search_query_top"));
		WebElement cart = driver.findElement(By.cssSelector(".shopping_cart>a"));
		cart.getText(); //
	}
	
	public static void findByXPATH() throws Exception {
		WebElement searchField = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		WebElement cart = driver.findElement(By.xpath("//div[@class='shopping_cart']/a[@title='View my shopping cart']"));
		driver.findElement(By.xpath("//sup[text()='*']/ancestor::label[@for='passwd']")).findElement(By.xpath(".//*[@id='homefeatured']//li//a[@title='Blouse']/following-sibling::div/span[contains(@class,'price')]"));
	}
	
	public static void isDisplayed() throws Exception {
		WebElement searchField = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		searchField.isDisplayed();
		WebElement cart = driver.findElement(By.cssSelector(".shopping_cart>a"));
		cart.isEnabled();
		cart.isSelected();
	}
	
	public static void main(String[] args) throws Exception {
		openApplication();
		findById();
		findByName();
		findByClass();
		getText();
		findByLinkText();
		//findByPartialLinkText();
		findByTagName();
		findByCSSSelector();
		findByXPATH();
		isDisplayed();
		WebElement registerlink = driver.findElement(By.className("ico-register"));
		registerlink.click();
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("search_query_top"));
		WebElement search = driver.findElement(By.name("submit_search"));
		List<WebElement>links = driver.findElements(By.tagName("a"));
		driver.findElement(By.linkText("Contact us"));
		driver.findElement(By.partialLinkText("Contact"));
		driver.findElement(By.cssSelector("#search_query_top"));
		
	}

}
