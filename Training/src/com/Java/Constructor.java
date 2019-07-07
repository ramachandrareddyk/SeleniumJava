package com.Java;

public class Constructor {
	
	int a;
	int b;
	
	public Constructor() {
    	System.out.println("Constructor is called");
    }  
    
	public Constructor(int x) {
    	System.out.println("Parameterized constructor is called :" + x);
    } 
    
	public Constructor(int x, int y) {
    	System.out.println("Parameterized constructor is called :" + x+y);
    }
	
    public static void test() {
    	System.out.println("This is a test method");
    }
        
    public static void main(String args[]){
    	Constructor c1 = new Constructor(); //object is created. Default constructor will be called
    	Constructor c2 = new Constructor(10);  //object is created. parameterized constructor will be called
    	Constructor c3 = new Constructor(10, 20);
    	
    	
    }   

}
