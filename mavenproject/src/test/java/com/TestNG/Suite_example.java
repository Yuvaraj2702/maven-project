package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite_example {
	
	
	
	
	public static WebDriver driver;
	
	public static long Starttime;
	
	public static long endtime;
	
	
	@BeforeSuite
	public void openbrowser() {
		
		Starttime = System.currentTimeMillis();
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajuv\\eclipse-workspace\\mavenproject\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
			
		
	}
	
	
    @Test(priority = 0)
	public void opengoogle() {
		
		driver.get("https://www.google.com/");
	
	}
	
	
    @Test(priority = 2)
	public void openamazon() {
		
		driver.get("https://www.amazon.in/");	
	}
	
    @Test(priority = 1)
	public void openfacebook() {

		driver.get("https://www.facebook.com");

	}
	
	@AfterSuite
	public void closebrowser() {
		
		driver.quit();

		long endtime =	System.currentTimeMillis();
		
	      long Totaltime = endtime-Starttime;
	      
	      System.out.println("total time taken is :"+ Totaltime);
	           	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
