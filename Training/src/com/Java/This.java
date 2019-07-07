package com.Java;

public class This {
	
	int rollno;  // memeber of this class 
	String name;  
	float fee;  
	
	This(int rollno,String name){ 
		rollno = rollno;  
		name = name;  
	}
	
	This(int rollno,String name, float fee){  
		this.rollno = rollno;  
		this.name = name;  
		this.fee = fee;  
	}
	
	void display_Without_This(){
		System.out.println(rollno+" "+name);  
	}
	
	void display_With_This(){
		System.out.println(rollno+" "+name+" "+fee);  
	}
	
	public static void main(String args[]){  
		//This t1 = new This(111,"ankit");
		This t2 = new This(111,"ankit",5000);
		//t1.display_Without_This();
		t2.display_With_This();
	}
	
}
