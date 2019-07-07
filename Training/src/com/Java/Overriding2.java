package com.Java;

public class Overriding2 extends Overriding1 {

	public static void myMethod() {
		System.out.println("Modified parent method in child class");
	}  
	
	public static void main(String[] args){  
		/*Overriding1 o1 = new Overriding1();
		o1.myMethod();*/
		myMethod();
		myMethod();
		
		
	}
}
