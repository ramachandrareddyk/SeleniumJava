package com.Java;

public class Overloading {

	static int add(int a, int b) {
		return a+b;
	}  
	static String add(String a, String b) {
		return a+b;
	}
	static int add(int a, int b, int c) {
		return a+b+c;
		
	}
	  
	
	public static void main(String[] args){  
		System.out.println(add(11,11));  
		System.out.println(add("A","B")); 
		System.out.println(add(1,2,3));
	}
}
