package com.Java.WorkOutExamples;

public class PrintStars {
	
	public static void printStars() throws Exception {
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String args[]) throws Exception {
		printStars();
	}
}
