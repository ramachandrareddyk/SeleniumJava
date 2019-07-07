package com.Java.WorkOutExamples;

import java.util.Scanner;

public class CheckAgeToVote {

	static Scanner sc = new Scanner(System.in);
	
	public static void checkAgeToVote() throws Exception {
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		if(age < 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}
	
	public static void main(String[] args[]) throws Exception {
		checkAgeToVote();
	}
}
