package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	
	@Test
	@Parameters("Goat")
	public void athlete(String value) {
		
		
		System.out.println("name of the athlete is:"+value);
		
		
		

	}
	
	
	
	
	
	

}
