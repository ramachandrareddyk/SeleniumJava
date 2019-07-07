package com.Java.WorkOutExamples;

public class AdditionOfAllEvenNumbers {

	public static  void main(String args[]) {
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			if(i%2==0) {
				count = count + i;
			}
		}
		System.out.println("Sum of all even numbers:" + count);
	}
}
