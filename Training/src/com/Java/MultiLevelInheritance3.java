package com.Java;

public class MultiLevelInheritance3 extends MultiLevelInheritance2 {
	
	public static void sleep() {
		System.out.println("sleeping...");
	}
	
	public static void main(String args[]){  
	   eat();
	   bark();
	   sleep();
	}  
}
