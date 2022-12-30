package com.TestNG;

import org.testng.annotations.Test;

public class Skip_A_Testcase {
	
	
	@Test(priority = 0)
	private void startthebike() {
		
		System.out.println("Bike has been started");

	}

	@Test(priority = 1)
	private void putfirstgear() {
		System.out.println("first gear changed");

	}
	

	@Test(priority = 2)
	private void putsecondgear() {
		System.out.println("second gear changed");
		

	}
	

	@Test(priority = 3,enabled = false)
	private void putthirdgear() {
		System.out.println("third gear changed");
		

	}
	

	@Test(priority = 4)
	private void applybrake() {
		System.out.println("Brake has been applied");
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
