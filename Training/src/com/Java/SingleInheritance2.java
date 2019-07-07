package com.Java;

public class SingleInheritance2 extends SingleInheritance1 {
	
	public  void bark() {
		
		System.out.println("barking...");
		
	}
	
	public static void eat(){
		System.out.println("renote eating...");
	} 
	
	
	public static void main(String args[] ){
		super.bark();
		eat();
		
	}  
}
