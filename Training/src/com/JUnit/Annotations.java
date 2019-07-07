package com.JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Annotations {

	@BeforeClass
	public static void adt() {
		System.out.println("in before class"); //firefox
	}

	@BeforeClass
	public static void bedt() {
		System.out.println("in before class1"); //chrome
	}
	
	@AfterClass
	 public static void  afterClass() {
		 System.out.println("in after class");
	 }
	
	 @AfterClass
	 public static void  afterClass1() {
		 System.out.println("in after class1");
	 }

	 @Before
	 public void before() {
		 System.out.println("in before");
	 }
		
	 @After
	 public void after() {
		 System.out.println("in after");
	 }
		
	 @Test
	 public void testCase1() {
		 System.out.println("in test case 1");
	 }

	 
	 public void testCase2() {
		 System.out.println("in test case 2");
	 }
	 
	 @Test
	 public void testCase3() {
		 System.out.println("in test case 3");
	 }
	 
	 @Test(timeout=1000)
	 public void testCase4() {
		 System.out.println("in test case 3");
	 }
	 
	 @Test()
	 public void testCase5() {
		 System.out.println("A");
		 System.out.println(1/0);
		 System.out.println("B");
	 }
	 
	 
	 @Test()
	 public void testCase6() {
		 System.out.println("A");
		 System.out.println("B");
	 }
	 @Ignore
	 public void test() {
		 
	 }
}
