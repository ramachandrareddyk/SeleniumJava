package com.TestNG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

public class DependencyTest {
	
	@Test(dependsOnMethods = { "testMethodF" })
	 public void testMethodA() {
		 System.out.println("in test method A");
		 assertTrue(true);
	 }

	 @Test(dependsOnMethods = { "testMethodA" })
	 public void testMethodB() {
		 System.out.println("in test method B");
		 assertTrue(false); //assertion failure
	 }

	 @Test(dependsOnMethods = { "testMethodB" })
	 public void testMethodC() {
		 System.out.println("in test method C");
	 }
  
}