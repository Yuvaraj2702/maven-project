package com.TestNG;

import org.testng.annotations.Test;

public class Grouping_examples {

	@Test(groups = {"cricketer"})
	private void Dhoni() {
	
		System.out.println("MSD");

	}
	@Test(groups = {"cricketer"})
	private void virat() {
		System.out.println("VK");

	}
	
	@Test(groups = {"Footballer"})
	private void messi() {
		System.out.println("LM10");

	}
	@Test(groups = {"Footballer"})
	private void ronaldo() {
		System.out.println("CR7");

	}
	@Test(groups = {"F1 racer"})
	private void verstappen() {
		System.out.println("MV");

	}
	
	@Test(groups = {"F1 racer"})
   private void hamilton() {
	   System.out.println("LH");

}
	@Test(groups = {"Tennis"})
   private void roger() {
	   System.out.println("RF");

}
	
	@Test(groups = {"Tennis"})
   private void rafa() {
	   System.out.println("RN");

}	
	
}
