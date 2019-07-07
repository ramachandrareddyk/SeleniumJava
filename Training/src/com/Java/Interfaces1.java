package com.Java;

public class Interfaces1 implements myInterface {

	public void add() {
		System.out.println(x);
		System.out.println(10+20);
	}
	
	public void subtract() {
		System.out.println(20-10);
	}
	
}

interface myInterface{
	int x = 10;
	void add();
	void subtract();

}

interface myInterface2 {
	void multiply();
	void divide();
}
