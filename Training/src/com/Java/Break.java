package com.Java;

public class Break {

	public static void breakLoop() throws Exception {
		for(int i= 1; i <= 10; i++){  
	        if(i == 5){  
	            break;  
	        }  
	       System.out.println(i);  
		}
	}
	
	public static void breakInnerLoop() throws Exception {
        for(int i = 1; i <= 3; i++){    
            for(int j = 1; j <= 3; j++){    
                if(i == 2 && j == 2){    
                    break;    
                }    
                System.out.println(i+" "+j);    
            }    
        }    
	}
		
	public static void main(String[] args) throws Exception {  
		  //breakLoop();
		  breakInnerLoop();
	}

}
