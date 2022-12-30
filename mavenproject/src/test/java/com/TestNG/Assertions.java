package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertions {
	
	
	String name = "messi";
	//boolean value = true;
	
	
	@Test
	public void Goat() {
		
		/*
		 * if (name.equals("messi")) { System.out.println("messi is the goat"); } else {
		 * System.out.println("messi is not a goat"); }
		 */
		
		Assert.assertNotEquals(name, "Messi");
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
