package com.Java;

import java.io.*;

public class ExceptionHandling {

	public void divide() {
		try {
			System.out.println(2/0);
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Catch block is executing");
		}
		finally {
			System.out.println("Finally block always gets executed");
		}
	}
	
	public void testThrows() throws Exception {
		//code
	}
	
	public void methodA() throws Exception{
		testThrows();
	}
	
	public void testAgeToVote() throws IOException {
		int age = 12;
		if(age < 18) {
			throw new IOException("Invalid age");
		}
	}
	
	public static void main(String args[]) throws Exception {
		ExceptionHandling eh = new ExceptionHandling();
		//eh.divide();
		eh.testAgeToVote();
	}
	
}