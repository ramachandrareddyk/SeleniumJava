package com.Java;

public class Arrays {

	public static void singleDimensionalArray() throws Exception {
		int a[]= new int[5]; //
		a[0] = 10;  
		a[1] = 20;  
		a[2] = 70;  
		a[3] = 40;  
		a[4] = 50;  
		  
		//printing array  
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);  
		}
	}
	
	public static void multipleDimensionalArray() throws Exception {
		
		int arr[][] = new int[2][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		for(int i = 0; i <=1; i++) {
			for(int j = 0; j <=1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) throws Exception {
		//singleDimensionalArray();
		multipleDimensionalArray();
	}

}
