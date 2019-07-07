package com.Java;

import java.util.Scanner;

public class Loops {

	static Scanner sc = new Scanner(System.in);
	
	//For loop
	public static void printNumbers() throws Exception {
		System.out.println("Print numbers till:");
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}
	
	//For-each loop
	public static void forEachTest() throws Exception {
		int arr[]={12,23,44,56,78};  
		for(int i:arr){  
	        System.out.println(i);  
	    } 
			
		
		
	}
	
	//while loop
	public static void whileTest() throws Exception {
		System.out.println("Enter the gender:");
		String gender = sc.next();
		while(gender.equalsIgnoreCase("male")) {
			System.out.println("Re-enter the gender:");
			gender = sc.next();
		}
		
	}
	
	//do while loop
	public static void doWhileTest() throws Exception {
		System.out.println("Enter the gender:");
		String gender = sc.next();
		do {
			System.out.println("Gender entered is:"+gender);
			System.out.println("Re-enter the gender:");
			gender = sc.next();
		} while(gender.equalsIgnoreCase("male"));
	}
	
	
		
	public static void main(String args[]) throws Exception {
		//printNumbers();
		//forEachTest();
		//whileTest();
		doWhileTest();
	}
}
