package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class ParameterizedTest {
	
	private WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public void printName(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			/*System.setProperty("webdriver.chrome.driver", "");
			driver = new ChromeDriver();*/
			System.out.println(browser);
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			//driver = new FirefoxDriver();
			System.out.println(browser);
		}
		else {
			//driver = new InternetExplorerDriver();
			System.out.println(browser);
		}
	}
	
	@DataProvider(name = "test1")
	public static Object[][] checkEven() {
	    return new Object[][] {{2}, {6}, {5}};
	}
	
	@Test(dataProvider = "test1")
	public void checkEvenOrOdd(int inputNumber) {
		if(inputNumber%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
 
}