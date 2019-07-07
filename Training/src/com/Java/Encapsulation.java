package com.Java;

public class Encapsulation {

	private String name;  
	   
	public String getName(){  
		return name;  
	}  
	
	public void setName(String name){  
		this.name = name ; 
	}
	
	public static void main(String args[]) throws Exception {
		Encapsulation e = new Encapsulation();
		e.setName("Sunil");
		e.getName();
	}
}
