package com.Java;

public class Super1 {

	Super1(){
		System.out.println("parent class constructor");
	} 
	
	Super1(int x){
		System.out.println("parameterized parent class constructor" + x);
	}
	
	public static void test() {
		System.out.println("test");
	}
}
