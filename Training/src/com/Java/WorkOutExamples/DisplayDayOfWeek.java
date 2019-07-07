package com.Java.WorkOutExamples;

import java.util.Scanner;

public class DisplayDayOfWeek {

	static Scanner sc = new Scanner(System.in);
	
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
  				break;
		case 6: System.out.println("It's Saturday");
  				break;
		case 7: System.out.println("It's Sunday");
  				break;
  		default: System.out.println("Invalid entry");
  		 			break;
		}
	}
	
	public static void main(String args[]) throws Exception {
		displayDayOfWeek();
	}
}
