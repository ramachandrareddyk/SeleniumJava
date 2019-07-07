package com.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assertions {

	@Test
	public void testAnnotations() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 8;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
	    String[] resultArray =  {"one", "two", "three8"};
	    
	    //check that a condition is true
	    assertTrue(val1 > val2);
	    //assertFalse(val1 > val2);  //
	    //check that a condition is false
	    assertFalse(val1 < val2); 
	    
	    //check that an object is not null
	    assertNotNull(str1);
	    
	    //check that an object is null
	    assertNull(str3);
	    
	    //check that two arrays are same
	    assertArrayEquals(expectedArray, resultArray);
	    
	    assertEquals("exp", "act");
	    
	    }
}
