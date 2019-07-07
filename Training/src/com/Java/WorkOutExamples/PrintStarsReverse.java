package com.Java.WorkOutExamples;

public class PrintStarsReverse {

	public static void main(String args[]) throws Exception {
		for(int i = 5; i >=1; i--) {
			for(int j = 0; j <=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
