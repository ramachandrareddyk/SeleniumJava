package com.JUnit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	
	@Parameter
	public int n;
	
	
	public void checkEvenOrOdd(int number) {
		 if(number%2 == 0)
			 System.out.println(number + " is Even number");
		 else {
			 System.out.println(number + " is Odd number");
		}
		 
		 
	 }
	 
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {     
	                 { 1}, { 10 }, { 12 }, {20}  
	           });
	    }
	 
	 @Test
	 public void test() {
	        checkEvenOrOdd(n);
	  }
}
