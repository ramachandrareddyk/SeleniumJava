package com.Java;

import java.util.Scanner;

public class ConditionalStatements {

	static Scanner sc = new Scanner(System.in);
	
	//If statement
	public static void checkAgeToVote() throws Exception {
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("You are eligible to vote");
		}
		
	}
	
	//If-else
	public static void checkEvenOrOdd() throws Exception {
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}
	
	//If-else-if ladder
	public static void checkGradeOfStudent() throws Exception {
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		if(marks < 50){  
	        System.out.println("fail");  
	    }  
	    else if(marks >= 50 && marks < 60){  
	        System.out.println("D grade");  
	    }  
	    else if(marks >= 60 && marks < 70){  
	        System.out.println("C grade");  
	    }  
	    else if(marks >= 70 && marks < 80){  
	        System.out.println("B grade");  
	    }  
	    else if(marks >= 80 && marks < 90){  
	        System.out.println("A grade");  
	    }else if(marks >= 90 && marks < 100){  
	        System.out.println("A+ grade");  
	    }else{  
	        System.out.println("Invalid entry!");  
	    }  
	}
	
	public static void checkEvenOrodd_Switch() throws Exception {
		System.out.println("Enter number:");
		int number = sc.nextInt()%2;
		
		switch(number) {
		case 0: System.out.println("Even");
		           break;
		default: System.out.println("Odd");
        			break;
		}
	}
	
	//switch
	public static void displayDayOfWeek() throws Exception {
		System.out.println("Enter the day of the week: (1-7)");
		int day = sc.nextInt();
		switch(day) {
		case 1: System.out.println("It's Monday");
				break;
		case 2: System.out.println("It's Tuesday");
		  		break;
		case 3: System.out.println("It's Wednesday");
  				break;
		case 4: System.out.println("It's Thursday");
  				break;
		case 5: System.out.println("It's Friday");
				System.out.println("Test");
  				break;
		case 6: System.out.println("It's Saturday");
  				break;
		case 7: System.out.println("It's Sunday");
  				break;
  		default: System.out.println("Invalid entry");
  		 		break;
		}
	}
	
	public static void main(String[] args) throws Exception {
		//checkAgeToVote();
		//checkEvenOrOdd();
		//checkGradeOfStudent();
		displayDayOfWeek();
	}
}
