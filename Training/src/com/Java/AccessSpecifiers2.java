package com.Java;

public class AccessSpecifiers2  {

	public static void main(String args[]) throws Exception {
		AccessSpecifiers1 a = new AccessSpecifiers1(); //object creation
		a.method1(); //public 
		a.method3(); //child
		a.method4(); //within same package
	}
	
}
