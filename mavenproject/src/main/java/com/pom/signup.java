package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signup {
	
	
	public static WebDriver driver;
	
	

	@FindBy(name = "firstname")
	private WebElement firstname;
	
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "reg_email__")
	private WebElement phno;
	
	@FindBy(id = "password_step_input")
	private WebElement pass;
	
	@FindBy(name = "birthday_day")
	private WebElement day;
	
	@FindBy(name = "birthday_month")
	private WebElement month;
	
	@FindBy(name = "birthday_year")
	private WebElement year;
	
	@FindBy(xpath = "(//label[@class='_58mt'])[2]")
	private WebElement gender;
	
	@FindBy(name = "websubmit")
	private WebElement submit;
	
	public signup(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver2, this);
	
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
