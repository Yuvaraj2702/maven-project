package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	
	public static WebDriver driver;
	

	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createaccount;
	
	public Loginpage(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);

	
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
