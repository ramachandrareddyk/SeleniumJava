package com.Java.WorkOutExamples;

import java.util.Scanner;

public class CheckEvenOrOdd {

	static Scanner sc = new Scanner(System.in);
	
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
	
	public static void main(String args[]) throws Exception {
		checkEvenOrOdd();
	}

}
