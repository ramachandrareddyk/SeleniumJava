package com.Java.WorkOutExamples;

import java.util.Scanner;

public class MatrixMultiplication {

	static Scanner sc = new Scanner(System.in);
	
	public static void multiplyMatrix() throws Exception {
		System.out.println("Enter base of a squared matrix :");
		int n = sc.nextInt();
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		int[][] arr3 = new int[n][n];
		System.out.println("Enter your first matrix:");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter your second matrix:");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr2[i][j] = sc.nextInt();
				}
			}
			//Display the first matrix
			System.out.println("First matrix entered : ");
			for(int i = 0; i < n; i++) {
				System.out.print("[");
				for(int j = 0; j < n; j++) {
					System.out.print(arr1[i][j] + " ");
				}
				System.out.print("]");
				System.out.println();
			}
			//Display the second matrix
			System.out.println("Second matrix entered : ");
			for(int i = 0; i < n; i++) {
				System.out.print("[");
				for(int j = 0; j < n; j++) {
					System.out.print(arr2[i][j] + " ");
				}
				System.out.print("]");
				System.out.println();
			}
			
			//Multiplication logic
			for(int i = 0; i < n; i++) {
				for(int j = 0 ; j < n; j++) {
					for(int k = 0; k < n; k++) {
						arr3[i][j] = arr3[i][j]+arr1[i][k]*arr2[k][j];
					}
				}
			}
			
			//Display the product
			System.out.println("Matrix multiplication..");
			for(int i = 0; i < n; i++) {
				System.out.print("[");
				for(int j = 0; j < n; j++) {
					System.out.print(arr3[i][j] + " ");
				}
				System.out.print("]");
				System.out.println();
			}
				
			
		}
	
	
	public static void main(String args[]) throws Exception {
		multiplyMatrix();
	}
}
