package com.Java;

public class Methods {

	public static void methodA() {
		System.out.println("Method A");
	}
	
	public static int methodB() {
		int a = 10;
		return a;
	}
	
	public static void methodD(int x, int y) {
		System.out.println(x+y);//110
	}
	
	public static void main(String args[]) throws Exception{
		System.out.println("Welcome");
		methodA();
		int b = methodB();
		System.out.println(b);
		methodD(10,  30);
		
	}
}
