package com.Java;

public class Variables {
	
	static int x = 50; //instance variable  
	static int y = 100; //static variable 
	
	public void method1() {  
		int z = 90; //local variable
		System.out.println(x);
		//System.out.println(y);
	}
	
	public static void method2() {
		System.out.println(x);
		char[] z = null;
		System.out.println(z);
		
	}
	
	public static void main(String args[]) throws Exception {
		
		method2();
	}
	

}
