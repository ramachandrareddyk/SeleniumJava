package com.Java;

public class Static {

static int speedlimit = 10;
static int y = 20;

public static void add() {
	System.out.println(speedlimit);
	
}
	
    static {  
        System.out.println("static block is invoked");  
    }
    
    public static void main(String args[]) throws Exception {
    	System.out.println(y);
    	add();
    	System.out.println(speedlimit);
    }
}
