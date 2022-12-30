package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SDP {
	
	public static WebDriver driver;
	
	private Loginpage l;
	
	private signup s;
	
	public SDP(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public Loginpage getlogoin() {
		
		 l = new Loginpage(driver);	
		
		return l;
	}
	
	
	public signup getsignup() {

		 s = new signup(driver);
		
		return s;
	}
	
	
	
	
	
	
	

}
