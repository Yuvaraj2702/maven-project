package com.TestNG;

import org.testng.annotations.Test;

public class Dependencies {

	@Test(dependsOnMethods = "tickedbooked")
	private void goingtomovie() {
		
		System.out.println("going to movie");
		

	}
	@Test(enabled = true)
	private void tickedbooked() {
		System.out.println("ticked has been booked");

	}
	@Test(dependsOnMethods = "goingtomovie")
	private void moviewatched() {
		System.out.println("movie has been watched");

	}
	@Test(dependsOnMethods = "moviewatched")
	private void returnedhome() {
		
		System.out.println("returned home");
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
