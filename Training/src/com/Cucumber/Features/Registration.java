package com.Cucumber.Features;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Registration {

	public WebDriver driver;
	
	@Given("user opens the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("User opens the application")
	public void openAppication() {
		driver.get("http://automationpractice.com/index.php");
	}
	
	@And("Click Signin in Home Page")
	public void clickSignIn() {
		driver.findElement(By.className("login")).click();
	}
	
	@And("Enter emaild id as '(.*)' in Create Account section")
	public void EnterEmail(String email) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("create-account_form")));
		driver.findElement(By.id("email_create")).sendKeys(email);
	}
	
	@And("Click CreateAccount in Create Account section")
	public void clickCreateAccount() {
		driver.findElement(By.id("SubmitCreate")).click();
	}
	
	@And("check if user is on home page")
	public void checkUserIsOnHomePage() {
		System.out.println("Home page");
	}
	
	@And("Check if registration page is displayed")
	public void checkUserIsOnRegistrationPage() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("account-creation_form")));
	}
	
	@And("Click Mrs")
	public void clickMrs() {
		driver.findElement(By.id("id_gender2")).click();
	}
	
	@And("Enter '(.*)' as '(.*)'")
	public void enterRegisterDetails(String element, String value) {
		switch(element) {
		case "Customer First Name": driver.findElement(By.id("customer_firstname")).sendKeys(value); break;
		case "Customer Last Name": driver.findElement(By.id("customer_lastname")).sendKeys(value); break;
		case "Customer Password": driver.findElement(By.id("passwd")).sendKeys(value); break;
		case "Address First Name": driver.findElement(By.id("firstname")).sendKeys(value); break;
		case "Address Last Name": driver.findElement(By.id("lastname")).sendKeys(value); break;
		case "Address": driver.findElement(By.id("address1")).sendKeys(value); break;
		case "City": driver.findElement(By.id("city")).sendKeys("Amlin"); break;
		case "State": 	Select state = new Select(driver.findElement(By.id("id_state")));
						state.selectByVisibleText("Ohio");
						break;
		case "PostCode": driver.findElement(By.id("postcode")).sendKeys("43002"); break;
		case "Mobile": driver.findElement(By.id("phone_mobile")).sendKeys("9978098765"); break;
		case "Alias": driver.findElement(By.id("alias")).sendKeys("test@testy.com"); break;
		
		}
	}
	
	@And("click submit button")
	public void clickSubmit() {
		driver.findElement(By.id("submitAccount")).click();
	}
	
	@And("check if My Account section is displayed")
	public void checkIfMyAccountIsDisplayed() {
		assertTrue(driver.findElement(By.xpath("//h1[.='My account']")).isDisplayed());
	}
	
	@And("Check if error message section is displayed")
	public void checkIfErrorIsDisplayed() {
		assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed());
	}
	
	@Then("Close the browser")
	public void closeBrowser(){
		driver.quit();
	}
	
}
