package com.TestNG;

import org.testng.annotations.Test;

public class IgnoreTest {

	@Test(enabled=false)
	public void testCase1() {
	      System.out.println("in test case 1");
	}
	
	@Test(enabled=true)
	public void testCase2() {
	      System.out.println("in test case 2");
	}
	
	
}
