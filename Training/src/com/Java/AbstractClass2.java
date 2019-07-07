package com.Java;

public class AbstractClass2 extends AbstractClass1 {

	public void eat(){
		System.out.println("test");
	}
	
	public static void main(String args[]) {
		AbstractClass2 a2 = new AbstractClass2();
		a2.eat();
		a2.bark();
	}
}
