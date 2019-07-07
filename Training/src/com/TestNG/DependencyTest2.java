package com.TestNG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

public class DependencyTest2 {
	
	@Test
	 public void testMethodF() {
		 System.out.println("in test method F");
		 assertTrue(true);
	 }

	  
}