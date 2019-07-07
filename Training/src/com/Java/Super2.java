package com.Java;

public class Super2 extends Super1 {
int i;
	Super2() {
		super();
		//super(2); //constructor
		
		super.test(); //
		test();
		System.out.println("Child class constructor");
	}
	
	/*public void testing() {
		super();
	}*/
	
	public static void main(String args[]) throws Exception {
		
		
		Super2 s = new Super2();//
		s.test();
		
		
	}
}
