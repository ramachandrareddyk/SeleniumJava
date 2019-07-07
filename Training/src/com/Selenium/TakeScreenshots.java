package com.Selenium;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeScreenshots {

	private static WebDriver driver;
	
	public static void main(String args[]) throws Exception {
		//random number generation
		Random rand = new Random();
		int random_number = rand.nextInt(1000);
				
		//Open the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				
		//Open application
		driver.get("http://automationpractice.com/index.php");
		takeScreenshots("application.png");
				
		//Click Sign in button
		driver.findElement(By.className("login")).click();
		
		//wait for create account section to be displayed. Enter email id and click Create Account button
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("create-account_form")));
		takeScreenshots("CreateAccountSection.png");
		driver.findElement(By.id("email_create")).sendKeys("testmail"+random_number+"@testmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
				
		//wait for page to load and continue registration
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("account-creation_form")));
		takeScreenshots("AccountCreationForm.png");
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("FName");
		driver.findElement(By.id("customer_lastname")).sendKeys("LName");
		driver.findElement(By.id("passwd")).sendKeys("Test@123");
		driver.findElement(By.id("firstname")).sendKeys("FName");
		driver.findElement(By.id("lastname")).sendKeys("LName");
		driver.findElement(By.id("address1")).sendKeys("TestAddress1");
		driver.findElement(By.id("city")).sendKeys("Amlin");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Ohio");
		driver.findElement(By.id("postcode")).sendKeys("43002");
		driver.findElement(By.id("phone_mobile")).sendKeys("9978098765");
		driver.findElement(By.id("alias")).sendKeys("test@testy.com");
		driver.findElement(By.id("submitAccount")).click();
		
		//Verify if my account section is displayed
		assertTrue(driver.findElement(By.xpath("//h1[.='My account']")).isDisplayed());
		takeScreenshots("MyAccount.png");	
		//close the browser
		driver.quit();
	}
	
	public static void takeScreenshots(String filename) throws Exception {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("Screenshots/"+filename));
	}
}
