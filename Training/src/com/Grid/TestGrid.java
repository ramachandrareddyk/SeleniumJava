package com.Grid;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {

	private static WebDriver driver1;
	private static WebDriver driver2;
	
	public static void main(String[] args) throws Exception {
		String URL = "http://www.calculator.net";
		
		System.out.println(" Executing on chrome");
			String Node = "http://192.168.0.5:5555/wd/hub";
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setBrowserName("Chrome");
			cap.setVersion("63.0.3239.132");
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver1 = new RemoteWebDriver(new URL(Node), cap);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver1.navigate().to(URL);
			driver1.manage().window().maximize();
			
			/*System.out.println(" Executing on ie");
			DesiredCapabilities cap2 = DesiredCapabilities.internetExplorer();
			cap.setBrowserName("ie");
			driver2 = new RemoteWebDriver(new URL(Node), cap2);
			driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver2.navigate().to(URL);
			driver2.manage().window().maximize();*/
	}
}
