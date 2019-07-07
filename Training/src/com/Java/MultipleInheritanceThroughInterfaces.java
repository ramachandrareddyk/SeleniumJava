package com.Java;

public class MultipleInheritanceThroughInterfaces implements interface1, interface2{
	public void add() {
		System.out.println(10+20);
	}
	
	public void subtract() {
		System.out.println(20-10);
	}
	
	public void multiply() {
		System.out.println(10*20);
	}
	
	public void divide() {
		System.out.println(20/10);
	}
	
	public static void main(String args[]) throws Exception {
		MultipleInheritanceThroughInterfaces m = new MultipleInheritanceThroughInterfaces();
		m.add();
		m.subtract();
		m.multiply();
		m.divide();
	}
}

interface interface1 {
	void add();
	void subtract();
}

interface interface2 {
	void multiply();
	void divide();
}

interface interface3 extends interface1, interface2 {
	void mod();
}

