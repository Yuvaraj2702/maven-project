package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_testing {
	
	
	@Test
	public void openfacebook() {
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajuv\\eclipse-workspace\\mavenproject\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
				
		    driver.get("https://www.facebook.com");
		    driver.close();
		
	}
	
	@Test
	public void openamazon() {


	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajuv\\eclipse-workspace\\mavenproject\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
				
		    driver.get("https://www.amazon.in/");
		    driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
